package br.com.ufc.TrabalhoFinal_CN.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import br.com.ufc.TrabalhoFinal_CN.model.Alimento;

@Repository
public interface AlimentoRepository extends JpaRepository<Alimento, Long> {

}
