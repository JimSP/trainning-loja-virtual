package br.com.trainning.lojavirtual.dto;

import java.io.Serializable;

import javax.validation.constraints.NotBlank;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class UsuarioDto implements Serializable{

	private static final long serialVersionUID = -1756979615282613295L;

	@NotBlank
	private String email;
	
	@NotBlank
	private String senha;
	
	private boolean possuiAcesso;
}
