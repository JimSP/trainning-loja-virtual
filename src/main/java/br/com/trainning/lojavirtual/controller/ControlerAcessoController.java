package br.com.trainning.lojavirtual.controller;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;

import br.com.trainning.lojavirtual.dto.UsuarioDto;
import br.com.trainning.lojavirtual.service.ControleAcessoService;

@Controller
public class ControlerAcessoController {

	private ControleAcessoService controleAcessoService;

	@PostMapping("/controleAcesso")
	public String controleAcesso(@Valid UsuarioDto usuarioDto) {
		boolean possuiAcesso = controleAcessoService.verificarEmailESenha(usuarioDto.getEmail(), usuarioDto.getSenha());
		usuarioDto.setPossuiAcesso(possuiAcesso);
		return "/welcome";
	}
}
