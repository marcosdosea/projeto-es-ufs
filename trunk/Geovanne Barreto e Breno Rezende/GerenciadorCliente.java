public class gerenciadorCliente{

	private String nomeCliente = null;
		
	public void inserir(String nomeCliente){
	
		this.nomeCliente = nomeCliente;
	}
	
	public void atualizar(String nomeCliente){
		
		this.nomeCliente = nomeCliente;
		
	}
	
	public String getNomeCliente(){
		return this.nomeCliente;
	}
	
}