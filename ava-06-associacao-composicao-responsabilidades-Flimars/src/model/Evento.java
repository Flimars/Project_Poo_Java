package model;
import java.util.ArrayList;
/**
 * Evento
 */
public class Evento {

  final String nome;
  private final String cidade;
  private final int ano;
  Tipo tipo;
  ArrayList <EventoSatelite> evs = new ArrayList<>();
  ArrayList <Atividade> atvs = new ArrayList<>();


  public Evento(String name, String city, Tipo tipo, int year) {
    this.nome = name;
    this.cidade = city;
    this.ano = year;
    this.tipo = tipo;
  }

  public String getNome() {
    return this.nome;
  }

  public Tipo getTipo() {
    return this.tipo;
  }

  public String getCidade() {
    return this.cidade;
  }

  public int getAno() {
    return this.ano;
  }


  public ArrayList<Atividade> getAtividades() {
    return atvs;
  }

  public Atividade getAtividade(int i) {
    if (i > atvs.size() || i < 0 ) {
      throw new IllegalArgumentException("Fora de parâmetro");
    }
    return atvs.get(i - 1); // i-1
  }

  public Atividade novaAtividade(String name, int vacancy,model.Atividade.Tipo seminario) {
    Atividade otherActivity = new Atividade(name, vacancy, seminario, this);
       this.atvs.add(otherActivity);

    return otherActivity;
  }

  public Atividade novaAtividade(String name, int vacancy, int duration, Atividade.Tipo minicurso) {
    Atividade otherActivity = new Atividade(name, vacancy, duration, minicurso, this);
    this.atvs.add(otherActivity);

    return otherActivity;
  }

  public Atividade novaAtividade(String name, Ministrante name2, Atividade.Tipo palestra) {
    Atividade otherActivity = new Atividade(name, name2, palestra,this);
    this.atvs.add(otherActivity);

    return otherActivity;
  }

  public Atividade novaAtividade(String name, Ministrante name2, int vacancy, int duration, Atividade.Tipo type) {
      Atividade otherActivity = new Atividade(name, name2, vacancy, duration, type,this);
      this.atvs.add(otherActivity);

      return otherActivity;
  }

  public EventoSatelite novoEventoSatelite(String name, Tipo type) {
    EventoSatelite otherActivity = new EventoSatelite(name, type, this);
    this.evs.add(otherActivity);

    return otherActivity;
  }

  public ArrayList<EventoSatelite> getEventosSatelites() {
      return evs; //evs
  }

  public EventoSatelite getEventoSatelite(int i) {
    if (i > evs.size() || i < 0) {
      throw new IllegalArgumentException("Fora de parâmetro");
    }
    return evs.get(i - 1); // i-1
  }

  public boolean equals(Object obj) {
    if (this == obj) {
      return true;

    }
    if (obj == null) {
      return false;
    }

    if (obj instanceof Evento) {

      Evento otherEvent = (Evento) obj;
      if (this.nome.equals(otherEvent.nome)  &&  this.cidade.equals(otherEvent.cidade) && this.tipo == otherEvent.tipo && this.ano == otherEvent.ano) {
        return true;
      }
    }
    return false;
  }

  @Override
  public String toString() {
      return String.format("s%, s%, s%, d% ", this.nome, this.cidade, this.tipo, this.ano) ;
  }


  public enum Tipo {
    ESCOLA, OFICINA, MINICURSO, MOSTRA, SALAO, SEMANA, SEMINARIO, PALESTRA;
  }








}
