package model.imobiliaria;

public class Apartamento extends Locacao {

  public Apartamento(String endereco, int quartos, int garagem, double valor, double extra) {
    super(endereco, quartos, garagem, valor, extra);
  }

  public String getTipo() {
    String tipo = "Apartamento";
    return tipo;
  }

  @Override
  public double getValorTotal() {
    return this.getValor() + this.getValorCondominio();
  }

  @Override
  public double pagar(int atraso) {
    double valorPago = this.getValorTotal();
    valorPago += (this.getValor() * 0.03) + (this.getValor() * atraso * 0.01);
    valorPago += (this.getValorCondominio() * 0.10);
    this.meses = this.meses - 1;
    ultimoValorPago = valorPago;
    return valorPago;
  }

  @Override
  public String toString() {
    return String.format("Apartamento %n", this.getValorTotal());
  }

}
