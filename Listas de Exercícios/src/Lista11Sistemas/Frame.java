/*1. Implemente um sistema para uma lanchonete, esse sistema terá as seguintes opções:
	a. Cadastrar produtos (Nome e valor)
	b. Realizar pedidos
	c. Histórico – Exibir o nome do cliente, data, hora, produtos consumidos e quantidade
	d. Estatísticas – Poder listar todos os históricos e também realizar filtragens através de data
	ou nome dos clientes
	Nessas filtragens faça com que sejam exibidos os produtos e as quantidades vendidas em
	um determinado período, além de somar os valores ganhos.
	e. Sair – Finalizar o sistema
*/



package Lista11Sistemas;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.TableCellEditor;
import javax.swing.table.TableCellRenderer;

public class Frame {
	
	private static Lanchonete lanchonete;
	private static JTable tabelaEstoque;
	private static JTable tabelaPedido;
	private static JTable tabelaEstatisticas;
	
	public static JFrame getMainFrame(Lanchonete lanchonete) {
		
		Frame.lanchonete = lanchonete;
		
		JFrame frame = new JFrame();
		frame.setSize(316, 439);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(null);
		frame.setLocationRelativeTo(null);
		
		JButton btnCadastrar = getButton("Cadastrar Produto", frame, 25, 25, 1, 4);
		btnCadastrar.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				getCadastroFrame();
			}
		});
		frame.add(btnCadastrar);
	
		JButton btnPedidos = getButton("Realizar Pedidos", frame, 25, 25, 2, 4);
		btnPedidos.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				getPedidoFrame();
				
			}
		});
		frame.add(btnPedidos);
		
		JButton btnHistorico = getButton("Histórico", frame, 25, 25, 3, 4);
		frame.add(btnHistorico);
		btnHistorico.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				getHistoricoFrame();
			}
		});
		
		JButton btnEstatisticas = getButton("Estatísticas", frame, 25, 25, 4, 4);
		frame.add(btnEstatisticas);
		btnEstatisticas.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				getEstatisticasFrame();
				
			}
		});
		
		frame.setVisible(true);
		
		return frame;
	}

	public static JFrame getCadastroFrame() {
		
		JFrame frame = new JFrame();
		frame.setSize(416, 539);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.setLayout(null);
		frame.setLocationRelativeTo(null);
		
		JLabel lblNome = new JLabel("Nome");
		lblNome.setBounds(75, 25, 50, 25);
		
		SmartField edtNome = new SmartField();
		edtNome.setBounds(75, 50, 250, 25);
		edtNome.setHorizontalAlignment(SwingConstants.CENTER);
		
		JLabel lblValor = new JLabel("Valor");
		lblValor.setBounds(75, 75, 50, 25);
		SmartField edtValor = new SmartField(true, 0, Double.MAX_VALUE, 2);
		edtValor.setBounds(75, 100, 250, 25);
		edtValor.setHorizontalAlignment(SwingConstants.CENTER);
		
		JButton btnCadastrar = new JButton("Cadastrar");
		btnCadastrar.setBounds(100, 150, 200, 25);
		btnCadastrar.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				Main.cadastrarProduto(edtNome, edtValor);
			}
		});
		
		frame.add(lblNome);
		frame.add(edtNome);
		frame.add(lblValor);
		frame.add(edtValor);
		frame.add(getScrollPane());
		frame.add(btnCadastrar);
		
		frame.setVisible(true);
		
		return frame;
	}
	
	public static JFrame getPedidoFrame() {
		
		Pedido pedido = new Pedido();
		
		JFrame frame = new JFrame();
		frame.setSize(416, 359);
		frame.setLayout(null);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		
		JLabel lblNome = new JLabel("Cliente");
		lblNome.setBounds(25, 25, 150, 25);
		
		JLabel lblCarrinho = new JLabel("Produtos No Pedido");
		lblCarrinho.setBounds(25, 75, 150, 25);
		
		JTextField edtNome = new JTextField();
		edtNome.setBounds(25, 50, 150, 25);
		
		JButton btnSalvar = new JButton("Salvar");
		btnSalvar.setBounds(35, 265, 100, 25);
		btnSalvar.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				if (edtNome.getText().isEmpty()) {
					JOptionPane.showMessageDialog(null, "O nome do cliente não pode estar vazio");
					return;
				}
				
				pedido.setCliente(edtNome.getText());
				lanchonete.novoPedido(pedido);
				
				frame.dispose();
			}
		});
		
		JButton btnAdicionar = new JButton("Adicionar");
		btnAdicionar.setBounds(150, 265, 100, 25);
		btnAdicionar.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				getAddAoPedidoFrame(pedido);
			}
		});
		
		JButton btnRemover = new JButton("Remover");
		btnRemover.setBounds(265, 265, 100, 25);
		btnRemover.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				int index = Frame.tabelaPedido.getSelectedRow();
				
				pedido.removeCompra(index);
				Frame.tabelaPedido.setModel(pedido.getLista());
			}
		});
		
		frame.add(lblNome);
		frame.add(lblCarrinho);
		frame.add(edtNome);
		frame.add(btnSalvar);
		frame.add(btnAdicionar);
		frame.add(btnRemover);
		frame.add(getScrollPedido(pedido));
		
		frame.setVisible(true);
		
		return frame;
	}

	public static JFrame getAddAoPedidoFrame(Pedido pedido) {
		
		JFrame frame = new JFrame();
		frame.setSize(416, 309);
		frame.setLayout(null);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		
		JLabel lblEstoque = new JLabel("Produtos Em Estoque");
		lblEstoque.setBounds(25, 25, 150, 25);
		
		SmartField edtQuantidade = new SmartField(false);
		edtQuantidade.setBounds(35, 225, 150, 25);
		edtQuantidade.setHorizontalAlignment(SwingConstants.CENTER);
		
		JButton btnAdicionar = new JButton("Adicionar");
		btnAdicionar.setBounds(200, 225, 150, 25);
		btnAdicionar.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				Produto pdt = lanchonete.getProduto(Frame.tabelaEstoque.getSelectedRow());
				
				pedido.addCompra(pdt, edtQuantidade.getInt());
				Frame.tabelaPedido.setModel(pedido.getLista());
			}
		});
		
		frame.add(edtQuantidade);
		frame.add(lblEstoque);
		frame.add(btnAdicionar);
		frame.add(getScrollPane(150, 50));
		
		frame.setVisible(true);
		
		return frame;
	}
	
	public static JFrame getHistoricoFrame() {
		
		JFrame frame = new JFrame();
		frame.setSize(416, 439);
		frame.setLayout(null);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		
		JLabel lblDetalhes = new JLabel("Produtos No Pedido");
		lblDetalhes.setBounds(25, 200, 150, 25);
		
		JLabel lblPreco = new JLabel("R$ 0,00");
		lblPreco.setBounds(25, 200, 350, 25);
		lblPreco.setHorizontalAlignment(SwingConstants.RIGHT);
		
		JScrollPane pane = getScrollPedido(null);
		pane.setLocation(25, 225);
		
		frame.add(lblDetalhes);
		frame.add(lblPreco);
		frame.add(getScrollPedidos(lblPreco));
		frame.add(pane);
		
		frame.setVisible(true);
		
		return frame;
	}

	public static JFrame getEstatisticasFrame() {
		
		JFrame frame = new JFrame();
		frame.setSize(416, 439);
		frame.setLayout(null);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		
		JLabel lblFiltro = new JLabel("Filtro");
		lblFiltro.setBounds(25, 25, 50, 25);
		
		JTextField edtFiltro = new JTextField();
		edtFiltro.setBounds(65, 25, 150, 25);
		
		edtFiltro.addKeyListener(new KeyListener() {
			
			@Override
			public void keyTyped(KeyEvent e) {
				
				tabelaEstatisticas.setModel(lanchonete.getListaEstatisticas(edtFiltro.getText()));
				
			}	
			@Override
			public void keyReleased(KeyEvent e) {
				
			}
			@Override
			public void keyPressed(KeyEvent e) {
				
			}
		});
		
		
		
		frame.add(lblFiltro);
		frame.add(edtFiltro);
		frame.add(getScrollEstatisticas());
		
		frame.setVisible(true);
		
		return frame;
	}
	
	public static JButton getButton(String texto, JFrame frame, int margem, int margemPBtn, int indexBtn, int qntBtn) {
		
		int frmWidth = (int) frame.getSize().getWidth() - 16, frmHeight = (int) frame.getSize().getHeight() - 39;
		
		int realFrmHeight = frmHeight - margem * 2 - margemPBtn * (qntBtn - 1);
		
		int btnHeight = realFrmHeight / qntBtn;
		
		JButton btn = new JButton(texto);
		btn.setBounds(margem, margem + ( margemPBtn * (indexBtn - 1)) + (btnHeight * (indexBtn - 1)), frmWidth - margem * 2, btnHeight);
		
		return btn;
	}

	public static JScrollPane getScrollPane() {
		
		JTable tabela = new JTable() {
			
			/**
			 * 
			 */
			private static final long serialVersionUID = 1L;
			DefaultTableCellRenderer render = new DefaultTableCellRenderer();
			{
				render.setHorizontalAlignment(SwingConstants.CENTER);
			}
			
			@Override
			public TableCellRenderer getCellRenderer(int arg0, int arg1) {
				return render;
			}
		};
		
		tabela.setDefaultEditor(Object.class, null);
		
		tabela.setModel(lanchonete.getLista());
		
		Frame.tabelaEstoque = tabela;
		
		JScrollPane scroll = new JScrollPane(tabela);
		scroll.setBounds(25, 225, 350, 250);
		
		return scroll;
	}

	public static JScrollPane getScrollPane(int height, int y) {
		
		JScrollPane scroll = getScrollPane();
		scroll.setBounds(25, y, 350, height);
		
		return scroll;
	}
	
	public static JScrollPane getScrollPedidos(JLabel lblPreco) {
		
		JTable tabela = new JTable() {
		
			private static final long serialVersionUID = 1L;
			DefaultTableCellRenderer render = new DefaultTableCellRenderer();
			{
				render.setHorizontalAlignment(SwingConstants.CENTER);
			}
			
			@Override
			public TableCellRenderer getCellRenderer(int arg0, int arg1) {
				return render;
			}
		};
		tabela.setModel(lanchonete.getListaPedidos());
		
		tabela.setDefaultEditor(Object.class, null);
		
		tabela.addMouseListener(new MouseListener() {

			@Override
			public void mouseClicked(MouseEvent arg0) {
				
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				
			}
			@Override
			public void mouseExited(MouseEvent e) {
				
			}
			@Override
			public void mousePressed(MouseEvent e) {
				
				int i = tabela.getSelectedRow();
				
				Frame.tabelaPedido.setModel(lanchonete.getPedido(i).getLista());
				
				try {
					lblPreco.setText("R$ " + lanchonete.getPedido(i).getTotal());
				} catch (Exception ex) {}
			}
			@Override
			public void mouseReleased(MouseEvent e) {
				
			}
		});
				
		JScrollPane scroll = new JScrollPane(tabela);
		scroll.setBounds(25, 25, 350, 150);
		
		
		return scroll;
	}
	
	public static JScrollPane getScrollPedido(Pedido pedido) {
		
		JTable tabelaPedido = new JTable() {
			
			private static final long serialVersionUID = 1L;
			
			DefaultTableCellRenderer render = new DefaultTableCellRenderer();
			{
				render.setHorizontalAlignment(SwingConstants.CENTER);
			}
			
			@Override
			public TableCellRenderer getCellRenderer(int arg0, int arg1) {
				return render;
			}
		};;
		
		tabelaPedido.setDefaultEditor(Object.class, null);
		
		Frame.tabelaPedido = tabelaPedido;
		
		JScrollPane scroll = new JScrollPane(tabelaPedido);
		
		scroll.setBounds(25, 100, 350, 150);
		
		try {
			tabelaPedido.setModel(pedido.getLista());
		} catch (Exception e) {}
		
		return scroll;
	}
	
	public static JScrollPane getScrollEstatisticas() {
		
		JTable tabela = new JTable() {
			
			DefaultTableCellRenderer render = new DefaultTableCellRenderer();
			{
				render.setHorizontalAlignment(SwingConstants.CENTER);
			}
			
			@Override
			public TableCellRenderer getCellRenderer(int arg0, int arg1) {
				return render;
			}
		};
		
		Frame.tabelaEstatisticas = tabela;
	
		tabela.setDefaultEditor(Object.class, null);
		
		tabela.setModel(lanchonete.getListaEstatisticas(""));
		
		JScrollPane scroll = new JScrollPane(tabela);
		scroll.setBounds(25, 75, 350, 300);
		
		return scroll;
	}
	
	public static JTable getTabela() {
		
		return tabelaEstoque;
	}
}