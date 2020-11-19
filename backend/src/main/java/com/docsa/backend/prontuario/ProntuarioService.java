package com.docsa.backend.prontuario;

import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
public class ProntuarioService {

    private final ProntuarioRepository dao;

    public ProntuarioService(ProntuarioRepository dao) {
        this.dao = dao;
    }

    @Transactional
    public void adicionarProntuario(ProntuarioForm form) {
        Prontuario prontuario = transformarFormularioEmEntidade(form);
        dao.save(prontuario);
    }

    private Prontuario transformarFormularioEmEntidade(ProntuarioForm form) {
        Prontuario entity = new Prontuario();
        entity.setCrmMedico(form.getCrmMedico());
        entity.setLaboratorioId(form.getLaboratorioId());
        entity.setLocalArquivo(form.getLocalArquivo());
        entity.setObservacoess(form.getObservacoess());
        entity.setRgPaciente(form.getRgPaciente());

        return entity;
    }
}
