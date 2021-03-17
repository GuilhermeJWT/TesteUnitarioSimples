package br.com.systemsgs.metodos;

import java.util.ArrayList;
import java.util.List;

import br.com.systemsgs.exception.ClienteInexistenteRemoveException;
import br.com.systemsgs.exception.ClienteValidateAtributosException;
import br.com.systemsgs.model.ModelClientes;

public class CadastroClientes {
	
	private List<ModelClientes> clientes;
	
	public CadastroClientes() {
		this.clientes = new ArrayList<ModelClientes>();
	}
	
	public void adicionaCliente(ModelClientes modelClientes) {
		
		if(modelClientes.getNome() == null || modelClientes.getSalario() <=0) {
			throw new ClienteValidateAtributosException();
		}
		
		this.clientes.add(modelClientes);
		
	}
	
	public void removeCliente(ModelClientes modelClientes) {
		
		if(modelClientes.getNome().isEmpty() || modelClientes.getSalario() <= 0) {
			throw new ClienteInexistenteRemoveException();
		}
		
		this.clientes.remove(modelClientes);
		
	}
	
	public CadastroClientes(List<ModelClientes> clientes) {
		this.clientes = clientes;
	}

	public void setClientes(List<ModelClientes> clientes) {
		this.clientes = clientes;
	}
	
	public List<ModelClientes> getClientes() {
		return clientes;
	}

}
