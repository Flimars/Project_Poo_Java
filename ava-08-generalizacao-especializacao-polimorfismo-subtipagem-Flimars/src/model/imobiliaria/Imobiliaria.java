package model.imobiliaria;

import util.Bag;
import util.ContratacaoInvalidaException;
import util.RenovacaoInvalidaException;


public class Imobiliaria {

  private String nome;
  private Bag locacoes = new Bag(1000);
  private Bag cobrancas = new Bag(1000000);

  public Imobiliaria(String nome) {
    this.nome = nome;
  }

  public String getNome() {
    return nome;
  }

  @Override
  public String toString() {
    String str = "Imobiliaria " + nome + "\n";
    str += "Locações: \n";
    for (Object o : this.getLocacoesAtivas()) {
      str += o.toString() + "\n";
    }
    str += "Cobranças: \n";
    for (Object o : this.cobrancas.toArray()) {
      str += o.toString() + "\n";
    }
    return str;
  }


  /**
   * Array de locaçãoes ativas.
   * @return Object[]
   */
  public Object[] getLocacoesAtivas() {
    Bag ativas = new Bag(locacoes.count());
    for (Object o : locacoes.toArray()) {
      Locacao l = (Locacao) o;
      if (l.getMeses() > 0) {
        ativas.add(l);
      }
    }
    return ativas.toArray();
  }

  /**
   * Contrato para locação residencial.
   * @param residencial - Tipo de Locação.
   */
  public void contratar(Residencial residencial) {
    if (locacoes.has(residencial)) {
      throw new ContratacaoInvalidaException("locacao deve ser renovada");
    }
    residencial.setPrazo(12); // mínimo comercial
    locacoes.add(residencial);
  }

  /**
   * Contrato para locação de apartamento.   *
   * @param apartamento - Tipo de Locação.
   */
  public void contratar(Apartamento apartamento) {
    if (locacoes.has(apartamento)) {
      throw new ContratacaoInvalidaException("locacao deve ser renovada");
    }
    apartamento.setPrazo(12); // mínimo comercial
    locacoes.add(apartamento);
  }

  /**
   * Contrato para locação Comercial.   *
   * @param comercial - Tipo de Locação.
   */
  public void contratar(Comercial comercial) {
    if (locacoes.has(comercial)) {
      throw new ContratacaoInvalidaException("locacao deve ser renovada");
    }
    comercial.setPrazo(6); // mínimo comercial
    locacoes.add(comercial);
  }

  /**
   * Renovação contratual.
   * @param residencial - Tipo de Locação.
   * @param reajuste - Correção do valor contratual.
   * @param extra - Outras taxas ou encargos previstos no contrato.
   * @param prazo - prazo de uso do objeto do contrato.
   */
  public void renovar(Residencial residencial, double reajuste, double extra, int prazo) {
    if (residencial.getMeses() > 0) {
      throw new RenovacaoInvalidaException("residencial em andamento");
    }
    if (prazo < 12) {
      throw new RenovacaoInvalidaException(
        "prazo minimo de 12 meses para locação residencial");
    }
    residencial.setPrazo(prazo);
    residencial.renovar(reajuste, extra);
  }

  /**
   * Renovação contratual.   *
   * @param apartamento - Tipo de Locação.
   * @param reajuste - Correção de valor contratual.
   * @param extra - Outras taxas ou encargos previstos em contrato.
   * @param prazo - Prazo de uso do objeto do contrato.
   */
  public void renovar(Apartamento apartamento, double reajuste, double extra, int prazo) {
    if (apartamento.getMeses() > 0) {
      throw new RenovacaoInvalidaException("apartamento em andamento");
    }
    if (prazo < 12) {
      throw new RenovacaoInvalidaException(
        "prazo minimo de 12 meses para locação de apartamento");
    }
    apartamento.setPrazo(prazo);
    apartamento.renovar(reajuste, extra);
  }

  /**
   * Renovação contratual.   *
   * @param comercial - Tipo de Locação.
   * @param reajuste - Correção de valor contratual.
   * @param extra - Outras taxas ou encargos previstos em contrato.
   * @param prazo - Prazo de uso do objeto do contrato.
   */
  public void renovar(Comercial comercial, double reajuste, double extra, int prazo) {
    if (comercial.getMeses() > 0) {
      throw new RenovacaoInvalidaException("comercial em andamento");
    }
    if (prazo < 6) {
      throw new RenovacaoInvalidaException(
          "prazo minimo de 6 meses para locação comercial");
    }
    comercial.setPrazo(prazo);
    comercial.renovar(reajuste, extra);
  }

  /**
   * Nova cobrança.
   * @param ano - Ano de vigência da cobrança.
   * @param mes - Mês de vigência da cobrança.
   * @return Cobranca
   */
  public Cobranca novaCobranca(int ano, int mes) {
    Cobranca cobranca = new Cobranca(this, ano, mes);
    cobrancas.add(cobranca);
    return cobranca;
  }

}
