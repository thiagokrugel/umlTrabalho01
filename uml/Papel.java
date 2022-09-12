package uml;
import java.util.ArrayList;

public class Papel {
    int id;
    ArrayList<Atendente> atendentes = new ArrayList<>();
    ArrayList<Estudante> estudantes = new ArrayList<>();

    public Papel(int id){
        this.id = id;
    }

    public Papel() {}
}
