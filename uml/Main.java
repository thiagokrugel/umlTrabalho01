package uml;
import java.util.Scanner;
import java.util.Date;
import java.text.SimpleDateFormat;

public class Main {
    public static void main(String args[]) throws Exception{
        Scanner input = new Scanner(System.in);
        boolean loop = true;
        Acervo acervo = new Acervo();
      
        while (loop) {
          printInicio();
          String tipoUsuario = input.nextLine();
          switch (tipoUsuario) {
            case "1":
              printTratadorADM();
              String tipoInteracaoADM = input.nextLine();
              switch (tipoInteracaoADM) {
                case "1":
                  TratadorDeAcervo tAcervo = new TratadorDeAcervo(acervo);
                  printInteracaoAcervo();
                  String escolhaOperacaoADM = input.nextLine();
                  switch (escolhaOperacaoADM) {
                    case "1":
                      System.out.println("Qual o título do livro?");
                      String tituloLivro = input.nextLine();
                      System.out.println("Qual o id do livro?");
                      String idLivro = input.nextLine();
                      tAcervo.incluirLivro(Integer.parseInt(idLivro), tituloLivro);
                      break;
                    case "2":
                      System.out.println("Qual o id do livro a ser excluído?");
                      idLivro = input.nextLine();
                      tAcervo.excluirLivro(Integer.parseInt(idLivro));
                      break;
                    case "3":
                      System.out.println("Qual o id do livro a ser consultado?");
                      idLivro = input.nextLine();
                      tAcervo.consultarLivro(Integer.parseInt(idLivro));
                      break;
                    case "4":
                      System.out.println("Qual o id do livro a ser atualizado?");
                      String id = input.nextLine();
                      System.out.println("Qual o novo título do livro?");
                      String novoTitulo = input.nextLine();
                      tAcervo.atualizarLivro(Integer.parseInt(id), novoTitulo);
                      break;
                    case "S":
                    case "s":
                      loop = false;
                      break;
                    default:
                      System.out.println("Escolha inválida.");
                      break;
                  }
                  break;
                case "2":
                  TratadorDeEstudante tEstudante = new TratadorDeEstudante();
                  printInteracaoEstudante();
                  String escolhaOperacaoEstudante = input.nextLine();
                  switch (escolhaOperacaoEstudante) {
                    case "1":
                      System.out.println("Qual o primeiro nome do estudante?");
                      String primeiroNome = input.nextLine();
                      System.out.println("Qual o sobrenome do estudante?");
                      String sobrenome = input.nextLine();
                      System.out.println("Qual o CPF do estudante?");
                      String cpf = input.nextLine();
                      tEstudante.incluirEstudante(primeiroNome, sobrenome, cpf);
                      break;
                    case "2":
                      System.out.println("Qual o CPF do estudante a ser excluído?");
                      cpf = input.nextLine();
                      tEstudante.excluirEstudante(cpf);
                      break;
                    case "3":
                      System.out.println("Qual o CPF do estudante a ser consultado?");
                      cpf = input.nextLine();
                      tEstudante.consultarEstudante(cpf);
                      break;
                    case "4":
                      System.out.println("Qual o CPF do estudante a ser atualizado?");
                      cpf = input.nextLine();
                      System.out.println("Qual o novo nome do estudante?");
                      String novoNome = input.nextLine();
                      System.out.println("Qual o novo sobrenome do estudante?");
                      String novoSobrenome = input.nextLine();
                      tEstudante.atualizarEstudante(cpf, novoNome, novoSobrenome);
                      break;
                    case ("S"):
                      loop = false;
                      break;
                    case ("s"):
                      loop = false;
                      break;
                    default:
                      System.out.println("Escolha inválida.");
                      break;
                  }
                  break;
                case "3":
                  TratadorDeAtendente tAtendente = new TratadorDeAtendente();
                  printInteracaoAtendente();
                  String escolhaOperacaoAtendente = input.nextLine();
                  switch (escolhaOperacaoAtendente) {
                    case "1":
                      System.out.println("Qual o primeiro nome do atendente?");
                      String primeiroNome = input.nextLine();
                      System.out.println("Qual o sobrenome do atendente?");
                      String sobrenome = input.nextLine();
                      System.out.println("Qual o CPF do atendente?");
                      String cpf = input.nextLine();
                      tAtendente.incluirAtendente(primeiroNome, sobrenome, cpf);
                      break;
                    case "2":
                      System.out.println("Qual o CPF do atendente a ser excluído?");
                      cpf = input.nextLine();
                      tAtendente.excluirAtendente(cpf);
                      break;
                    case "3":
                      System.out.println("Qual o CPF do atendente a ser consultado?");
                      cpf = input.nextLine();
                      tAtendente.consultarAtendente(cpf);
                      break;
                    case "4":
                      System.out.println("Qual o CPF do atendente a ser atualizado?");
                      cpf = input.nextLine();
                      System.out.println("Qual o novo nome do atendente?");
                      String novoNome = input.nextLine();
                      System.out.println("Qual o novo sobrenome do atendente?");
                      String novoSobrenome = input.nextLine();
                      tAtendente.atualizarAtendente(cpf, novoNome, novoSobrenome);
                      break;
                    case ("S"):
                      loop = false;
                      break;
                    case ("s"):
                      loop = false;
                      break;
                    default:
                      System.out.println("Escolha inválida.");
                      break;
                  }
                  break;
                case "4":
                  TratadorDePessoa tPessoa = new TratadorDePessoa();
                  printInteracaoPessoa();
                  String escolhaOperacaoPessoa = input.nextLine();
                  switch (escolhaOperacaoPessoa) {
                    case "1":
                      System.out.println("Qual o primeiro nome da pessoa?");
                      String primeiroNome = input.nextLine();
                      System.out.println("Qual o sobrenome da pessoa?");
                      String sobrenome = input.nextLine();
                      System.out.println("Qual o CPF da pessoa?");
                      String cpf = input.nextLine();
                      tPessoa.incluirPessoa(primeiroNome, sobrenome, cpf);
                      break;
                    case "2":
                      System.out.println("Qual o CPF da pessoa a ser excluída?");
                      cpf = input.nextLine();
                      tPessoa.excluirPessoa(cpf);
                      break;
                    case "3":
                      System.out.println("Qual o CPF da pessoa a ser consultada?");
                      cpf = input.nextLine();
                      tPessoa.consultarPessoa(cpf);
                      break;
                    case "4":
                      System.out.println("Qual o CPF da pessoa a ser atualizada?");
                      cpf = input.nextLine();
                      System.out.println("Qual o novo nome da pessoa?");
                      String novoNome = input.nextLine();
                      System.out.println("Qual o novo sobrenome da pessoa?");
                      String novoSobrenome = input.nextLine();
                      tPessoa.atualizarPessoa(cpf, novoNome, novoSobrenome);
                      break;
                    case ("S"):
                      loop = false;
                      break;
                    case ("s"):
                      loop = false;
                      break;
                    default:
                      System.out.println("Escolha inválida.");
                      break;
                  }
                  break;
                case "S":
                case "s":
                  loop = false;
                  break;
                default:
                  System.out.println("Escolha inválida.");
                  break;
              }
              break;
            case "2":
              printTratadorEstudante();
              String tipoInteracaoEstudante = input.nextLine();
              switch (tipoInteracaoEstudante) {
                case "1":
                  TratadorDeEmprestimo tEmprestimo = new TratadorDeEmprestimo();
                  Date data = new Date();
                  printEstudante();
                  String escolhaOperacao = input.nextLine();

                  switch (escolhaOperacao) {
                    case "1":
                      System.out.println("Qual o id do livro a ser reservado?");
                      String idLivro = input.nextLine();
                      Livro l = acervo.consultarLivro(Integer.parseInt(idLivro));
                      tEmprestimo.solicitarReserva(l);
                      break;
                    case "2":   
                      tEmprestimo.consultarReservas(acervo);
                      break;
                    case "3":
                      System.out.println("Qual o id do livro a ser emprestado?");
                      idLivro = input.nextLine();
                      l = acervo.consultarLivro(Integer.parseInt(idLivro));
                      tEmprestimo.realizarEmprestimo(l, data);
                      break;
                    case "4":
                      System.out.println("Qual o id do livro a ser renovado?");
                      idLivro = input.nextLine();
                      l = acervo.consultarLivro(Integer.parseInt(idLivro));
                      tEmprestimo.renovarEmprestimo(l);
                      break;
                    case "S":
                      loop = false;
                      break;
                    case "s":
                      loop = false;
                      break;
                    default:
                      System.out.println("Escolha inválida.");
                      break;
                  }
                  break;
                case "S":
                case "s":
                  loop = false;
                  break;
                default:
                  System.out.println("Escolha inválida.");
                  break;
              }
              break;
            case "3":
              printTratadorAtendente();
              String tipoInteracaoAtendente = input.nextLine();

              switch (tipoInteracaoAtendente) {
                case "1":
                  TratadorDeDevolucao tDevolucao = new TratadorDeDevolucao();
                  printAtendente();
                  String escolhaOperacao = input.nextLine();
                  switch (escolhaOperacao) {
                    case "1":
                      System.out.println("Qual o id do livro a ser devolvido?");
                      String idLivro = input.nextLine();
                      Livro l = acervo.consultarLivro(Integer.parseInt(idLivro));
                      System.out.println("Qual data o livro foi devolvido?");
                      String dataDevolucaoS = input.nextLine();
                      Date dataDevolucao = new SimpleDateFormat("dd/MM/yyyy").parse(dataDevolucaoS);  
                      tDevolucao.registrarDevolucao(l, dataDevolucao);
                      break;
                    case "2":
                      System.out.println("Quantos dias de atraso houveram?");
                      String dias = input.nextLine();
                      tDevolucao.emitirMulta(Integer.parseInt(dias));
                      break;
                    case "S":
                      loop = false;
                      break;
                    case "s":
                      loop = false;
                      break;
                    default:
                      System.out.println("Escolha inválida.");
                      break;
                  }
                  break;
                case "S":
                  loop = false;
                  break;
                case "s":
                  loop = false;
                  break;
                default:
                  System.out.println("Escolha inválida.");
                  break;
              }
              break;
            case "S":
              loop = false;
              break;
            case "s":
              loop = false;
              break;
            default:
              System.out.println("Escolha inválida.");
              break;
          }
        }
    }

