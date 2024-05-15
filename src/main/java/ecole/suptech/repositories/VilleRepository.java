package ecole.suptech.repositories;

import org.springframework.data.neo4j.repository.Neo4jRepository;
import ecole.suptech.entities.Ville;

public interface VilleRepository extends Neo4jRepository<Ville, Long> {

}
