package com.docsa.backend.laboratorio;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public abstract class LaboratorioRepository implements CrudRepository <Laboratorio, Integer> {

}
