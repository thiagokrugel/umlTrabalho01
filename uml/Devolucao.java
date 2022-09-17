package uml;
import java.util.Date;

public class Devolucao extends Transacao {
  Date dataDevolucao;
  int dias;

  public void registrarDevolucao(Livro livro, Date data){
    if (livro == null) {
      System.out.println("Livro não encontrado.");
    }
    else {
      if (livro.estado == "emprestado") {
        livro.estado = "livre";
        dataDevolucao = data;
        System.out.println("Livro devolvido.");
      }
    }
  };

  public void emitirMulta(int dias){
    System.out.printf("Multa no valor de R$%d,00\n", dias);
  };
}