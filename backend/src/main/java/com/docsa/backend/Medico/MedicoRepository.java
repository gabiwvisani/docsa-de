package com.docsa.backend.Medico;

import com.docsa.backend.Paciente.Paciente;
import com.docsa.backend.prontuario.Prontuario;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public abstract class MedicoRepository implements CrudRepository <Medico, String>{

    @Query("Select emailmed, senhamed FROM Medicos WHERE emailpac = :loginMedico")
    public abstract List<Medico> findLoginNSenha(@Param("loginMedico") String loginMedico);

    @Query("Select * FROM docs WHERE crmmed = :crmMedico")
    public abstract List<Prontuario> fingDocsbyCrm(@Param("crmMedico") String crmMedico);

}
