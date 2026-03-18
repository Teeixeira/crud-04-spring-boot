package com.exercicio.crud_04.repositories;

import com.exercicio.crud_04.models.AutorModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AutorRepository extends JpaRepository<AutorModel, Long> {

}