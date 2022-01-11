package model.alocação;
import java.util.ArrayList;
public class Projeto {

  private final String nome;
  private final ArrayList<Desenvolvedor> desenvolvedores = new ArrayList<>();

  public Projeto(String nome) {
    this.nome = nome;
  }

  public Projeto(String nome, Desenvolvedor dev) {
    this.nome = nome;
    this.desenvolvedores.add(dev);
  }

  // Usando VARARGS
  public Projeto(String nome, Desenvolvedor... devs) {
    for (int i = 0; i < devs.length; i++) {
      this.alocarDev(devs[i]);
    }
    this.nome = nome;
}

  public String getNome() {
    return nome;
  }

  public ArrayList<Desenvolvedor> getDesenvolvedores() {
    return (ArrayList<Desenvolvedor>)this.desenvolvedores.clone();
  }

  boolean podeAlocar(Desenvolvedor dev) {
    return ! this.desenvolvedores.contains(dev) && this.desenvolvedores.size() < 5;
  }
  void addProjeto (Desenvolvedor dev){
    this.desenvolvedores.add(dev);
  }

  public void alocarDev(Desenvolvedor dev) {
    if (this.podeAlocar(dev) && dev.podeSerAlocado(this)) {
      this.desenvolvedores.add(dev);
      dev.addDesenvolvedor(this);
    }
  }

  @Override
  public String toString() {
    return "PROJ_" + this.nome;
  }

  public boolean hasDesenvolvedor(Desenvolvedor dev) {
    return this.desenvolvedores.contains(dev);
  }


}
