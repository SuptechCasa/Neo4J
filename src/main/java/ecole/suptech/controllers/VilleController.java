package ecole.suptech.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ecole.suptech.entities.Ville;
import ecole.suptech.repositories.VilleRepository;

@RestController
@RequestMapping("villes")
public class VilleController {
@Autowired VilleRepository villeRepository;
@GetMapping
public List<Ville> getAllVilles(){
	return villeRepository.findAll();
}
@PostMapping
public Ville addVille(@RequestBody Ville ville) {
	return villeRepository.save(ville);
}
}
