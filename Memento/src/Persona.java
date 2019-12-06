public class Persona {

    private String nombre;

    public Memento GuardarMemento(){
        System.out.println("originator: guardando memento...");
        return new Memento(nombre);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


}
