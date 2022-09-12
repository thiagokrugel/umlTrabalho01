package uml;

import java.util.ArrayList;

public class Pessoa {
    String nome;
    String sobrenome;
    String cpf;
    static ArrayList<Pessoa> pessoas = new ArrayList<Pessoa>();

    public Pessoa(String nome, String sobrenome, String cpf){
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.cpf = cpf;
    }

    public Pessoa() {}

    public void incluirPessoa(String nome, String sobrenome, String cpf){
        Pessoa p = consultarPessoa(cpf);
        if (p == null) {
          Pessoa pessoa = new Pessoa(nome, sobrenome, cpf);
          pessoas.add(pessoa);
        }
        else {
          System.out.println("CPF já cadastrado.");
        }
    }
  
    public void excluirPessoa(String cpf){
        Pessoa p = consultarPessoa(cpf);
        if (p != null) {
          pessoas.remove(p);
        }
        else {
          System.out.println("CPF não encontrado.");
        }
    }
  
    public Pessoa consultarPessoa(String cpf){
        for (Pessoa p : pessoas) {
          if (p.cpf.equals(cpf)) {
            return p;
          }
        }
        return null;
    }
  
    public void atualizarPessoa(String cpf, String nomeNovo, String sobrenomeNovo){
        Pessoa p = consultarPessoa(cpf);
        if (p != null) {
          p.nome = nomeNovo;
          p.sobrenome = sobrenomeNovo;
        }
        else {
          System.out.println("CPF não localizado.");
        }
    }
}
