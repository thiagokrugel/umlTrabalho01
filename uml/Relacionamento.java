package uml;

public class Relacionamento {
  static Pessoa pessoa = new Pessoa();
  static Atendente atendente = new Atendente();
  static Estudante estudante = new Estudante();

  public Relacionamento(Estudante estudante, Atendente atendente, Pessoa pessoa){
    this.pessoa = pessoa;
    this.atendente = atendente;
    this.estudante = estudante;
  }

  public static void incluir (String primeiroNome, String sobrenome, String cpf, int idPapel) {
    boolean resultado = consultar(cpf, idPapel);
    if (!resultado) {
      switch (idPapel) {
        case 0: estudante.incluirEstudante(primeiroNome, sobrenome, cpf); 
                pessoa.incluirPessoa(primeiroNome, sobrenome, cpf);
                break;
        case 1: atendente.incluirAtendente(primeiroNome, sobrenome, cpf);
                pessoa.incluirPessoa(primeiroNome, sobrenome, cpf);
                break;
        case 2: pessoa.incluirPessoa(primeiroNome, sobrenome, cpf); break;
        default: System.out.printf("Selecione uma opção válida."); break;
      }
    }
    else {
      System.out.println("CPF já cadastrado no sistema relacionado.");
    }
  }

  public static void excluir (String cpf, int idPapel) {
    boolean resultado = consultar(cpf, idPapel);
    if (resultado) {
      switch (idPapel) {
        case 0: estudante.excluirEstudante(cpf); 
                pessoa.excluirPessoa(cpf);
                break;
        case 1: atendente.excluirAtendente(cpf);
                pessoa.excluirPessoa(cpf);
                break;
        case 2: pessoa.excluirPessoa(cpf); break;
        default: System.out.printf("Selecione uma opção válida.\n"); break;
      }
    }
    else {
      System.out.println("CPF não encontrado no sistema.\n");
    }
  }

  public static boolean consultar(String cpf, int idPapel) {
    switch (idPapel) {
      case 0:
        Estudante e = estudante.consultarEstudante(cpf);
        if (e != null) {
          System.out.printf("Nome: %s %s | CPF: %s\n", e.nome, e.sobrenome, e.cpf);
          return true;
        }
        else
          System.out.println("Estudante não localizado.");
          return false;
      case 1:
        Atendente a = atendente.consultarAtendente(cpf);
        if (a != null) {
          System.out.printf("Nome: %s %s | CPF: %s\n", a.nome, a.sobrenome, a.cpf);
          return true;
        }
        else
        System.out.println("Atendente não localizado.");
          return false;
      case 2:
        Pessoa p = pessoa.consultarPessoa(cpf);
        if (p != null) {
          System.out.printf("Nome: %s %s | CPF: %s\n", p.nome, p.sobrenome, p.cpf);
          return true;
        }
        else          
        System.out.println("Pessoa não localizada.");
          return false;
    }
    return false;
  }

  public static void atualizar(String cpf, String novoNome, String novoSobrenome, int idPapel){
    boolean resultado = consultar(cpf, idPapel);
    if (resultado) {
      switch (idPapel){
        case 0: estudante.atualizarEstudante(cpf, novoNome, novoSobrenome); 
                pessoa.atualizarPessoa(cpf, novoNome, novoSobrenome);
                break;
        case 1: atendente.atualizarAtendente(cpf, novoNome, novoSobrenome);
                pessoa.atualizarPessoa(cpf, novoNome, novoSobrenome);
                break;
        case 2: pessoa.atualizarPessoa(cpf, novoNome, novoSobrenome); break;
        default: System.out.printf("Selecione uma opção válida.\n"); break;
      } 
    }
    else {
      System.out.println("CPF não localizado no sistema.");
    }
  }
}