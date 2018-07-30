package br.com.ricardosander.accesscontrolboardservice.repository;

import br.com.ricardosander.accesscontrolboardservice.model.Identifier;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface IdentifierRepository extends MongoRepository<Identifier, String> {

}
