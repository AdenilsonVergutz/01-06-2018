package Controladores;
 
import java.util.ArrayList;

import javax.swing.table.DefaultTableModel;

import Formularios.Frame;
import Formularios.Pedido;

public class ArmazemDaCerveja {

	private ArrayList<Produto> produtos = new ArrayList<>();
	private ArrayList<Pedido> pedidos = new ArrayList<>();
	
	public void cadastrar(String nome, double valor) {
		
		produtos.add(new Produto(nome, valor));
		
		Frame.getTabela().setModel(getLista());
	}
	
	public void novoPedido() {
		
		pedidos.add(new Pedido());
	}

	public void novoPedido(Pedido pedido) {
		
		pedidos.add(pedido);
	}
	
	public Pedido getPedido(int index) {
		
		return pedidos.get(index);
	}
	
 	public Pedido getLastPedido() {
		
		return pedidos.get(pedidos.size() - 1);
	}
	
	public Produto getProduto(int index) {
		
		return produtos.get(index);
	}
	
	public DefaultTableModel getListaPedidos() {
		
		DefaultTableModel modelo = new DefaultTableModel();
		
		modelo.addColumn("Cliente");
		modelo.addColumn("Hora");
		modelo.addColumn("Data");
		
		for (int i = 0; i < pedidos.size(); i++) {
			
			Pedido p = pedidos.get(i);
			
			Object[] info = {p.getCliente(), p.getHora(), p.getData()};
			
			modelo.addRow(info);
		}
		
		return modelo;
	}
	
	public DefaultTableModel getListaEstatisticas(String filtro) {
		
		DefaultTableModel modelo = new DefaultTableModel();
		
		modelo.addColumn("Cliente");
		modelo.addColumn("Total");
		modelo.addColumn("Hora");
		modelo.addColumn("Data");
		
		for (int i = 0; i < pedidos.size(); i++) {
		
			Pedido p = pedidos.get(i);
			
			Object[] info = {p.getCliente(), p.getTotal(), p.getHora(), p.getData()};
			
			if (!filtro.equals("")) {
				
				if (filtro.matches("\\d{2}/\\d{2}/\\d{4}")) {
				
					if (filtro.equals(p.getData())) {
						modelo.addRow(info);		
					}
				} else {
					
					if (p.getCliente().contains(filtro)) {
						modelo.addRow(info);
					}
				}
				
			} else {
				
				modelo.addRow(info);
			}
		}
		
		return modelo;
	}
	
	public DefaultTableModel getLista() {
		
		DefaultTableModel modelo = new DefaultTableModel();
		
		modelo.addColumn("Nome");
		modelo.addColumn("Valor");
		
		for (int i = 0; i < produtos.size(); i++) {
			
			modelo.addRow(produtos.get(i).getAll());
		};
		
		return modelo;
	}
	
}