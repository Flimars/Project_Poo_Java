package model;

import java.util.ArrayList;

public class Perfil {

  private final String nome;
  private ArrayList <ListaDesejos> listaDesejos = new ArrayList <ListaDesejos>();

  public Perfil() {
    this.nome = "";
  }

  public Perfil(String name) {
    this.nome = name;
  }

  public String getNome() {
    return this.nome;
  }

  public ArrayList <ListaDesejos> getListasDeDesejos() {
    return listaDesejos;
  }
// Criando nova lista e add a listaDesejos.
  public ListaDesejos novaListaDesejos(String minhaLista, boolean status) {
    ListaDesejos otherList = new ListaDesejos(minhaLista, status);
      this.listaDesejos.add(otherList);

      return otherList;
  }

  public ListaDesejos getListaDeDesejos(int i) {
    if (i >= this.listaDesejos.size()) {
      return null;
    }
    return listaDesejos.get(i);
  }

  public ListaDesejos getListaDeDesejos(String minhaLista) {
    for (ListaDesejos listaDesejos2 : listaDesejos) {
      if (listaDesejos2.getNome().equalsIgnoreCase(minhaLista)) {
        return listaDesejos2;
      }
    }
    return null;
  }

  public ListaDesejos listaUrgente(String comprarUrgente, boolean status) {
    ListaDesejos otherList = new ListaDesejos(comprarUrgente, status);
      this.listaDesejos.add(otherList);

      return otherList;
  }

  public ListaDesejos getListaUrgente(int i) {
    if (i >= this.listaDesejos.size()) {
       return null;
    }
      return listaDesejos.get(i);
  }

  public ListaDesejos listaUrgente(String minhaLista) {
    for (ListaDesejos listaDesejos2 : listaDesejos) {
      if (listaDesejos2.getNome().equalsIgnoreCase(minhaLista)) {
        return listaDesejos2;
      }
    }
    return null;
  }

  @Override
  public String toString() {
    return this.nome;
  }

  public ListaDesejos getListaDesejos(String minhaLista) {
    for (ListaDesejos listaDesejos2 : listaDesejos) {
      if (listaDesejos2.getNome().equalsIgnoreCase(minhaLista)) {
        return listaDesejos2;
      }
    }
    return null;
  }

public ListaDesejos getListaDesejos(int i) {
   if (i >= this.listaDesejos.size()) {
    return null;
  }
  return listaDesejos.get(i);
}










}