    public static void printInicio() {
        System.out.println("+-----------------------------+");
        System.out.println("|           INÍCIO            |");
        System.out.println("|                             |");
        System.out.println("|       1: Administrador      |");
        System.out.println("|       2: Estudante          |");
        System.out.println("|       3: Atendente          |");
        System.out.println("|       S: Sair               |");
        System.out.println("|                             |");
        System.out.println("+-----------------------------+");
        System.out.println("Que tipo de usuário você é?    ");
    }

    public static void printTratadorADM() {
        System.out.println("+-----------------------------+");
        System.out.println("|         INTERAÇÃO           |");
        System.out.println("|                             |");
        System.out.println("|      1: Acervo              |");
        System.out.println("|      2: Estudante           |");
        System.out.println("|      3: Atendente           |");
        System.out.println("|      4: Pessoa              |");
        System.out.println("|      S: Sair                |");
        System.out.println("|                             |");
        System.out.println("+-----------------------------+");
        System.out.println("Você gostaria de interagir com qual tratador?");
    }

    public static void printInteracaoAcervo() {
        System.out.println("+-----------------------------+");
        System.out.println("|       ADMINISTRADOR         |");
        System.out.println("|                             |");
        System.out.println("|   1: Incluir Livro          |");
        System.out.println("|   2: Excluir Livro          |");
        System.out.println("|   3: Consultar Livro        |");
        System.out.println("|   4: Atualizar Livro        |");
        System.out.println("|   S: Sair                   |");
        System.out.println("|                             |");
        System.out.println("+-----------------------------+");
        System.out.println("Qual a operação desejada?");
    }

