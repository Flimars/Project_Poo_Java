class Forno {
  int tensao;
  int potencia;
  int minutos;
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
  float temperatura(){
    return this.temperatura ;
  }

  // método com retorno - Para consultar estado do forno (ligado ==false/ desligado == true)
  boolean ligado() {
   return this.ligado;
  }
// método com retorno - Para consultar o tempo restante do forno.
  int tempoRestante() {
    return this.minutos;
  }

  // método sem retorno - Comando para modificar/alterar o estado do forno.
  void ligar(){
    this.ligado = true;
   /*  this.temperatura = 50; */
  }

  // método sem retorno - Comando para modificar/alterar o estado do forno.
  void desligar(){
    this.ligado = false;
    this.temperatura = 0;
  }

 // método sem retorno - Comando para modificar/alterar  o estado da temperatura do forno.
  void aumentarTemperatura() {
    if (temperatura()== 200) {
      this.temperatura += 20;

    } else if (/* ligado () == true &&  */temperatura() == 220) {
        this.temperatura += 30;

    } else if (temperatura() >= 300 ) {
        this.temperatura = 300;
    } else {
        ligar();
        this.temperatura += 50;
    }

  }

  // método sem retorno - Comando para modificar/alterar o estado da temperatura
  // do forno.
  void diminuirTemperatura() {
    if (temperatura() == 300) {
      this.temperatura -= 50;

    } else if (temperatura() == 250){
        this.temperatura -= 30;

    } else if (temperatura() == 220) {
        this.temperatura -= 20;

    } else {
        this.temperatura -= 50;
    }

    if (temperatura() < 0) {
      this.temperatura = 0;

    }
  }
  // método sem retorno - Comando para contole do tempo do forno.
  void setTimer(int minutos) {
    if (minutos < 1 && minutos > 120) {
      throw new IllegalStateException("Valores de tempo Inválidos");
    } else{
    this.minutos = minutos;
    }
  }

// método sem retorno - Comando para tempo transcorrido do forno.
  void tick() {
    this.minutos -= 1;
    if (this.minutos == 0) {
      desligar();
    }
  }

} // close class





