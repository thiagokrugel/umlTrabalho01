package uml;
import java.util.Date;

public class TratadorDeDevolucao {
    public void registrarDevolucao(Livro livro, Date data){
        Movimentacao.registraMovimentacao(livro, data, 3);
    };

    public void emitirMulta(int dias){
        Movimentacao.registraMovimentacao(dias, 4);
    };
}
