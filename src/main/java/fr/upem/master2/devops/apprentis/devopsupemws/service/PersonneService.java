package fr.upem.master2.devops.apprentis.devopsupemws.service;

import fr.upem.master2.devops.apprentis.devopsupemws.model.Personne;
import fr.upem.master2.devops.apprentis.devopsupemws.repository.PersonneRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonneService {
    @Autowired
    private PersonneRepository personneRepository;

    public Iterable<Personne>getAll(){
        return personneRepository.getAll();
    }

    public Personne createPersonne(Personne personne){
        return personneRepository.save(personne);
    }


    public Personne getOne(Long id) {
        return personneRepository.getOne(id);
    }

    public void deletePersonne(Long id) {
        personneRepository.delete(id);
    }

    public Personne updatePersonne(Long id, Personne personne) {
        return personneRepository.update(id,personne);
    }
}
