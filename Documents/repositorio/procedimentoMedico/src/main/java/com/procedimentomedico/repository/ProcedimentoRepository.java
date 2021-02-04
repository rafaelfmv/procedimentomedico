package com.procedimentomedico.repository;

import com.procedimentomedico.model.Procedimento;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ProcedimentoRepository extends JpaRepository<Procedimento, Long> {

    @Query("select a from Procedimento a where a.procedimento=:procedimento")
    Optional<Procedimento> findByProcedimento(@Param("procedimento") Integer procedimento);

}
