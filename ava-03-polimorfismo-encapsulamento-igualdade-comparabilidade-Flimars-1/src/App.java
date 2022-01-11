import java.util.Arrays;

import modelo.*;
/* import modelo.Dinheiro;
import modelo.Veiculo; */

public class App {
  public static void main(String[] args) {
    /*
    System.out.println("|----------------------------------------------|");
    System.out.println("|- Exercício 01 - Tornar Dinheiro polimórfico -|");
    System.out.println("|----------------------------------------------|");

    Dinheiro d1 = new Dinheiro(); // construtor vazio significa R$ 0,00
    System.out.println(d1.getReais() == 0);
    System.out.println(d1.getCentavos() == 0);

    Dinheiro d3 = new Dinheiro(3, 45); // três reais e 45 centavos
    System.out.println(d3.getReais() == 3);
    System.out.println(d3.getCentavos() == 45);

    Dinheiro d2 = new Dinheiro(d3); // d2 recebe os valores de d3, R$ 3,45
    System.out.println(d2.getReais() == 3);
    System.out.println(d2.getCentavos() == 45);

    Dinheiro d4 = new Dinheiro(200); // duzentos reais
    System.out.println(d4.getReais() == 200);
    System.out.println(d4.getCentavos() == 0);

    Dinheiro d5 = new Dinheiro("R$ 345,75"); // trezentos e quarenta e cinco reais e setenta e cinco centavos
    System.out.println(d5.getReais() == 345);
    System.out.println(d5.getCentavos() == 75);

    Dinheiro d6 = new Dinheiro("R$ 1.000.000,11"); // um milhão de reais com onze centavos
    System.out.println(d6.getReais() == 1000000);
    System.out.println(d6.getCentavos() == 11);

    Dinheiro d7 = new Dinheiro("R$ 2.567,89");
    System.out.println(d7.getReais() == 2567);
    System.out.println(d7.getCentavos() == 89);

    Dinheiro d8 = new Dinheiro(9.75);
    System.out.println(d8.getReais() == 9);
    System.out.println(d8.getCentavos() == 75);

    Dinheiro d9 = new Dinheiro(17.569); // dezessete reais e cinquenta e seis centavos -- é truncado nas duas casas, não
                                        // arredondado!
    System.out.println(d9.getReais() == 17);
    System.out.println(d9.getCentavos() == 56);

    d3.somar(d4); // somar o valor de d4 em d3
    System.out.println(d3.getReais() == 203);
    System.out.println(d3.getCentavos() == 45);

    d5.somar(100);
    System.out.println(d5.getReais() == 445);
    System.out.println(d5.getCentavos() == 75);

    d6.somar(1.90);
    System.out.println(d6.getReais() == 1000002);
    System.out.println(d6.getCentavos() == 01);
    d6.imprimir(); // R$ 1.000.002,01

    d7.somar("R$ 998.817,86");
    System.out.println(d7.getReais() == 1001385);
    System.out.println(d7.getCentavos() == 75);
    d7.imprimir(); // R$ 1.001.385,75

    System.out.println("|----------------------- --------------------------|");
    System.out.println("|- Exercício 02 -  Av eq. de Dinheiro com equals` -|");
    System.out.println("|--------------------------------------------------|");

    Dinheiro d8 = new Dinheiro(8, 98); // oito reais com noventa e oito centavos
    Dinheiro d9 = new Dinheiro(8, 99); // oito reais com noventa e nove centavos
    Dinheiro d10 = null; // nulo
    Dinheiro d11 = new Dinheiro(8, 98); // oito reais com noventa e oito centavos
    Dinheiro d12 = d8; // mesma identidade de d8

    System.out.println(d8.equals(d9) == false);
    System.out.println(d8.equals(d10) == false);
    System.out.println(d8.equals(d11) == true); // pq false?
    System.out.println(d8.equals(d12) == true);

    System.out.println(new Dinheiro(3.43).equals(new Dinheiro(3, 43)));//false
    System.out.println(new Dinheiro("R$ 8,97").equals(new Dinheiro(8, 97)));//false
    System.out.println(!new Dinheiro("R$ 5,43").equals(null)); // nunca é igual a null

    System.out.println("|--------------------------------------------------|");
    System.out.println("|---- Exercício 03 - Tornar Dinheiro comparável ---|");
    System.out.println("|--------------------------------------------------|");

    Dinheiro d12 = new Dinheiro(4, 30);
    Dinheiro d13 = new Dinheiro(987, 14);
    Dinheiro d14 = new Dinheiro(0, 1);
    Dinheiro d15 = new Dinheiro(17, 9);
    Dinheiro d16 = new Dinheiro(4, 30);

    // Todas estas assertivas devem imprimir true, claramente.
    System.out.println(d12.compareTo(d13) < 0);
    System.out.println(d12.compareTo(d14) > 0);
    System.out.println(d12.compareTo(d15) < 0);
    System.out.println(d12.compareTo(d16) == 0);

    Comparable d17 = new Dinheiro(8);
    Comparable d18 = new Dinheiro(9);
    Comparable d19 = new Dinheiro(8);
    System.out.println(d17.compareTo(d18) < 0);
    System.out.println(d17.compareTo(d19) == 0);
    System.out.println(d18.compareTo(d17) > 0);

    Dinheiro[] dinheiros = { d12, d13, d14, d15, d16 };
    Arrays.sort(dinheiros);

    // 👈 código para classificar em ordem crescente através de java.util.Arrays

    System.out.println(dinheiros[0].equals(d14));
    System.out.println(dinheiros[1].equals(d12));
    System.out.println(dinheiros[2].equals(d12));
    System.out.println(dinheiros[3].equals(d15));
    System.out.println(dinheiros[4].equals(d13));

    System.out.println(Arrays.toString(dinheiros)); // "stringuifica" o array de dinheiros

    */
    System.out.println("|--------------------------------------------------|");
    System.out.println("|--------- Exercício 04 - Implemente Data ---------|");
    System.out.println("|--------------------------------------------------|");
    Data dt1 = new Data(10, 12, 1960); //
    Data dt2 = new Data("25/2/2000"); //
    Data dt3 = null; // nulo
    Data dt4 = new Data("01-01-2020");
    Data dt5 = dt2; // mesma identidade de d8
    Data dt6 = dt1;

    System.out.println(dt2.equals(dt1) == false);
    System.out.println(dt1.equals(dt3) == false);
    System.out.println(dt4.equals(dt5) == false);
    System.out.println(dt6.equals(dt1) == true);

    System.out.println(!new Data("10-12-1975").equals(new Data("10/12/75")));// true
    System.out.println(new Data(20,9,1845).equals(new Data(20,9,1845)));// true
    System.out.println(!new Data("01-01-2002").equals(null)); // true - nunca é igual a null

    Data dt7 = new Data(02, 02, 2022);
    Data dt8 = new Data("10/12/2018");
    Data dt9 = new Data("13-07-2021");
    Data dt10 = new Data("29-06-2023");
    Data dt11 = new Data(5, 5, 2009);
    Data dt12 = new Data("10/12/2018");
    Data dt13 = new Data(02, 02, 2022);
    Data dt14 = new Data("13-07-2021");

    // Todas estas assertivas devem imprimir true, claramente.
    System.out.println(dt10.compareTo(dt10) == 0);
    System.out.println(dt9.compareTo(dt9) == 0);
    System.out.println(dt7.compareTo(dt11) == 1);
    System.out.println(dt6.compareTo(dt1) == 0);

    System.out.println(dt13.compareTo(dt7) == 0);
    System.out.println(dt11.compareTo(dt13) < 0);
    System.out.println(dt11.compareTo(dt1) > 0);

    Data[] dt = { dt8, dt11, dt12, dt13, dt14 };
    Arrays.sort(dt);

    System.out.println("|--------------------------------------------------|");
    System.out.println("|- Exercício 05 - Implementar `equals` em Veiculo -|");
    System.out.println("|--------------------------------------------------|");

    Veiculo v1 = new Veiculo("JDK1991", "Chevrolet", "D20", 4200); //
    Veiculo v2 = new Veiculo("AGT0007", "Fiat", "147C 1.3", 1297); //
    Veiculo v3 = new Veiculo("AGT0007", "Fiat", "147C 1.3", 1297); //
    Veiculo v4 = new Veiculo("ADS2019", "Nissan", "Versa", 1600); //
    Veiculo v5 = new Veiculo("FOR2233", "Chevrolet", "Chevette", 1400); //
    Veiculo v6 = new Veiculo("JDK1991", "Chevrolet", "D20", 4200); //
    Veiculo v7 = null; // nulo
    Veiculo v8 = new Veiculo("ADS2019", "Nissan", "Versa", 1600); //
    Veiculo v9 = v3; // mesma identidade de v2

    System.out.println(v1.equals(v2) == false); //true
    System.out.println(v3.equals(v6) == false); //true
    System.out.println(v4.equals(v8) == true);  //true
    System.out.println(v2.equals(v9) == true); //true
    System.out.println(v9.equals(v3) == true); //true
    System.out.println(v2.equals(v9) == true); //true
    System.out.println(v3.equals(v2) == true); //true
    System.out.println(v6.equals(v1) == true); //true
    System.out.println(v8.equals(v5) == false); //true

  }
}
