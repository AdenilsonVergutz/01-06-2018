package Controladores;




	import javax.swing.JTextField;
	import javax.swing.table.DefaultTableModel;


	public class Acao {

		Produto p = new Produto();
		
		public boolean verificaProduto(JTextField nomeProduto) {
			boolean valido;
			try{
				if(String.valueOf(nomeProduto.getText()).isEmpty()){
					valido = false;
				}else{
					valido = true;
				}
			}catch (Exception e) {
				valido = false;
			}
			return valido;
		}

		public boolean verificaValor(JTextField valor) {
			boolean valido;
			try{
				if(Double.parseDouble(String.valueOf(valor.getText())) <= 0){
					valido = false;
				}else{
					valido = true;
				}
			}catch (Exception e) {
				valido = false;
			}
			return valido;
		}

		public boolean verificaQuantidade(JTextField quantidade) {
			boolean valido;
			try {
				if(Integer.parseInt(String.valueOf(quantidade.getText())) < 0){
					valido = false;
				}else{
					valido = true;
				}
			} catch (Exception e) {
				valido = false;
			}
			return valido;
		}

		public void salvaDados(String nome, double valor, int quantidade) {

			Produto p = new Produto();
			p.nome = nome;
			p.valor = valor;
			p.quantidade = quantidade;
			Produto.produtos.add(p);

		}

		public DefaultTableModel exibirDados(){
			
			DefaultTableModel exibirDados = new DefaultTableModel();

			//Colunas da tabela
			exibirDados.addColumn("Produto");
			exibirDados.addColumn("Valor");
			exibirDados.addColumn("Quantidade");

		// Linhas da tabela
			for (int i = 0; i < Produto.produtos.size(); i++) {
				exibirDados.addRow(new Object[]{Produto.produtos.get(i).nome, Produto.produtos.get(i).valor,  Produto.produtos.get(i).quantidade});
			}

			return exibirDados;
		}
		
		//Método para excluir
		public void excluir(int linha) {
			Produto.produtos.remove(linha);
		}
		
		// Método para alterar
		public void alterar(String nomeProduto, double produto, int quantidade, int linha) {
			
			Produto p = new Produto();
			p.nome = nomeProduto;
			p.valor = produto;
			p.quantidade = quantidade;
			
			Produto.produtos.set(linha, p);

			
		}

		}
		
	


