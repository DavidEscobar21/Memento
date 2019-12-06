import java.util.ArrayList;

public class Caretaker {

    private ArrayList<Memento> estados = new ArrayList<>();

    public void AgregarMemento(Memento m){
// almaceno dentro del arreglo estados a mi objeto memento
        estados.add(m);
    }

    public Memento getMemento(int index) {
        return estados.get(index);
    }
}
