package br.com.ufc.TrabalhoFinal_CN.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.ufc.TrabalhoFinal_CN.model.Admin;

public interface PessoaRepossitory extends JpaRepository<Admin, Long> {

}
