package model;

import java.util.ArrayList;

public class Atividade {

    private String nome;
    private String descricao;
    private Tipo tipo; // Aqui está a Associação
    private  int duracao;
    private final int vagas;
    private int vagasRemanecentes;
    private int ano;
    private Evento evento; // Aqui está a Associação
    private Ministrante ministrante; // Aqui está a Associação
    ArrayList<Inscrito>inscritos = new ArrayList<>();

    public Atividade(String name, int vacancy, int duration, Tipo type, Evento evento) {
      this.nome = name;
      this.vagas = vacancy;
      this.vagasRemanecentes = vacancy;
      this.duracao = duration;
      this.tipo = type;
      this.evento = evento;
    }

    public Atividade(String name, int vacancy, Tipo type, Evento evento) {
      this.nome = name;
      this.vagas = vacancy;
      this.vagasRemanecentes = vacancy;
      this.duracao = 0;
      this.tipo = type;
      this.evento = evento;
    }

    public Atividade(String name, Ministrante name2, Tipo type, Evento evento) {
      this.nome = name;
      this.ministrante = name2;
      this.tipo = type;
      this.vagas = 0;
      this.evento = evento;
    }

    public Atividade(String name, Ministrante name2, int vacancy, int duration, Tipo type, Evento evento) {
      this.nome = name;
      this.ministrante = name2;
      this.vagas = vacancy;
      this.vagasRemanecentes = vacancy;
      this.duracao = duration;
      this.tipo = type;
      this.evento = evento;
    }

    public String getDescricao() {
        return this.nome;
    }

    public int getVagas() {
        return this.vagas;
    }

    public Tipo getTipo() {
        return this.tipo;
    }

    public int getAno() {
        return evento.getAno(); //this.ano
    }

    public int getHoras() {
      return this.duracao;
    }

    public int getVagasRemanescentes() {
      return this.vagasRemanecentes;
    }

    public Evento getEvento() {
        return this.evento;
    }

    public Ministrante getMinistrante() {
      return this.ministrante ;
    }

    public Inscrito inscrever(String name) {
      if ( this.vagas > 0 && this.vagasRemanecentes == 0) {
        throw new NaoHaVagaException("NÃO HÁ VAGAS");
      }
      if (name.isBlank() || name.isEmpty()) {
        throw new IllegalArgumentException("");
      }
      Inscrito participante = new Inscrito(name);
      this.inscritos.add(participante);
      this.vagasRemanecentes--;

      return participante;
    }

    public ArrayList<Inscrito> getInscritos() {
      return inscritos;
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

      if (obj instanceof Atividade) {
        Atividade otherActivity = (Atividade) obj;
        if (this.nome.equals(otherActivity.nome) && this.tipo == otherActivity.tipo) {
          return true;
        }
      }
      return false;
    }


    @Override
    public String toString() {
      return this.nome;
    }
   
    public enum Tipo {
      ESCOLA, OFICINA, MINICURSO, MOSTRA, SALAO, SEMANA, SEMINARIO, PALESTRA;
    }

    public Inscrito getInscrito(int i) {
      if (i > inscritos.size() || i < 0) {
        throw new IllegalArgumentException("Fora de parâmetro");
      }
      return inscritos.get(i - 1);
    }

  
}
