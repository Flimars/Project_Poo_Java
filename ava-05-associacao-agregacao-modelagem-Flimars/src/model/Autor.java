package model;

import java.util.Formatter;

public class Autor {

  private final String nome;
  private final String sobrenome;
  //private final String nomeCompleto;

  public Autor () {
    this.nome = "";
    this.sobrenome = "";
   // this.nomeCompleto = nome + sobrenome;

  }

  public Autor(String surName, String name) {
    this.nome = name;
    this.sobrenome = surName;
   //this.nomeCompleto = name + surName;

  }

  public String getNome () {
    return this.nome;
  }

  public String getSobrenome() {
    return this.sobrenome;
  }

  public String getNomeCompleto() {
    return this.nome + " " + this.sobrenome;
  }

   @Override
  public String toString() {
      return this.getSobrenome()  + ", " +  this.getNome();
  }




}
