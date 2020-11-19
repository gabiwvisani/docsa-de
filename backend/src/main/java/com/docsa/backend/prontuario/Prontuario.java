package com.docsa.backend.prontuario;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;


@Entity(name = "docs")
public class Prontuario {

    @Id()
    @Column(name = "iddoc", columnDefinition = "NUMBER (6)")
    private Integer prontuarioKey;

    @Column(name = "obsdoc", columnDefinition = "VARCHAR (100)")
    private String observacoess;

    @Column(name = "localdoc", columnDefinition = "VARCHAR(100)")
    private String localArquivo;

    @Column(name = "idlab", columnDefinition = "INT (6)")
    private Integer laboratorioId;

    @Column(name = "crmmed", columnDefinition = "VARCHAR (30)")
    private String crmMedico;

    @Column(name = "rgpac", columnDefinition = "VARCHAR (30)")
    private String rgPaciente;


    public String getObservacoess() {
        return observacoess;
    }

    public void setObservacoess(String observacoess) {
        this.observacoess = observacoess;
    }

    public String getLocalArquivo() {
        return localArquivo;
    }

    public void setLocalArquivo(String localArquivo) {
        this.localArquivo = localArquivo;
    }

    public Integer getLaboratorioId() {
        return laboratorioId;
    }

    public void setLaboratorioId(Integer laboratorioId) {
        this.laboratorioId = laboratorioId;
    }

    public String getCrmMedico() {
        return crmMedico;
    }

    public void setCrmMedico(String crmMedico) {
        this.crmMedico = crmMedico;
    }

    public String getRgPaciente() {
        return rgPaciente;
    }

    public void setRgPaciente(String rgPaciente) {
        this.rgPaciente = rgPaciente;
    }
}
