package modelo;

import java.lang.*;

public class Data implements Comparable <Data> {
  private int ano;
  private int dia;
  private int mes;
  private String date;
  private Data data; //data

// Construtor default (Sem paramentro)
  public Data(){
    if (dia < 0 || dia < 32 && mes < 0 || mes > 12 && ano < 0 || ano > 2200) {
      throw new IllegalArgumentException("Dia, Mês ou Ano Inválidos");
    }
    this.ano = 0;
    this.dia = 0;
    this.mes = 0;
  }

  // Sobrecarga de Construtor com paramentros definidos e obrigatórios.
  public Data (int iDate) {
    if (dia < 0 || dia < 32 && mes < 0 || mes > 12 && ano < 0 || ano > 2200) {
      throw new IllegalArgumentException("Dia, Mês ou Ano Inválidos");
    }
    this.ano = 0;
    this.dia = 0;
    this.mes = 0;
  }

  // Sobrecarga de Construtor com paramentros definidos e obrigatórios.
  public Data(int dia, int mes, int ano){
    if (dia < 0 || dia < 32 && mes < 1 || mes > 12 && ano < 0 || ano > 2200) {
      throw new IllegalArgumentException("Dia, Mês ou Ano Inválidos");
    }
    this.ano = ano;
    this.dia = dia;
    this.mes = mes;
  }

  // Sobrecarga de Construtor com paramentros definidos e obrigatórios.
  public Data(String dt){
    String other = dt.replace("-", "/");
    String[] date = other.split("/", 5);
    this.dia = Integer.parseInt(date[0]);
    this.mes = Integer.parseInt(date[1]);
    this.ano = Integer.parseInt(date[2]);
  }

 // Método de Consulta do estado - para o atributo encapsulado ano.
  public int getAno(){
    return this.ano;
  }

  // Método de Consulta do estado - para o atributo encapsulado ano.
  public int getDia(){
    return this.dia;
  }

  // Método de Consulta do estado - para o atributo encapsulado ano.
  public int getMes(){
    return this.mes;
  }

  public void getAno(int year) {
    this.ano = year;
  }

  public void getDia(int day) {
    this.dia = day;
  }

  public void getMes(int month) {
    this.mes = month;
  }

  public void printar () {
    System.out.println(this.toString());
  }

  public int compareTo(Data d) {
    //if(this.ano > d.ano)
    if (this.ano > d.ano) {
      return 1;
    } // else if (this.ano == d.ano && this.mes > d.mes)
    else if (this.mes > d.mes && this.ano == d.ano){
      return 1;
    } // else if (this.ano == d.ano && this.mes == d.mes && this.dia > d.dia)
    else if (this.dia > d.dia && this.mes == d.mes && this.ano == d.ano) {
      return 1;
    } //else if (this.ano < d.ano) return -1;
    else if (this.ano < d.ano) {
      return -1;
    } //else if (this.mes > d.mes && this.ano > d.ano) return -1;
    else if (this.mes < d.mes  && this.ano == d.ano) {
      return -1;
    } //else if (this.dia > d.dia && this.mes > d.mes && this.ano > d.ano) return -1;
    else if (this.dia > d.dia && this.mes > d.mes && this.ano == d.ano) {
      return -1;
    }
    return 0;
  }
    //
  @Override
  public boolean equals(Object obj) {
    if (this == obj) return true; // é o msm, msma identidade.
    if (null == obj) return false; // é nulo? false.
    if (obj instanceof Data) {
      Data date = (Data) obj;
      if (this.ano == date.ano && this.dia == date.dia && this.mes == date.mes) return  this.ano == date.ano && this.mes == date.mes && this.dia == date.dia/* true */;
     /*  if (this.dia == date.dia) return true;
     if (this.mes == date.mes) return true; */
    }
    return false;
  }

  public int toString(int dt) {
    return this.dia/ this.mes/ this.ano;
  }


}





