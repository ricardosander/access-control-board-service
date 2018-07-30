package br.com.ricardosander.accesscontrolboardservice.model;


import br.com.ricardosander.accesscontrolboardservice.dto.UserIdentifierDTO;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.io.Serializable;
import java.util.Objects;

@Document(collection = "identifiers")
public class Identifier implements Serializable {

  @Id
  private String id;

  private String companyCode;

  private String cardNumber;

  private IdentifierType type;

  private UserIdentifierDTO user;

  public Identifier() {
  }

  public Identifier(String id, String companyCode, String cardNumber,
      IdentifierType type, UserIdentifierDTO user) {
    this.id = id;
    this.companyCode = companyCode;
    this.cardNumber = cardNumber;
    this.type = type;
    this.user = user;
  }

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public String getCompanyCode() {
    return companyCode;
  }

  public void setCompanyCode(String companyCode) {
    this.companyCode = companyCode;
  }

  public String getCardNumber() {
    return cardNumber;
  }

  public void setCardNumber(String cardNumber) {
    this.cardNumber = cardNumber;
  }

  public IdentifierType getType() {
    return type;
  }

  public void setType(IdentifierType type) {
    this.type = type;
  }

  public UserIdentifierDTO getUser() {
    return user;
  }

  public void setUser(UserIdentifierDTO user) {
    this.user = user;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) { return true; }
    if (o == null || getClass() != o.getClass()) { return false; }
    Identifier that = (Identifier) o;
    return Objects.equals(id, that.id);
  }

  @Override
  public int hashCode() {

    return Objects.hash(id);
  }

}
