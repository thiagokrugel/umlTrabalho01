package uml;
import java.util.Date;

public class TratadorDeEmprestimo {
    public void solicitarReserva(Livro livro){
        Movimentacao.registraMovimentacao(livro, 1);
    };

    public void consultarReservas(Acervo acervo){
        Movimentacao.registraMovimentacao(acervo, 2);
    };

    public void realizarEmprestimo(Livro livro, Date data){
        Movimentacao.registraMovimentacao(livro, data, 5);
    };

    public void renovarEmprestimo(Livro livro){
        Movimentacao.registraMovimentacao(livro, 6); 
    };
}
