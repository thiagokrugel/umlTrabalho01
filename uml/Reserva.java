package uml;

public class Reserva extends Transacao {
    public void solicitarReserva(Livro livro){
        if (livro.estado != "reservado") {
          livro.estado = "reservado";
          System.out.println("Livro reservado com sucesso.");
        }
    };

    public void consultarReservas(Acervo acervo){
        for (int i=0; i < acervo.Livros.size(); i++) {
          Livro livro = acervo.Livros.get(i);
          if (livro.estado == "reservado") {
            System.out.printf("Livro %s: %s\n", livro.titulo, livro.id);
          }
        }
    };
}