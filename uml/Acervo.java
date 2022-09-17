package uml;

import java.util.ArrayList;

public class Acervo {
    ArrayList<Livro> Livros = new ArrayList<Livro>();
    
    public void incluirLivro(int id, String titulo){
        Livro l = consultarLivro(id);
        if (l == null) {
          Livro livro = new Livro(id, titulo);
          Livros.add(livro);
          System.out.println("Livro adicionado.");
        }
        else {
          System.out.println("Há um livro no id especificado.");
        }
    }
  
    public void excluirLivro(int id){
        Livro l = consultarLivro(id);
        if (l != null) {
          Livros.remove(l);
          System.out.println("Livro removido.");
        }
        else {
          System.out.println("Não há livro com o id indicado.");
        }
    }
  
    public Livro consultarLivro(int id){
      for (Livro l : Livros) {
        if (l.id == id) {
          return l;
        }
      }

      return null;
    }
  
    public void atualizarLivro(int id, String tituloNovo){
        Livro l = consultarLivro(id);
        if (l != null) {
          l.titulo = tituloNovo;
          System.out.println("Livro atualizado.");
        }
        else {
          System.out.println("Não há livro com o id indicado.");
        }
    }
}