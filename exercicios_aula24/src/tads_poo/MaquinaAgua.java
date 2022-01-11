package src.tads_poo;

public class MaquinaAgua { // atibutos de unidades.
    int agua;
    int copos200;
    int copos300;
    // atributos de quantidades - 100 unid, 100 unid, 20000 ml.
    int qtdCopos200;
    int qtdCopos300;
    int qtdAgua;
    // atributos de capacidades em ml.
    final int capacidadeAgua;
    final int capacidadeCopos200;
    final int capacidadeCopos300;

    // Construtor default - sem parâmentros.
    MaquinaAgua() {
        /*
         * if (agua <= 0 || copos200 <= 0 || copos300 <= 0){ throw new
         * IllegalArgumentException("Abastecer!"); }
         */
        agua = 0;
        copos200 = 0;
        copos300 = 0;
        capacidadeAgua = agua;
        capacidadeCopos200 = copos200;
        capacidadeCopos300 = copos300;
        qtdAgua = capacidadeAgua;
        qtdCopos200 = copos200;
        qtdCopos300 = copos300;
    }

    int agua() {

        return qtdAgua;
    }

    int copos200() {
        return qtdCopos200;
    }

    int copos300() {
        return qtdCopos300;
    }

    void abastecerAgua() {
        if (agua == 0 && qtdAgua == 0) {
            qtdAgua = 20000 + capacidadeAgua;
        } else {
            int reabasteceAgua = 20000 - qtdAgua;
            qtdAgua += reabasteceAgua;
        }
    }

    void abastecerCopo200() {
        if (copos200 == 0 && qtdCopos200 == 0) {
            qtdCopos200 = 100 + capacidadeCopos200;
        } else {
            int reabasteceCopos200 = 100 - qtdCopos200;
            qtdCopos200 += reabasteceCopos200;
        }
    }

    void abastecerCopo300() {
        if (copos300 == 0 && qtdCopos300 == 0) {
            qtdCopos300 = 100 + capacidadeCopos300;
        } else {
            int reabasteceCopos300 = 100 - qtdCopos300;
            qtdCopos300 += reabasteceCopos300;
        }
    }

    void servirCopo200() {
        if (qtdAgua >= 200 && qtdCopos200 > 0) {
            qtdCopos200 -= 1;
            qtdAgua -= 200;
        }
    }

    void servirCopo300() {
        if (qtdAgua >= 300 && qtdCopos300 > 0) {
            qtdCopos300 -= 1;
            qtdAgua -= 300;
        }
    }


    
}
