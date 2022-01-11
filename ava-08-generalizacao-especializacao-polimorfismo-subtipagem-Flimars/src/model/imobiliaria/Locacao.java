package model.imobiliaria;

import util.ExtraIllegalArgumentException;
import util.GaragemIllegalArgumentException;
import util.QuartosIllegalArgumentException;
import util.ValorIllegalArgumentException;

public abstract class Locacao {

  private final String endereco;
  private final int garagem;
  private final int quartos;
  public int prazo; // private
  protected int meses; // private
  private double extra;
  protected double valor;
  protected double ultimoValorPago; // private

  /**
   * Construtor da locação, parAmetros e suas salva-guardas.
   * @param endereco - localização do imóvel.
   * @param quartos - quantidade de dormitorios do imóvel.
   * @param garagem - quantidade de box de garagem do imóvel.
   * @param valor - valor mensal pela locação do imóvel.
   * @param extra - Outras taxas ou encargos previstos em contrato.
   */

  public Locacao(String endereco, int quartos, int garagem, double valor, double extra) {
    if (garagem < 0) {
      throw new GaragemIllegalArgumentException("Quantia de garagem inválida");
    }
    if (quartos < 0) {
      throw new QuartosIllegalArgumentException("Quantia dormitórios inválida");
    }
    if (valor < 0) {
      throw new ValorIllegalArgumentException("Valor inválido");
    }
    if (extra < 0) {
      throw new ExtraIllegalArgumentException("Valor extra inválido");
    }
    this.endereco = endereco;
    this.quartos = quartos;
    this.garagem = garagem;
    this.valor = valor;
    this.extra = extra;
  }

  /**
   * Renovação contratual.
   * @param percentual - Índice de reajuste.
   */
  public void renovar(double percentual) {
    this.renovar(12, percentual);
  }

  /**
   * Renovação contratual.
   * @param percentual - Índice de reajuste.
   * @param extra - Outras taxas ou encargos previsto em contrato.
   */
  public void renovar(double percentual, double extra) {
    this.renovar(12, percentual, extra);
    /* if (tipo == 'C') this.renovar(6, percentual, extra);
    else this.renovar(12, percentual, extra); */
  }

  /**
   * Renovação contratual.
   * @param prazo - Prazo de uso do objeto do contrato.
   * @param percentual - Índice de reajuste.
   */
  public void renovar(int prazo, double percentual) {
    setPrazo(prazo);
    this.valor += percentual / 100.0 * valor;
  }

  /**
   * Renovação contratual.   *
   * @param prazo       - Prazo de uso do objeto do contrato.
   * @param percentual - Índice de reajuste.
   * @param extra - Outras taxas ou encargos previstos no contrato.
   */
  public void renovar(int prazo, double percentual, double extra) {
    setPrazo(prazo);
    this.valor += percentual / 100.0 * valor;
    this.extra = extra;
  }

  /**
   * Método consulta valor a pagar.
   * @return double - valor a pagar.
   */
  public double pagar() {
    if (this.meses <= 0) {
      return 0;
    }
    double valorPago = this.getValorTotal();
    this.meses = this.meses - 1;
    ultimoValorPago = valorPago;
    return valorPago;
  }

  /**
   * Método consulta valor a pagar.
   * @param atraso - período em atraso.
   * @return double - valor a pagar.
   */
  public double pagar(int atraso) {
    if (this.getMeses() <= 0) {
      return 0;
    }
    double valorPago = this.getValorTotal();
    valorPago += (this.getValor() * 0.03) + (this.getValor() * 0.01);
    this.meses = this.meses - 1;
    ultimoValorPago = valorPago;
    return valorPago;
  }

  /**
   * Método comando para estipular prazo.   *
   * @param prazo - Prazo de uso do objeto do contrato.
   */
  public void setPrazo(int prazo) {
    this.prazo = prazo;
    this.meses = prazo;
  }

  public int getMeses() {
    return this.meses;
  }

  public double getValor() {
    return this.valor;
  }

  public double getValorCondominio() {
    return this.extra;
  }

  public double getUltimoValorPago() {
    return ultimoValorPago;
  }

  public double getTaxaComercial() {
    return this.extra;
  }

  /**
   * Método consulta valor total.
   * @return double
   */
  public double getValorTotal() {
    return this.getValor();
  }

  public String getEndereco() {
    return endereco;
  }

  public double getExtra() {
    return extra;
  }

  public int getGaragem() {
    return garagem;
  }

  public int getQuartos() {
    return quartos;
  }

}
