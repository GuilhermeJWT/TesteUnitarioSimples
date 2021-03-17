package br.com.systemsgs.metodos;

import java.util.ArrayList;
import java.util.List;

import br.com.systemsgs.exception.PessoaInexisteRemoveException;
import br.com.systemsgs.exception.PessoaSemNomeException;
import br.com.systemsgs.model.ModelPessoas;

public class CadastroPessoas {
	
	private List<ModelPessoas> pessoas;

	public List<ModelPessoas> getPessoas() {
		return this.pessoas;
	}

	public CadastroPessoas() {
		this.pessoas = new ArrayList<ModelPessoas>();
	}

	public void adiciona(ModelPessoas modelPessoas) {
		
		if(modelPessoas.getNome() == null) {
			throw new PessoaSemNomeException();
		}
		
		this.pessoas.add(modelPessoas);
	}

	public void remover(ModelPessoas modelPessoas) {
		
		if(this.pessoas.isEmpty()) {
			throw new PessoaInexisteRemoveException();
		}
		
		this.pessoas.remove(modelPessoas);
	}
	
	
}
