package com.docsa.backend.laboratorio;

public class LaboratorioForm {

    private Integer labID;

    private String nomeLab;

    private String senhaLab;

    private String loginLab;


    public Integer getLabID() {
        return labID;
    }

    public void setLabID(Integer labID) {
        this.labID = labID;
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
