package fr.montreuil.pingpong.repo;

import fr.montreuil.pingpong.domain.entities.Tournament;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "tournaments")
public interface TournamentRepo extends MongoRepository<Tournament,String> {

    Tournament findByName(String name);

}
