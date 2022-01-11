package model;

//import java.util.Formatter;

public class Livro {
  private final String titulo;
  private final Autor autor;
  private final Editora editora;
  private final int ano;

 /*  public Livro () {  // VER O QUE ESTÁ ERRADO!
    this.titulo = "";
    this.autor = autor;
    this.editora = editora;
    this.ano = 0;
  } */
  //Varaible arguments (VARARGS)
  public Livro (String title, Autor autor, int ano, Editora editora) {
    this.titulo = title;
    this.autor = autor;
    this.ano = ano;
    this.editora = editora;
  }

  /* public Livro (Livro livro) { // ENTENDER MELHOR.
    this.titulo = livro.titulo;
    this.autor = livro.autor;
    this.ano = livro.ano;
    this.editora = livro.editora;

  } */


  public String getTitulo() {
    return this.titulo;
  }
  public Autor getAutor() {
    return this.autor;
  }

  public int getAno () {
    return this.ano;
  }

  public Editora getEditora() {
    return this.editora;
  }

  public String getLivro() {
    return this.titulo;
  }

  @Override
  public String toString() {
    return String.format("%s. %s. Ed. %s, %d.", this.autor, this.titulo, this.editora, this.ano);
  }

  @Override
  public boolean equals(Object obj) {
    //Verificando se o objeto não é nulo.
    if (obj  ==  null) {
      return false;
    }

    if (obj instanceof Livro) {
    //fazer a coerção segura de outro objeto(obj) para o tipo Livro para acessar seus atributos
     Livro otherBook = (Livro) obj;
      if (this.titulo == otherBook.titulo) {
        return true;
      }
    }
    return false;
  }


}
