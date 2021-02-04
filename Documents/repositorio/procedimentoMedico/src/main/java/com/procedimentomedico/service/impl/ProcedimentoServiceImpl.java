package com.procedimentomedico.service.impl;

import com.procedimentomedico.model.Procedimento;
import com.procedimentomedico.repository.ProcedimentoRepository;
import com.procedimentomedico.service.ProcedimentoService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;

@Validated
@Service
@AllArgsConstructor
public class ProcedimentoServiceImpl implements ProcedimentoService {

    @Autowired
    private ProcedimentoRepository procedimentoRepository;


    @Override
    public void salvar(Procedimento procedimento) {
        procedimentoRepository.save(procedimento);
    }

    @Override
    public Procedimento verificar(Procedimento procedimento) {
        return procedimentoRepository.findByProcedimento(procedimento.getProcedimento()).get();
    }
}
