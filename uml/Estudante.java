package uml;

public class Estudante extends Papel {
  String nome;
  String sobrenome;
  String cpf;

  public Estudante(String nome, String sobrenome, String cpf) {
    this.nome = nome;
    this.sobrenome = sobrenome;
    this.cpf = cpf;
  }

  public Estudante() {}

  public void incluirEstudante(String primeiroNome, String sobrenome, String cpf){
    Estudante e = consultarEstudante(cpf);
    if (e == null) {
      Estudante estudante = new Estudante(primeiroNome, sobrenome, cpf);
      super.estudantes.add(estudante);
      System.out.println("Estudante adicionado.");
    }
    else {
      System.out.println("CPF já cadastrado.");
    }
  }

  public void excluirEstudante(String cpf){
    Estudante e = consultarEstudante(cpf);
    if (e != null) {
      super.estudantes.remove(e);
      System.out.println("Estudante removido.");
    }
    else {
      System.out.println("CPF não encontrado.");
    }
  }

  public Estudante consultarEstudante(String cpf){
    for (Estudante e : super.estudantes) {
      if (e.cpf.equals(cpf)) {
        return e;
      }
    }
    return null;
  }

  public void atualizarEstudante(String cpf, String nomeNovo, String sobrenomeNovo){
    Estudante e = consultarEstudante(cpf);
    if (e != null) {
      e.nome = nomeNovo;
      e.sobrenome = sobrenomeNovo;
      System.out.println("Estudante atualizado.");
    }
    else {
      System.out.println("CPF não localizado.");
    }
  }
}