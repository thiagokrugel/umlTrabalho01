package uml;

public class TratadorDeAcervo {
    Acervo acervo;

    public TratadorDeAcervo(Acervo a) {
      this.acervo = a;
    }
  
    public void incluirLivro(int id, String titulo){
        acervo.incluirLivro(id, titulo);
    }
  
    public void excluirLivro(int id){
        acervo.excluirLivro(id);
    }
  
    public void consultarLivro(int id){
        Livro l = acervo.consultarLivro(id);
        if (l != null)
          System.out.printf("Livro %s: %s | Estado: %s\n", l.titulo, l.id, l.estado);
        else
          System.out.println("O livro não existe.");
    }
  
    public void atualizarLivro(int id, String tituloNovo){
        acervo.atualizarLivro(id, tituloNovo);
    }
}
