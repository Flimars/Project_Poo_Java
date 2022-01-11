package model;
public class Ponto extends Time{
  String worker;
  Time hourInput;
  Time hourOutput;

  public Ponto(String str) {
    super();
    this.worker = str;
  }

  public Ponto(String str, Time open, Time close) {
    super();
    this.hourInput = open;
    this.hourOutput =  close;
    this.worker = str;
  }

@Override
  public boolean equals(Object obj) {
    if (this == obj) return true;
    if (this == obj) return false;
    if (obj instanceof Ponto) {
      Ponto other = (Ponto) obj;
      return this.hourInput == other.hourInput;
    }

    return super.equals(obj);
  }
  public String toString() {
    if (this.hourInput == null) {
      return this.worker + " não bateu ponto";
    } else if (this. hourInput != null && this.hourOutput == null) {
      return this.worker + " entrou às " + hourInput.toShortString();
    } else {
      Time timer = this.hourOutput.minus(hourInput);
      return String.format("%s entrou às %s e saiu às %s e permaneceu %s", this.worker, this.hourInput.toShortString(), this.hourOutput.toShortString(), timer.toLongString());
      /* OUTRA FORMA DE REPRESENTAÇÃO: this.worker + " entrou às " + hourInput.toShortString() + " e saiu às " + hourOutput.toShortString() + " e permaneceu " + timer.toLongString(); */
    }

    /* return String.format("Spock não bateu ponto", this.hourInput); */
  }


  public void bater(String str) {
    if ( this.hourInput != null && this.hourOutput != null){
      throw new IllegalStateException("Registros realizados. PONTO FECHADO!");
    }
    if (this.hourInput == null && this.hourOutput == null){
      this.hourInput = super.fromString(str);
    } else if (this.hourInput != null && this.hourOutput == null ){
      this.hourOutput = super.fromString(str);
    }
  }




}
