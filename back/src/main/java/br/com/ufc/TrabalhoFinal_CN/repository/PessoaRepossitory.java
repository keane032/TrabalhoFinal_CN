package br.com.ufc.TrabalhoFinal_CN.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.ufc.TrabalhoFinal_CN.model.Admin;

@Repository
public interface PessoaRepossitory extends JpaRepository<Admin, Long> {

}