    public static void printInteracaoEstudante() {
        System.out.println("+-----------------------------+");
        System.out.println("|       ADMINISTRADOR         |");
        System.out.println("|                             |");
        System.out.println("|   1: Incluir Estudante      |");
        System.out.println("|   2: Excluir Estudante      |");
        System.out.println("|   3: Consultar Estudante    |");
        System.out.println("|   4: Atualizar Estudante    |");
        System.out.println("|   S: Sair                   |");
        System.out.println("|                             |");
        System.out.println("+-----------------------------+");
        System.out.println("Qual a operação desejada?");
    }

    public static void printInteracaoAtendente() {
        System.out.println("+-----------------------------+");
        System.out.println("|       ADMINISTRADOR         |");
        System.out.println("|                             |");
        System.out.println("|   1: Incluir Atendente      |");
        System.out.println("|   2: Excluir Atendente      |");
        System.out.println("|   3: Consultar Atendente    |");
        System.out.println("|   4: Atualizar Atendente    |");
        System.out.println("|   S: Sair                   |");
        System.out.println("|                             |");
        System.out.println("+-----------------------------+");
        System.out.println("Qual a operação desejada?");
    }

    public static void printInteracaoPessoa() {
        System.out.println("+-----------------------------+");
        System.out.println("|       ADMINISTRADOR         |");
        System.out.println("|                             |");
        System.out.println("|   1: Incluir Pessoa         |");
        System.out.println("|   2: Excluir Pessoa         |");
        System.out.println("|   3: Consultar Pessoa       |");
        System.out.println("|   4: Atualizar Pessoa       |");
        System.out.println("|   S: Sair                   |");
        System.out.println("|                             |");
        System.out.println("+-----------------------------+");
        System.out.println("Qual a operação desejada?");
    }

