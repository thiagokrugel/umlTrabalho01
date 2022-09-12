package uml;

public class TratadorDeEstudante {
    public void incluirEstudante(String primeiroNome, String sobrenome, String cpf){
        Relacionamento.incluir(primeiroNome, sobrenome, cpf, 0);
    }
    public void excluirEstudante(String cpf){
        Relacionamento.excluir(cpf, 0);
    }
    public void consultarEstudante(String cpf){
        Relacionamento.consultar(cpf, 0);
    }
    public void atualizarEstudante(String cpf, String nomeNovo, String sobrenomeNovo){
        Relacionamento.atualizar(cpf, nomeNovo, sobrenomeNovo, 0);
    }
}
