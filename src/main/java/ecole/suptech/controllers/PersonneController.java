package ecole.suptech.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ecole.suptech.entities.Personne;
import ecole.suptech.repositories.PersonneRepository;

@RestController
@RequestMapping("personnes")
public class PersonneController {
@Autowired PersonneRepository personneRepository;
@GetMapping
public List<Personne> getAllPersonnes(){
	return personneRepository.findAll();
}
@PostMapping
public Personne addPersonne(@RequestBody Personne personne) {
	return personneRepository.save(personne);
}
}
