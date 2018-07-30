package br.com.ricardosander.accesscontrolboardservice.dto;

import br.com.ricardosander.accesscontrolboardservice.model.User;

import java.io.Serializable;

public class UserIdentifierDTO implements Serializable {

  private String id;

  public UserIdentifierDTO() {
  }

  public UserIdentifierDTO(User user) {
    id = user.getId();
  }

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

}
