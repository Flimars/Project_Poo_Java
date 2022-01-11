package src.tads_poo;

public class Forno {
    int tensao;
    int potencia;
    float volume;
    float profundidade;
    float altura;
    float largura;
    float temperatura = 0;
    boolean ligado = false;

    // Contrutor com parâmetros definidos e obrigatórios.
    Forno(float volume, int tensao, int potencia, float largura, float altura, float profundidade) {
        this.volume = volume;
        this.tensao = tensao;
        this.potencia = potencia;
        this.largura = largura;
        this.altura = altura;
        this.profundidade = profundidade;
    }

    // método com retorno - Para consultar estado temperatura do forno.
    float temperatura() {
        return this.temperatura;
    }

    // método com retorno - Para consultar estado do forno (ligado ==false/
    // desligado == true)
    boolean ligado() {
        return this.ligado;
    }

    void ligar() {
        this.ligado = true;
    }

    void desligar() {
        this.ligado = false;
    }

    // método sem retorno - Comando para modificar/alterar o estado da temperatura
    // do forno.
    void aumentarTemperatura() {
        if (ligado() == false) {
            ligar();
            this.temperatura = 50;
        } else {
            this.temperatura += 50;
        }

    }

    void diminuirTemperatura() {
        if (ligado() == true) {

        }
    }

    
}
