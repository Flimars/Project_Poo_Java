package model.alocação;
import java.util.ArrayList;

public class Desenvolvedor {

  private final String nome;
  private final ArrayList<Projeto> projetos = new ArrayList<>();

  public Desenvolvedor(String nome) {
    this.nome = nome;
  }

  public String getNome() {
    return nome;
  }

  public ArrayList<Projeto> getProjetos() {
   return new ArrayList<Projeto>(this.projetos);
  }

  boolean podeSerAlocado(Projeto projeto) {
    return ! this.projetos.contains(projeto) && this.projetos.size() < 2;
  }

  void addDesenvolvedor(Projeto projeto){
    this.projetos.add(projeto);
  }

  public void alocarNo(Projeto projeto) {
    if (this.podeSerAlocado(projeto) && projeto.podeAlocar(this)) {
      this.projetos.add(projeto);
      projeto.addProjeto(this);
    }
  }

  @Override
  public String toString() {
    return "DEV_" + this.nome;
  }
}
