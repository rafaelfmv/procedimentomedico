package com.procedimentomedico.service;


import com.procedimentomedico.model.Procedimento;

public interface ProcedimentoService {

    void salvar(Procedimento procedimento);

    Procedimento verificar(Procedimento procedimento);

}
