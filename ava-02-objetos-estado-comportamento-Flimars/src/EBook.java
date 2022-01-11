class EBook {

  final String titulo;
  final int paginas;
  final int paginaInicial;
  int lendoPagina;

  EBook(String titulo, int paginas){
    if (titulo.isBlank() || paginas <= 0 || paginas > 5000) {
      throw new IllegalArgumentException("Titulo ou páginas são Inválidos");
    }
    this.titulo = titulo;
    this.paginas = paginas;
    this.paginaInicial = 1;
    this.lendoPagina = this.paginaInicial;
  }
  // método com retorno - Consulta página que esta sendo lida.(Marcador de pág.)
 /*  int lendoPagina(){
    return numeroPagina;
  } */
  // método sem retorno - Comando avançar página seguinte.
  void virarPagina(){
    if (this.lendoPagina < this.paginas){
      this.lendoPagina += 1;
    } else {
    throw new IllegalStateException("Número de página Inválido!");
    }

  }
  // método sem retorno - Comando retornar página anterior.
  void voltarPagina(){
    if (this.lendoPagina > this.paginaInicial){
      this.lendoPagina -= 1;

    } else {
      throw new IllegalStateException("Número de página Inválido!");
    }

  }
  // método sem retorno - Comando avançar p/ uma pág. especifica .
  void irParaPagina(int numeroPagina){
    if (numeroPagina > this.paginas) {
      throw new IllegalArgumentException("Página Inexistente!");
    } else {
      this.lendoPagina = numeroPagina;
    }
  }





} // close class
