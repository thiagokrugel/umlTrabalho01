package uml;

public class TratadorDeAtendente {
    public void incluirAtendente(String primeiroNome, String sobrenome, String cpf){
        Relacionamento.incluir(primeiroNome, sobrenome, cpf, 1);
    }
    public void excluirAtendente(String cpf){
        Relacionamento.excluir(cpf, 1);
    }
    public void consultarAtendente(String cpf){
        Relacionamento.consultar(cpf, 1);
    }
    public void atualizarAtendente(String cpf, String nomeNovo, String sobrenomeNovo){
        Relacionamento.atualizar(cpf, nomeNovo, sobrenomeNovo, 1);
    }
}
