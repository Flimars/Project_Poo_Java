package model;


public class Chave {

  private String caracteres;

  public Chave(String caracter) {
    this.caracteres = caracter;
  }

  public String getCaracteres() {
    return this.caracteres;
  }

  public static Chave geradorChave(){
    int tam = 16;
    String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    String armazenaChaves = "";
    int index = -1;
    /* Gera uma String Aleatória */
    for (int i = 0; i < tam; i++) {
      index = (int) ((alphabet.length() - 1) * Math.random());
      armazenaChaves += alphabet.substring(index, index + 1);
    }
    Chave id = new Chave(armazenaChaves);
    // Converte de String para Char[].
    return id;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj) {
      return true;

    }
    if (obj == null) {
      return false;
    }

    if (obj instanceof Chave) {

      Chave otherKey = (Chave) obj;
      if (this.caracteres.equals(otherKey.caracteres)) {
        return true;
      }
    }
    return false;
  }

  @Override
  public String toString() {
    return caracteres;
  }

}
