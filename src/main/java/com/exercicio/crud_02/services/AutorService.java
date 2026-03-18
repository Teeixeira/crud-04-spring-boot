package com.exercicio.crud_02.services;


import com.exercicio.crud_02.models.AutorModel;
import com.exercicio.crud_02.repositories.AutorRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AutorService {

    private final AutorRepository autorRepository;

    public AutorService(AutorRepository autorRepository) {
        this.autorRepository = autorRepository;
    }

    public AutorModel save(AutorModel autorModel){
        return autorRepository.save(autorModel);
    }

    public List<AutorModel> findAll(){
        return autorRepository.findAll();
    }

    public AutorModel findById(Long id){
        return autorRepository.findById(id).get();
    }

    public void delete(Long id){
        autorRepository.deleteById(id);
    }
}
