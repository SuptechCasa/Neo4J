package ecole.suptech.repositories;

import org.springframework.data.neo4j.repository.Neo4jRepository;

import ecole.suptech.entities.Personne;

public interface PersonneRepository extends Neo4jRepository<Personne, Long> {

}
