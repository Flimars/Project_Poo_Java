package model;
public class Time {
  // Atributo constante (final).
  public final int seconds;

  // Método estático da classe - constante de classe.
  public static Time MIDDAY   = new Time(12);
  public static Time MIDNIGHT = new Time(0);

  // Construtor default que inicializa os atributos.
  public Time() {
    this.seconds = 0;
  }

  // Sobrecarregando construtor qtdade de parâmentros.
  public Time (int hou) {
    this.seconds = ((hou * 3600) % 86400);
  }

  // Sobrecarregando construtor qtdade de parâmentros.
  public Time(int hou, int min) {
    this.seconds = ((hou * 3600 + min * 60) % 86400);
  }

  // Sobrecarreando construtor qtdade de parâmentros.
  public Time (int hou, int min, int sec) {
    this.seconds = (((hou * 3600) + (min * 60 + sec)) % 86400);
  }
/*
  public Time (Time t) {
    this.seconds = t;
  }
 */
  // Método Consulta hours.
  public int hours() {
    return this.seconds / 3600; /* Cálculo para encontrar hours */
  }
  // Método Consulta minutes.
  public int minutes() {
    return this.seconds % 3600 / 60; /* Cálculo para encontrar minutes */
  }
  // Método Consulta seconds.
  public int seconds() {
    return this.seconds % 3600 % 60;  /* Cálculo para encontrar seconds */
  }

  // Método comando em objetos imutáveis retorna o tipo do objeto. Não pode ser void.
  public Time plus(Time tp) {
    //
    return new Time (tp.hours() , tp.minutes(), tp.seconds() + this.seconds);
  }

  public Time plusHours(int tp) {
    int tid      = tp  * 3600 + this.seconds;
    int timer    = tid / 3600;
    int minutter = tid % 3600 / 60;
    int sekunder = tid % 3600 % 60;

    return new Time ( timer, minutter, sekunder);
  }

  public Time plusMinutes(int tp) {
    int tid = tp * 60 + this.seconds;
    int timer = tid / 3600;
    int minutter = tid % 3600 / 60;
    int sekunder = tid % 3600 % 60;

    return new Time(timer, minutter, sekunder);
  }

  public Time plusSeconds(int tp) {
    int tid = tp + this.seconds;
    int timer = tid / 3600;
    int minutter = tid % 3600 / 60;
    int sekunder = tid % 3600 % 60;

    return new Time(timer, minutter, sekunder);
  }

  public Time minusHours(int tp) {
    int tid = (-tp * 3600) + this.seconds;
    int timer = tid / 3600;
    int minutter = tid % 3600 / 60;
    int sekunder = tid % 3600 % 60;

    return new Time(timer, minutter, sekunder);
  }

  public Time minusMinutes(int tp) {
    int tid = (-tp * 60) + this.seconds;
    int timer = tid / 3600;
    int minutter = tid % 3600 / 60;
    int sekunder = tid % 3600 % 60;

    return new Time(timer, minutter, sekunder);
  }
  // método minus() soma 1 dia = 86400 para valor ser positivo.
   public Time minusSeconds(int tp) {
    int tid = 0;
    if (this.seconds - tp >= 0) {
      tid = (this.seconds - tp);
    } else  {
      tid = this.seconds - tp + 86400;
    }

    int timer = tid / 3600;
    int minutter = tid % 3600 / 60;
    int sekunder = tid % 3600 % 60;

    return new Time(timer, minutter, sekunder);
  }

  public Time minus(Time tp) {
    return this.minusSeconds(tp.seconds);
  }

  // Sobrescrevendo método equals.
  @Override
  public boolean equals(Object obj) {
   if (this == obj) return true;
   if (null == obj) return false;
   if (obj instanceof Time) {
     Time other = (Time) obj;
     return this.seconds == other.seconds;
   }
    return false;
  }

  // Sobrescrevendo método toString
  public String toString() {
    return String.format("%02d:%02d:%02d", this.hours(),this.minutes(),this.seconds());
  }

public boolean isMidDay() {
    return this.equals(MIDDAY);
}

public boolean isMidNight() {
    return this.equals(MIDNIGHT);
}

public Time shift() {
  Time tp = this.plus(MIDDAY);
  return tp;
}

public Time tick() {
    return this.plusSeconds(1);
}

public String toLongString() {
  if (this.hours() > 1 && this.minutes() == 0 && this.seconds() == 0) {
    return String.format("%d horas",this.hours());
  }

  if (this.hours() == 1 && this.minutes() > 1 && this.seconds() == 0) {
    return String.format("%d hora e %d minutos", this.hours(), this.minutes());
  }

  if (this.hours() > 0 && this.minutes() > 0 && this.seconds() == 0) {
    return String.format("%d horas e %d minutos", this.hours(), this.minutes());

  }else {
  return String.format("%d horas %d minutos e %d segundos", this.hours(), this.minutes(), this.seconds());
  }
}

public static Time fromString(String tp) {
  int jam = Integer.parseInt(tp.substring(0, 2));
  int menit = Integer.parseInt(tp.substring(3, 5));
  int detik = Integer.parseInt(tp.substring(6));
  return new Time(jam, menit, detik);
}

public static Time fromDouble(double d) {
  Double timer = d * 3600;
  int remit = timer.intValue();
  int jam   = remit / 3600;
  int menit = remit % 3600 / 60;
  int detik = remit % 3600 % 60;

  return new Time(jam, menit, detik);
}

public static Time fromSeconds(int i) {
  int remit = i;
  int jam   = remit / 3600;
  int menit = remit % 3600 / 60;
  int detik = remit % 3600 % 60;

  return new Time(jam, menit, detik);
}

public double toDouble() {
  Double timer = this.seconds / 3600.0;
  return timer;
}

public static Time from(Time tp) {
  int jam   = tp.seconds / 3600;
  int menit = tp.seconds % 3600 / 60;
  int detik = tp.seconds % 3600 % 60;

    return new Time (jam, menit, detik);
}

public String toShortString() {
  if (this.hours() > 0 && this.minutes() > 0 && this.seconds() == 0) {
    return String.format("%02dh%02dm", this.hours(), this.minutes());
  } else if (this.hours() >= 0  && this.minutes() == 0  && this.seconds() == 0) {
      return String.format("%02dh", this.hours());
  } else {
  return String.format("%02dh%02dm%02ds", this.hours(), this.minutes(), this.seconds());
  }
}

public int toInt() {
    return this.seconds;
}



}
