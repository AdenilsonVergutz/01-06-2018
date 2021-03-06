/*1. Implemente um sistema para uma lanchonete, esse sistema ter� as seguintes op��es:
	a. Cadastrar produtos (Nome e valor)
	b. Realizar pedidos
	c. Hist�rico � Exibir o nome do cliente, data, hora, produtos consumidos e quantidade
	d. Estat�sticas � Poder listar todos os hist�ricos e tamb�m realizar filtragens atrav�s de data
	ou nome dos clientes
	Nessas filtragens fa�a com que sejam exibidos os produtos e as quantidades vendidas em
	um determinado per�odo, al�m de somar os valores ganhos.
	e. Sair � Finalizar o sistema
*/



package  Lista11Sistemas;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

import javax.swing.table.DefaultTableModel;

public class Pedido {

	private ArrayList<Object[]> produtos = new ArrayList<>();
	private String data, cliente, hora;
	private double total = 0;
	
	public Pedido() {
	
		Calendar calendario = Calendar.getInstance();
		calendario.setTime(new Date());
		String dataEHora = new SimpleDateFormat("HH:mm dd/MM/yyyy").format(Calendar.getInstance().getTime());
		data = dataEHora.split(" ")[1];
		hora = dataEHora.split(" ")[0];
	}
	
	public void setCliente(String cliente) {
		
		this.cliente = cliente;
	}
	
	public String getCliente() {
		
		return this.cliente;
	}

	public String getData() {
		
		return this.data;
	}

	public String getHora() {
		
		return this.hora;
	}
	
	public String getTotal() {
		
		return String.format("%.2f", total);
	}
	
	public void addCompra(Produto produto, int quantidade) {
		
		Object[] info = {produto, quantidade};
		produtos.add(info);
		
		total += produto.getValor() * quantidade;
	}

	public void removeCompra(int index) {
		
		produtos.remove(index);
	}
	
	public DefaultTableModel getLista() {
		
		DefaultTableModel modelo = new DefaultTableModel();
		
		modelo.addColumn("Nome");
		modelo.addColumn("Valor");
		modelo.addColumn("Quantidade");
		
		for (int i = 0; i < produtos.size(); i++) {
			
			Produto pdt = (Produto) produtos.get(i)[0];
			
			Object[] info = {pdt.getNome(), String.format("%.2f", pdt.getValor()), produtos.get(i)[1]};
			
			modelo.addRow(info);
		}
		
		return modelo;
	}
}