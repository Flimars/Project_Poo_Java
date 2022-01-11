package model.imobiliaria;

public class Residencial extends Locacao {

  public Residencial(String endereco, int quartos, int garagem, double valor, double extra) {
    super(endereco, quartos, garagem, valor, extra);
  }

  // Método de consulta para tipo.
  public String getTipo() {
    String tipo = "Residencial";
    return tipo;
  }

  //Sobescrevendo o Método de consulta para Valor Total da super classe Locacao.
  @Override
  public double getValorTotal() {
    return super.getValor();
  }

  //
  @Override
  public String toString() {
    return String.format("Residencial %n", this.getValorTotal());
  }
}
