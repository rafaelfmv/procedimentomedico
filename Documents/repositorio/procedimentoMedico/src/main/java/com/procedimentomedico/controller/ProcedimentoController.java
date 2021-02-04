package com.procedimentomedico.controller;

import com.procedimentomedico.model.Procedimento;
import com.procedimentomedico.service.ProcedimentoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/autorizador")
public class ProcedimentoController {

    @Autowired
    private ProcedimentoService procedimentoService;

    @GetMapping(value = "/cadastro/procedimento/{procedimento}/idade/{idade}/sexo/{sexo}/autoriza/{autoriza}", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity cadastro(
            @PathVariable("procedimento") Integer procedimento,
            @PathVariable("idade") Integer idade,
            @PathVariable("sexo") String sexo,
            @PathVariable("autoriza") String autoriza)
            throws Exception {
        Procedimento proc = new Procedimento();
        proc.setProcedimento(procedimento);
        proc.setIdade(idade);
        proc.setSexo(sexo);
        proc.setPermitido(autoriza);
        procedimentoService.salvar(proc);
        return new ResponseEntity<>(proc, HttpStatus.OK);
    }

    @GetMapping(value = "/procedimento/{procedimento}/idade/{idade}/sexo/{sexo}", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity autorizador(
            @PathVariable("procedimento") Integer procedimento,
            @PathVariable("idade") Integer idade,
            @PathVariable("sexo") String sexo)
            throws Exception {
        Procedimento proc = new Procedimento();
        proc.setProcedimento(procedimento);
        proc.setIdade(idade);
        proc.setSexo(sexo);
        return new ResponseEntity<>(procedimentoService.verificar(proc), HttpStatus.OK);
    }
}
