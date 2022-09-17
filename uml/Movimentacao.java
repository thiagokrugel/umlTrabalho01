package uml;
import java.util.Date;

public class Movimentacao {
  static Reserva reserva = new Reserva();
  static Devolucao devolucao = new Devolucao();
  static Emprestimo emprestimo = new Emprestimo();
  static Date data = new Date();
  static int dias;

  public Movimentacao(Reserva reserva, Devolucao devolucao, Emprestimo emprestimo, Date data, int dias){
    Movimentacao.reserva = reserva;
    Movimentacao.devolucao = devolucao;
    Movimentacao.emprestimo = emprestimo;
    Movimentacao.data = data;
    Movimentacao.dias = dias;
  }

  public static void registraMovimentacao (Livro livro, int idOperacao){
    switch (idOperacao) {
      case 1: reserva.solicitarReserva(livro); break;
      case 6: emprestimo.renovarEmprestimo(livro); break;
      default: System.out.printf("Selecione uma opção válida.\n"); break;
    }
  }

  public static void registraMovimentacao (Acervo acervo, int idOperacao){
    switch (idOperacao) {
      case 2: reserva.consultarReservas(acervo); break;
      default: System.out.printf("Selecione uma opção válida.\n"); break;
    }
  }

  public static void registraMovimentacao (Livro livro, Date data, int idOperacao){
    switch (idOperacao) {
      case 3: devolucao.registrarDevolucao(livro, data); break;
      case 5: emprestimo.realizarEmprestimo(livro, data); break;
      default: System.out.printf("Selecione uma opção válida.\n"); break;
    }
  }

  public static void registraMovimentacao (int dias, int idOperacao){
    switch (idOperacao) {
      case 4: devolucao.emitirMulta(dias); break;
      default: System.out.printf("Selecione uma opção válida.\n"); break;
    }
  }
}