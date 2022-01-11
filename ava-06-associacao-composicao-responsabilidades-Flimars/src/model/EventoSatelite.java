package model;
import java.util.ArrayList;

import model.Evento.Tipo;

public class EventoSatelite {
  private String nome;
  private Tipo tipo;
  private Evento evento;
  private ArrayList<Inscrito>inscritos = new ArrayList<>();


  public EventoSatelite(String name, Evento.Tipo type, Evento evento) {
    this.nome = name;
    this.tipo = type;
    this.evento = evento;
  }

  public String getCidade() {
    return evento.getCidade();
  }


  public Evento getEvento() {
    return evento;
  }

  public Evento getEventoCentral() {
      return this.evento;
  }

  public Tipo getTipo() {
    return tipo;
  }

  public Inscrito inscrever(String name) {
    Inscrito participante =  new Inscrito(name);
    this.inscritos.add(participante);
    return participante;
  }

  public Inscrito getInscrito(int nInscritos) {
    if (nInscritos > this.inscritos.size()) {
      return null;
    }
    if (nInscritos > 0 ) {
      return this.inscritos.get(nInscritos - 1);
    }
      return null;
  }

  public int getQuantidadeInscritos() {
      return this.inscritos.size();
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj) {
      return true;

    }
    if (obj == null) {
      return false;
    }

    if (obj instanceof EventoSatelite) {

    EventoSatelite otherEventSat = (EventoSatelite) obj;
      if (this.nome.equals(otherEventSat.nome)  &&  this.tipo == otherEventSat.tipo) {
        return true;
      }
    }
    return false;
  }

  @Override
  public String toString() {
    return this.nome;
  }




}
