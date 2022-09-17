package uml;
import java.util.Date;
import java.util.Calendar;

public class Emprestimo extends Transacao {
    Date prazoEmprestimo;
    Date dataEmprestimo;

    public void realizarEmprestimo(Livro livro, Date data){
        if (livro.estado == "reservado") {
          livro.estado = "emprestado";
          dataEmprestimo = data;
          Calendar c = Calendar.getInstance(); 
          c.setTime(dataEmprestimo);
          c.add(Calendar.DATE, 7);
          prazoEmprestimo = c.getTime();
          super.dataEmprestimo = prazoEmprestimo;
          System.out.println("Livro emprestado com sucesso.");
        }
    };

    public void renovarEmprestimo(Livro livro){
        if (livro.estado == "emprestado") {
          Calendar c = Calendar.getInstance(); 
          c.setTime(prazoEmprestimo);
          c.add(Calendar.DATE, 7);
          prazoEmprestimo = c.getTime();
          super.dataEmprestimo = prazoEmprestimo;
          System.out.println("Emprestimo renovado com sucesso.");
        }
    };
  
}