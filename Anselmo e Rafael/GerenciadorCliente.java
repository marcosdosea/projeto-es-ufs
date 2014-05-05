public class gerenciadorCliente{
	String cliente = null;
	String sobrenome = null;
	
	public void inserir(String nomeCliente, String sobrenomeCliente){
		this.cliente = nomeCliente;
		this.sobrenome = sobrenomeCliente;
	}
	
	public void atualizar(String name, String sobrenome){
		this.cliente = name;
		this.sobrenome = sobrenome;
	}
	
	public String getCliente(){
		return this.cliente;
	}
	
	public String getSobrenome(){
		return this.sobrenome;
	}
}