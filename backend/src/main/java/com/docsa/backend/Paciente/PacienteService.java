package com.docsa.backend.Paciente;



import com.docsa.backend.prontuario.ProntuarioRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PacienteService {

    private String login;
    private String senha;

    PacienteRepository pacienteRepository;

    public boolean validaLoginPaciente(String log, String sen) {
        ArrayList<Paciente> valida = new ArrayList<>();
        valida = pacienteRepository.findLoginNSenha(log);
        if (!valida.isEmpty()) {
            if (valida.get(1).getLoginPaciente().equals(log) && valida.get(1).getSenhaPaciente().equals(sen))
                return true;
        }
        return false;
    }
}
