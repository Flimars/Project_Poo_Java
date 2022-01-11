package model.imobiliaria;

public class Cobranca {

  private final Imobiliaria imobiliaria;
  private final int ano;
  private final int mes;
  private double valorArrecadado = 0.0;

  /**
   * Construtor de cobrança e seus parâmetros.
   * @param imobiliaria -
   * @param ano - Ano de vigência da cobrança.
   * @param mes - Mês de vigência da cobrança.
   */

  public Cobranca(Imobiliaria imobiliaria,  int ano, int mes) {
    this.imobiliaria = imobiliaria;
    this.ano = ano;
    this.mes = mes;
  }

  public int getAno() {
    return ano;
  }

  public int getMes() {
    return mes;
  }

  public String getPeriodo() {
    return mes + "/" + ano;
  }
  /**
   * Método consulta valor a pagar.
   */

  public void pagar() {
    if (valorArrecadado > 0) {
      throw new IllegalStateException("cobrança já realizada");
    }
    for (Object o: imobiliaria.getLocacoesAtivas()) {
      Locacao locacao = (Locacao) o;
      valorArrecadado += locacao.pagar();
    }
  }

  /**
   * Método consulta valor a pagar.   *
   * @param atraso - período em atraso.
   */
  public void pagar(int atraso) {
    if (valorArrecadado > 0) {
      return;
    }
    for (Object o: imobiliaria.getLocacoesAtivas()) {
      Locacao locacao = (Locacao) o;
      valorArrecadado += locacao.pagar(atraso);
    }
  }

  public double getValorArrecadado() {
    return valorArrecadado;
  }

  /**
   * Método consulta valor estimado.
   * @return total - total do valor estimado.
   */

  public double getValorEstimado() {
    double total = 0.0;
    for (Object o: imobiliaria.getLocacoesAtivas()) {
      Locacao locacao = (Locacao) o;
      // PATCH:
      total += locacao.getValorTotal();
    }
    return total;
  }

  @Override
  public String toString() {
    return "Cobranca referente ao período " + this.getPeriodo()
      + " no valor de " + this.getValorArrecadado();
  }
}
