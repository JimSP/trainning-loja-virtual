package br.com.trainning.lojavirtual.controller;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import br.com.trainning.lojavirtual.dto.UsuarioDto;

@Controller
public class WelcomeController {

	private static final String USUARIO_DTO = "usuarioDto";

	@GetMapping("/")
    public String welcome(Model model) {
		model.addAttribute(USUARIO_DTO, usuarioSemPermisao());
        return "welcome";
    }

	@GetMapping("/entrar")
    public ModelAndView entrar(UsuarioDto usuarioDto) {
		ModelAndView modelAndView = new ModelAndView("login");
		modelAndView.addObject(USUARIO_DTO, usuarioDto);
        return modelAndView;
    }

	@GetMapping("/cadastrar")
    public String cadastrar() {
        return "cadastrar";
    }
	
	@GetMapping("/sair")
    public String sair(Model model) {
		model.addAttribute(USUARIO_DTO, UsuarioDto.builder().build());
        return "sair";
    }
	
	private UsuarioDto usuarioSemPermisao() {
		return UsuarioDto.builder().possuiAcesso(Boolean.FALSE).build();
	}
}