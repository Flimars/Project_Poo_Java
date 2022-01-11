package modelo;

public class Veiculo {

  final String placa;
  final String marca;
  final String modelo;
  final int    cilindrada;

  public Veiculo(String placa, String marca, String modelo, int cilindrada) {
    this.placa      = placa;
    this.marca      = marca;
    this.modelo     = modelo;
    this.cilindrada = cilindrada;
  }

  @Override
  public boolean equals(Object objeto) {
    if (this == objeto)
      return true;
    if (null == objeto)
      return false;
    if (objeto instanceof Veiculo) {
      Veiculo motriz = (Veiculo) objeto;
      if (this.placa == motriz.placa && this.marca == motriz.marca){
        return true;
      }
    }
    return false;
  }
}
