package model;


public class NaoHaVagaException extends RuntimeException{

  public NaoHaVagaException() {
    super("NÃO HÁ VAGA");
  }

public NaoHaVagaException(String string) {
   super("NÃO HÁ VAGAS");
}


}
