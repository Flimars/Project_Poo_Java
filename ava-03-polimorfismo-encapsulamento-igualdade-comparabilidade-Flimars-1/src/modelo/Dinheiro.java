package modelo;

import java.text.NumberFormat;
import java.util.Locale;

public class Dinheiro implements Comparable<Dinheiro> {

  public static void main(String[] args) {
    Dinheiro d = new Dinheiro(32323, 45);
    d.imprimir();
  }

  private int centavos;

  //Sobrecarga de construtor por qtdade de parâmetro.
 public Dinheiro(int reais, int centavos) {
    this.centavos = reais * 100 + centavos; /* R$ 5,30/100 = 530 centavos. */
  }
  //Sobrecarga de construtor por default.
  public Dinheiro() {
    this.centavos = 0; /*  */
  }

  public Dinheiro(Dinheiro d3) {
     this.centavos = d3.centavos; /*  */
  }

  //Sobrecarga de construtor por tipo de parâmetro. (int)
  public Dinheiro(int reais) {
    this.centavos = reais * 100;
  }

  //Sobrecarga de construtor por tipo de parâmetro. (String)
  public Dinheiro(String txt) {
    // Saber mais sobre Expressões regulares.
    String[] din = txt.split(" ");
    String[] dindon = din[1].split(",");
    int reais = Integer.parseInt(dindon[0].replaceAll("\\.", "")) * 100;
    int centavos = Integer.parseInt(dindon[1]);
    this.centavos = reais + centavos;
  }

  //Sobrecarga de construtor por tipo de parâmetro.(double)
  public Dinheiro(double valor) {
    int reais = (int) (valor / 1.0) * 100; // 900 - Usando type cast (Coersão).
    int centavos = (int) (valor * 100) - reais; // 75 - Usando type cast (Coersão).
    this.centavos = reais  + centavos;
  }


  public int getReais() {
    return this.centavos / 100;
  }

  public int getCentavos() {
    return this.centavos % 100;
  }

  public void somar(Dinheiro d) {
    this.centavos += d.centavos;
  }

  public void somar(int reais, int centavos) {
    this.centavos += d.centavos;
  }

  public void somar(int reais) {
    this.centavos += (reais * 100);
  }

  public void somar(double valor) {
    int din = (int)(valor * 100);
    this.centavos += din;
  }

  public void somar(String t) {
    Dinheiro txt = new Dinheiro(t);
    this.centavos += txt.centavos;
  }

  //Sobrescrevendo o método equals.
  @Override
  public boolean equals(Object objeto) {
    if (this == objeto) return true; // é o msm, msma identidade.
    if (null == objeto) return false; // é nulo? false.
    if (objeto instanceof Dinheiro) {
      Dinheiro moeda = (Dinheiro) objeto;
      if (this.centavos == moeda.centavos) {
        return true;
      }
    }
    return false;
  }

  //Sobrescrevendo o método compareTo.
  @Override
  public int compareTo(Dinheiro o) {
   /* Forma Padrão ou Usual.
    if (this.centavos > o.centavos) return 1;
    if (this.centavos < o.centavos) return -1;
    if (this.centavos = = o.centavos) return 0; */

    // Outra forma: Resumida com msm efeito.
    return this.centavos - o.centavos;
  }

  private static NumberFormat moeda = NumberFormat.getCurrencyInstance(new Locale("pt", "BR"));

  public String toString() {
    return moeda.format(this.centavos / 100 + (this.centavos % 100) / 100.0);
  }

  public void imprimir() { // Não é ilegal imprimir Dinheiro? 😏
    System.out.println(this.toString());
  }

}
