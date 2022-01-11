package model;

public class Ministrante {
  private final String nome;
  private final String bio;


  public Ministrante(String name, String bio) {
    this.nome = name;
    this.bio = bio;
  }

  public String getMinistrante() {
    String [] nome1 = nome.split(" ");
    return nome1[0];
  }

  @Override
  public String toString() {
      return String.format("s%, s%", this.nome, this.bio);
  }


}
