package model;

import java.io.CharArrayWriter;
import java.util.ArrayList;

public class Inscrito {

  private String nome;
  private Chave chave;
  private boolean isConcluido = false;

  public Inscrito(String name) {
    this.nome = name;
    this.chave = Chave.geradorChave();
  }

  public String getNome() {
    return this.nome;
  }

  public Chave getChave() {
    return this.getCaracteres();
  }

  private Chave getCaracteres() {
    return this.chave;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj) {
      return true;

    }
    if (obj == null) {
      return false;
    }

    if (obj instanceof Inscrito) {

      Inscrito otherEnroll = (Inscrito) obj;
      if (this.nome.equals(otherEnroll.nome)) {
        return true;
      }
    }
    return false;
  }

  @Override
  public String toString() {
    return this.nome;
  }

public boolean isConcluido() {
    return this.isConcluido;
}

public void confirmarPresenca() {
  this.isConcluido = true;
}



}
