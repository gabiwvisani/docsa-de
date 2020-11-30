package com.docsa.backend.laboratorio;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Laboratorio {

    @Id()
    @Column(name = "idlab", columnDefinition = "NUMBER(6)")
    private Integer labId;

    @Column(name = "nomelab", columnDefinition = "VARCHAR(30)")
    private String nomeLab;

    @Column(name = "senhalab", columnDefinition = "VARCHAR(30)")
    private String senhaLab;

    @Column(name = "emaillab", columnDefinition = "VARCHAR(30)")
    private String loginLab;


    public Integer getLabId() {
        return labId;
    }

    public void setLabId(Integer labId) {
        this.labId = labId;
    }

    public String getNomeLab() {
        return nomeLab;
    }

    public void setNomeLab(String nomeLab) {
        this.nomeLab = nomeLab;
    }

    public String getSenhaLab() {
        return senhaLab;
    }

    public void setSenhaLab(String senhaLab) {
        this.senhaLab = senhaLab;
    }

    public String getLoginLab() {
        return loginLab;
    }

    public void setLoginLab(String loginLab) {
        this.loginLab = loginLab;
    }
}
