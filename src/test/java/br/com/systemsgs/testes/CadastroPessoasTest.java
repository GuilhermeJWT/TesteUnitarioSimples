package br.com.systemsgs.testes;

import org.assertj.core.api.Assertions;
import org.junit.Test;

import br.com.systemsgs.exception.PessoaInexisteRemoveException;
import br.com.systemsgs.exception.PessoaSemNomeException;
import br.com.systemsgs.metodos.CadastroPessoas;
import br.com.systemsgs.model.ModelPessoas;

public class CadastroPessoasTest {
	
	CadastroPessoas cadastro = new CadastroPessoas();
	ModelPessoas modelPessoas = new ModelPessoas();
	
	@Test
	public void criarCadastroPessoasTest() {
		
		Assertions.assertThat(cadastro.getPessoas()).isEmpty();
		
	}
	
	@Test
	public void AdicionarPessoaTest() {
		
		modelPessoas.setNome("Guilherme");
		cadastro.adiciona(modelPessoas);
		
		Assertions.assertThat(cadastro.getPessoas()).isNotEmpty().hasSize(1).contains(modelPessoas);
		
	}
	
	@Test(expected = PessoaSemNomeException.class)
	public void naoDeveSalvarPessoaComNomeVazioTest() {
		
		cadastro.adiciona(modelPessoas);
		
	}
	
	@Test
	public void removerPessoaTest() {
		
		modelPessoas.setNome("Guilherme");
		cadastro.adiciona(modelPessoas);
		cadastro.remover(modelPessoas);
		
		Assertions.assertThat(cadastro.getPessoas()).isEmpty();
		
	}
	
	@Test(expected = PessoaInexisteRemoveException.class)
	public void lancarErroAoTentarRemoverPessoaInexistente() {
		
		cadastro.remover(modelPessoas);
		
	}

}
