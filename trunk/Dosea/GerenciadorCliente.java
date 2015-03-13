public class GerenciadorCliente {
	public void inserir(Cliente cliente){
		// adiciona um novo cliente na base
		clientes.add(nomeCliente);
	}

	//Metodo destinado a atualizar o cliente
	public boolean atualizar(Cliente cliente) {
		for(Cliente c: clientes){
		  if(c.id = cliente.id){
		     c = cliente;
			return true;
		  }
		
		}
		return false;
	}

}