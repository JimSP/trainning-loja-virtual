package br.com.trainning.lojavirtual.modelo;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Pessoa {
	
	@Id
	private Long id;
	
	@Column(length=55)
	private String primeiroNome;
	
	@Column(length=55)
	private String segundoNome;
	
	@Column(length=255)
	private String sobrenome;
	
	@Column
	private Date dataNascimento;
	
	@Column(length=255)
	private String email;
	
	@Column(length=20)
	private String senha;

}
