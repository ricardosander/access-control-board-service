package br.com.ricardosander.accesscontrolboardservice.config;

import br.com.ricardosander.accesscontrolboardservice.dto.UserIdentifierDTO;
import br.com.ricardosander.accesscontrolboardservice.model.Identifier;
import br.com.ricardosander.accesscontrolboardservice.model.IdentifierType;
import br.com.ricardosander.accesscontrolboardservice.model.User;
import br.com.ricardosander.accesscontrolboardservice.repository.IdentifierRepository;
import br.com.ricardosander.accesscontrolboardservice.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;

@Configuration
public class Instantiation implements CommandLineRunner {

  @Autowired
  private UserRepository userRepository;

  @Autowired
  private IdentifierRepository identifierRepository;

  @Override
  public void run(String... args) throws Exception {

    userRepository.deleteAll();
    identifierRepository.deleteAll();

    User user1 = new User(null);
    User user2 = new User(null);
    User user3 = new User(null);

    userRepository.saveAll(Arrays.asList(user1, user2, user3));

    Identifier identifier1 =
        new Identifier(null, "123", "12345", IdentifierType.CARD, new UserIdentifierDTO(user1));
    Identifier identifier2 =
        new Identifier(null, "123", "12346", IdentifierType.CARD, new UserIdentifierDTO(user2));
    Identifier identifier3 =
        new Identifier(null, "321", "12345", IdentifierType.CARD, new UserIdentifierDTO(user3));
    Identifier identifier4 =
        new Identifier(null, "123", "12347", IdentifierType.CARD, new UserIdentifierDTO(user1));
    Identifier identifier5 =
        new Identifier(null, "123", "12348", IdentifierType.CARD, new UserIdentifierDTO(user2));

    identifierRepository.saveAll(
        Arrays.asList(identifier1, identifier2, identifier3, identifier4, identifier5));

    user1.getIdentifiers().addAll(Arrays.asList(identifier1, identifier4));
    user2.getIdentifiers().addAll(Arrays.asList(identifier2, identifier5));
    user3.getIdentifiers().addAll(Arrays.asList(identifier3));

    userRepository.saveAll(Arrays.asList(user1, user2, user3));
  }

}
