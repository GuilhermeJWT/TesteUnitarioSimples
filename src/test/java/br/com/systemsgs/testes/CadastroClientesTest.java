package br.com.systemsgs.testes;

import org.assertj.core.api.Assertions;
import org.junit.Test;

import br.com.systemsgs.metodos.CadastroClientes;
import br.com.systemsgs.model.ModelClientes;

public class CadastroClientesTest {
	
	CadastroClientes cadastro = new CadastroClientes();
	ModelClientes modelClientes = new ModelClientes();
	
	@Test
	public void testeCliente() {
		
		Assertions.assertThat(cadastro.getClientes().isEmpty());
		
	}
	
	@Test
	public void salvarClienteTest() {
		
		modelClientes.setNome("Guilherme");
		modelClientes.setSalario(125.4);
		modelClientes.setSexo("Masculino");
		
		cadastro.adicionaCliente(modelClientes);
		
		Assertions.assertThat(cadastro.getClientes()).isNotEmpty().hasSize(1).contains(modelClientes);
		
	}
	
	@Test
	public void removePessoaTest() {
		
		modelClientes.setNome("Guilherme");
		modelClientes.setSalario(125.4);
		modelClientes.setSexo("Masculino");
		
		cadastro.removeCliente(modelClientes);
		
		Assertions.assertThat(cadastro.getClientes().isEmpty());
		
	}

}
