package br.com.trainning.lojavirtual.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.trainning.lojavirtual.repository.PessoaRepository;

@Service
public class ControleAcessoService {

	@Autowired
	private PessoaRepository pessoaRepository;
	
	public Boolean verificarEmailESenha(String email, String senha) {
		return pessoaRepository.findByEmailAndSenha(email, senha).isPresent();
	}
}
