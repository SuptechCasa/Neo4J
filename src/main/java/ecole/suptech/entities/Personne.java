package ecole.suptech.entities;

import org.springframework.data.neo4j.core.schema.Id;
import org.springframework.data.neo4j.core.schema.Node;
import org.springframework.data.neo4j.core.schema.Relationship;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Node
@NoArgsConstructor @AllArgsConstructor @Data
public class Personne {
@Id
Long id;
String nom;
int age;
@Relationship(type = "reside_dans",direction = Relationship.Direction.OUTGOING)
Ville ville;
}
