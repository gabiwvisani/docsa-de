package com.docsa.backend.prontuario;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public abstract class ProntuarioRepository implements CrudRepository<Prontuario, Integer> {

}
