package com.docsa.backend.Medico;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity (name = "Medicos")
public class Medico {

    @Id()
    @Column(name = "crmmed", columnDefinition = "VARCHAR(30)")
    private String crmMedico;

    @Column(name = "nomemed", columnDefinition = "VARCHAR(30)")
    private String nomeMedico;

    @Column(name = "senhamed", columnDefinition = "VARCHAR(30)")
    private String senhaMedico;

    @Column(name = "emailmed", columnDefinition = "VARCHAR(30)")
    private String loginMedico;


    public String getCrmMedico() {
        return crmMedico;
    }

    public void setCrmMedico(String crmMedico) {
        this.crmMedico = crmMedico;
    }

    public String getNomeMedico() {
        return nomeMedico;
    }

    public void setNomeMedico(String nomeMedico) {
        this.nomeMedico = nomeMedico;
    }

    public String getSenhaMedico() {
        return senhaMedico;
    }

    public void setSenhaMedico(String senhaMedico) {
        this.senhaMedico = senhaMedico;
    }

    public String getLoginMedico() {
        return loginMedico;
    }

    public void setLoginMedico(String loginMedico) {
        this.loginMedico = loginMedico;
    }
}
