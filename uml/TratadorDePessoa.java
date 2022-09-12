package uml;

public class TratadorDePessoa {
    public void incluirPessoa(String primeiroNome, String sobrenome, String cpf){
        Relacionamento.incluir(primeiroNome, sobrenome, cpf, 2);
    }
    public void excluirPessoa(String cpf){
        Relacionamento.excluir(cpf, 2);
    }
    public void consultarPessoa(String cpf){
        Relacionamento.consultar(cpf, 2);
    }
    public void atualizarPessoa(String cpf, String nomeNovo, String sobrenomeNovo){
        Relacionamento.atualizar(cpf, nomeNovo, sobrenomeNovo, 2);
    }
}
