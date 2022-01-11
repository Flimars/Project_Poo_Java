package model.imobiliaria;

public class Comercial extends Locacao {

  public Comercial(String endereco, int quartos, int garagem, double valor, double extra) {
    super(endereco, quartos, garagem, valor, extra);
  }

  public String getTipo() {
    String tipo = "Comercial";
    return tipo;
  }

  @Override
  public double getValorTotal() {
    if (this.getMeses() == prazo) {
      return super.getValor() + this.getTaxaComercial();
    }
    return super.getValor();
  }

  @Override
  public void renovar(double percentual) {
    super.renovar(6, percentual);
  }

  @Override
  public void renovar(double percentual, double extra) {
    super.renovar(6, percentual, extra);
  }

  @Override
  public double pagar(int atraso) {
    double valorPago = this.getValorTotal();
    valorPago += (this.getValorTotal() * 0.05) + (this.getValorTotal() * atraso * 0.01);
    this.meses = this.meses - 1;
    ultimoValorPago = valorPago;
    return valorPago;
  }

  @Override
  public String toString() {
    return String.format("Comercial %n", this.getValorTotal());
  }

}
