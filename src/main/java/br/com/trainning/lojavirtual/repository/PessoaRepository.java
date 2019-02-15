package br.com.trainning.lojavirtual.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import br.com.trainning.lojavirtual.modelo.Pessoa;

@Repository
public interface PessoaRepository extends JpaRepository<Pessoa, Long>{

	Optional<Pessoa> findByEmailAndSenha(@Param("email") String email, @Param("senha") String senha);
}
