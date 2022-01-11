package model;

public class Editora {
  private final String nome;

  public Editora () {
    this.nome = "";

  }

  public Editora (String brand) {
    this.nome  =  brand;
  }

  public String getNome() {
      return nome;
  }

  @Override
  public String toString() {
      return this.nome;
  }

}
