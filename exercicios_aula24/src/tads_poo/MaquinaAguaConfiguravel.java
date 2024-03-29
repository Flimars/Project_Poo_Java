package src.tads_poo;

public class MaquinaAguaConfiguravel {
    final int capacidadeAgua;
    final int capacidadeCopos200;
    final int capacidadeCopos300;
    int qtdAgua;
    int qtdCopos200;
    int qtdCopos300;

    // construtor com parâmetros definidos e obrigatórios.
    MaquinaAguaConfiguravel(int agua, int copos200, int copos300) {
        if (agua <= 0 || copos200 <= 0 || copos300 <= 0) {
            throw new IllegalArgumentException("Falta de Argumentos ou Argumentos Inválidos");
        }
        // atributos de capacidade - ml.
        this.capacidadeAgua = agua;
        this.capacidadeCopos200 = copos200;
        this.capacidadeCopos300 = copos300;
        // atributos de quantidade - unidade por ml.
        this.qtdAgua = 0;
        this.qtdCopos200 = 0;
        this.qtdCopos300 = 0;
    }

    int agua() {
        return this.qtdAgua;
    }

    int copos200() {
        return this.qtdCopos200;
    }

    int copos300() {
        return this.qtdCopos300;
    }

    void abastecerAgua() {
        this.qtdAgua = this.capacidadeAgua;
    }

    void abastecerCopo200() {
        this.qtdCopos200 = this.capacidadeCopos200;
    }

    void abastecerCopo300() {
        this.qtdCopos300 = this.capacidadeCopos300;
    }

    void servirCopo200() {
        if (this.qtdAgua >= 200 && this.qtdCopos200 > 0) {
            this.qtdCopos200 -= 1;
            this.qtdAgua -= 200;
        } else {
            throw new IllegalStateException("Não há copos");
        }
    }

    void servirCopo300() {
        if (this.qtdAgua >= 300 && this.qtdCopos300 > 0) {
            this.qtdCopos300 -= 1;
            this.qtdAgua -= 300;
        } else {
            throw new IllegalStateException("Não há copos");
        }

    }
    
}
