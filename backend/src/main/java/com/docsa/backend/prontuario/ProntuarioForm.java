package com.docsa.backend.prontuario;

public class ProntuarioForm {

    private String observacoess;

    private String localArquivo;

    private Integer laboratorioId;

    private String crmMedico;

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
