package model;

import java.util.ArrayList;

/**
 * ListaDesejos
 */
public class ListaDesejos {
// Atributos
  ArrayList <Livro> livros = new ArrayList <Livro> ();
  private String nome;
  private boolean status = true;


  public ListaDesejos (String livro, boolean status) {
    this.nome   = livro;
    this.status = status;

  }

    public void adicionar(Livro livro) {
      this.livros.add(livro);
    }

    public ArrayList<Livro> getLivros() {
        return livros;
    }

    public Livro getLivro(int i) {
       if (i >= this.livros.size()) {
       return null;
      }
      return livros.get(i);
    }

    public boolean isPublica() {
        return status;  //true
    }

    public boolean isPrivada() {
        return true;
    }

    public String getNome() {
        return this.nome;
    }

    public int getQuantidade() {
        return this.livros.size();
    }

    public boolean isVazia() {
      if (this.livros.size() != 0) {
        return false;
      }
       return true;
    }

    public Livro getMylistLivro(String book){
      for (Livro livro : livros) {
        if (livro.getLivro().equalsIgnoreCase(book)) {
          return livro;
        }
      }
      return null;
    }

}
