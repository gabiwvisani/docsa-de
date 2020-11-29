package com.docsa.backend.Paciente;

public class PacienteForm {

    private String pacienteKey;

    private String nomePaciente;

    private String senhaPaciente;

    private String loginPaciente;

    public String getNomePaciente() {
        return nomePaciente;
    }

    public void setNomePaciente(String nomePaciente) {
        this.nomePaciente = nomePaciente;
    }

    public String getSenhaPaciente() {
        return senhaPaciente;
    }

    public void setSenhaPaciente(String senhaPaciente) {
        this.senhaPaciente = senhaPaciente;
    }

    public String getLoginPaciente() {
        return loginPaciente;
    }

    public void setLoginPaciente(String loginPaciente) {
        this.loginPaciente = loginPaciente;
    }

    public String getPacienteKey() {
        return pacienteKey;
    }

    public void setPacienteKey(String pacienteKey) {
        this.pacienteKey = pacienteKey;
    }
}
