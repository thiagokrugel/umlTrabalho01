package uml;

public class Livro {
    String titulo;
    int id;
    String estado = "livre";

    public Livro(int id, String titulo){
        this.titulo = titulo;
        this.id = id;
    }
}
