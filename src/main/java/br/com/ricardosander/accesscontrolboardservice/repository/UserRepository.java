package br.com.ricardosander.accesscontrolboardservice.repository;

import br.com.ricardosander.accesscontrolboardservice.model.User;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepository extends MongoRepository<User, String> {

}
