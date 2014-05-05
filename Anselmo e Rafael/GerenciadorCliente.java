public class gerenciadorCliente{
	String cliente = null;

	public void inserir(String nomeCliente){
		String nome = "Joao";
		this.cliente = nomeCliente;
	}
	
	public void atualizar(String name){
		cliente = name;
	}
	
	public String getCliente(){
		return cliente;
	}
}