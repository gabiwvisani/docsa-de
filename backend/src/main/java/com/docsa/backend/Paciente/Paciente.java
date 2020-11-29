package com.docsa.backend.Paciente;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity (name = "pacientes")

public class Paciente {

    @Id()
    @Column (name = "rgpac", columnDefinition = "VARCHAR(30)")
    private String rgPaciente;

    @Column (name = "nomepac", columnDefinition = "VARCHAR(30)")
    private String nomePaciente;

    @Column (name = "senhapac", columnDefinition = "VARCHAR(30)")
    private String senhaPaciente;

    @Column(name = "emailpac", columnDefinition = "VARCHAR(50)")
    private String loginPaciente;


    public String getRgPaciente() {
        return rgPaciente;
    }

    public void setRgPaciente(String rgPaciente) {
        this.rgPaciente = rgPaciente;
    }

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
}
