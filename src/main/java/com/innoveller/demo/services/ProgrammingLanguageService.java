package com.innoveller.demo.services;

import com.innoveller.demo.models.ProgrammingLanguage;
import com.innoveller.demo.repositories.ProgrammingLanguageRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProgrammingLanguageService {

    @Autowired
    private ProgrammingLanguageRepository repository;

    public List<ProgrammingLanguage> findAll() {
        return repository.findAll();
    }

    public ProgrammingLanguage findById(Long id) {
        return repository.findById(id).get();
    }

    public ProgrammingLanguage save(ProgrammingLanguage programmingLanguage) {
        return repository.saveAndFlush(programmingLanguage);
    }

    public ProgrammingLanguage update(ProgrammingLanguage programmingLanguage) {
        ProgrammingLanguage existingLanguage = repository.getById(programmingLanguage.getProgrammingLanguageId());
        BeanUtils.copyProperties(programmingLanguage, existingLanguage, "id");
        return repository.saveAndFlush(existingLanguage);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }

}