    public static void printTratadorEstudante() {
        System.out.println("+-----------------------------+");
        System.out.println("|         INTERAÇÃO           |");
        System.out.println("|                             |");
        System.out.println("|      1: Empréstimo          |");
        System.out.println("|      S: Sair                |");
        System.out.println("|                             |");
        System.out.println("+-----------------------------+");
        System.out.println("Você gostaria de interagir com qual tratador?");
    }

    public static void printEstudante() {
        System.out.println("+-----------------------------+");
        System.out.println("|          ESTUDANTE          |");
        System.out.println("|                             |");
        System.out.println("|   1: Solicitar reserva      |");
        System.out.println("|   2: Consultar reserva      |");
        System.out.println("|   3: Realizar emprestimo    |");
        System.out.println("|   4: Renovar emprestimo     |");
        System.out.println("|   S: Sair                   |");
        System.out.println("|                             |");
        System.out.println("+-----------------------------+");
        System.out.println("Qual a operação desejada?");
    }

    public static void printTratadorAtendente() {
        System.out.println("+-----------------------------+");
        System.out.println("|         INTERAÇÃO           |");
        System.out.println("|                             |");
        System.out.println("|      1: Devolução           |");
        System.out.println("|      S: Sair                |");
        System.out.println("|                             |");
        System.out.println("+-----------------------------+");
        System.out.println("Você gostaria de interagir com qual tratador?");
    }

    public static void printAtendente() {
        System.out.println("+-----------------------------+");
        System.out.println("|          ATENDENTE          |");
        System.out.println("|                             |");
        System.out.println("|   1: Registrar devolução    |");
        System.out.println("|   2: Emitir multa           |");
        System.out.println("|   S: Sair                   |");
        System.out.println("|                             |");
        System.out.println("+-----------------------------+");
        System.out.println("Qual a operação desejada?");
    }

    
}
