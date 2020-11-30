package com.docsa.backend.Paciente;


import com.docsa.backend.prontuario.Prontuario;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.web.accept.ParameterContentNegotiationStrategy;

import java.util.ArrayList;
import java.util.List;

@Repository
public abstract class PacienteRepository implements CrudRepository <Paciente, String> {

    @Query ("Select * FROM pacientes WHERE rgpac = :rgPaciente")
    public abstract List<Paciente> findByPacId(@Param("rgPaciente") String rgPaciente);

    @Query ("Select emailpac, senhapac FROM pacientes WHERE emailpac = :loginPaciente")
    public abstract ArrayList<Paciente>findLoginNSenha(@Param("loginPacinete") String loginPacinete);

    @Query ("Select * FROM docs WHERE rgpac = :rgPaciente")
    public abstract List<Prontuario> findDocsbyRgpaciente(@Param("rgPaciente") String rgPaciente);

}
