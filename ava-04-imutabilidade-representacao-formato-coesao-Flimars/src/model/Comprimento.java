package model;

public class Comprimento {

  public enum Unidade {
    CENTIMETRO (10.0),
    KILOMETRO (1000000.0),
    METRO (1000.0),
    POLEGADA (25.4);

    public double milimetros;
    Unidade(double d) {
      this.milimetros = d;
    }
  }

  public final double milimetros;

  public Comprimento(){
    this.milimetros = 0;
  }

  public Comprimento(double d) {
    this.milimetros = d;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj) {
      return true;
    }
    if (this == obj) {
      return false;
    }
    if (obj instanceof Comprimento) {
      Comprimento other = (Comprimento) obj;

      if (this.milimetros == other.milimetros) {
        return true;
      }
    }
    return false;
  }

  @Override
  public String toString() {
    return String.format("%dmm", this.milimetros);
  }



}
