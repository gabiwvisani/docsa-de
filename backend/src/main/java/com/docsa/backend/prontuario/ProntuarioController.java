package com.docsa.backend.prontuario;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("api/prontuario")
public class ProntuarioController {

    private final ProntuarioService service;

    public ProntuarioController(ProntuarioService service) {
        this.service = service;
    }

    @PostMapping
    public void adicionarProntuario(ProntuarioForm form) {
        service.adicionarProntuario(form);
    }

}
