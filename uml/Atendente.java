package uml;

public class Atendente extends Papel {
    String nome;
    String sobrenome;
    String cpf;

    public Atendente(String cpf, String nome, String sobrenome) {
      this.nome = nome;
      this.sobrenome = sobrenome;
      this.cpf = cpf;
    }

    public Atendente() {}
  
    public void incluirAtendente(String cpf, String primeiroNome, String sobrenome){
        Atendente a = consultarAtendente(cpf);
        if (a == null) {
          Atendente atendente = new Atendente(primeiroNome, sobrenome, cpf);
          super.atendentes.add(atendente);
          System.out.println("Atendente adicionado.");
        }
        else {
          System.out.println("CPF já cadastrado.");
        }
    }
  
    public void excluirAtendente(String cpf){
        Atendente a = consultarAtendente(cpf);
        if (a != null) {
          super.atendentes.remove(a);
          System.out.println("Atendente removido.");
        }
        else {
          System.out.println("CPF não encontrado.");
        }
    }
  
    public Atendente consultarAtendente(String cpf){
        for (Atendente a : super.atendentes) {
          if (a.cpf.equals(cpf)) {
            return a;
          }
        }
        return null;
    }
  
    public void atualizarAtendente(String cpf, String nomeNovo, String sobrenomeNovo){
        Atendente a = consultarAtendente(cpf);
        if (a != null) {
          a.nome = nomeNovo;
          a.sobrenome = sobrenomeNovo;
          System.out.println("Atendente atualizado.");
        }
        else {
          System.out.println("CPF não localizado.");
        }
    }
}
