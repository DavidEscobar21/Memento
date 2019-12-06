import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        Caretaker caretaker = new Caretaker();
        Persona p = new Persona();

        p.setNombre("David");
        p.setNombre("Andrew");

        caretaker.AgregarMemento(p.GuardarMemento());


        p.setNombre("Miriam");

        caretaker.AgregarMemento(p.GuardarMemento());

        p.setNombre("Wos");


        //*
        Memento m1 = caretaker.getMemento(0);
        System.out.println(m1.getGuardarEstado());
        Memento m2 = caretaker.getMemento(1);
        System.out.println(m2.getGuardarEstado());

        System.out.println(p.getNombre());  /*/

        Memento m1 = caretaker.getMemento(0);
        System.out.println("Primer estado guardado: "+m1.getGuardarEstado());
        Memento m2 = caretaker.getMemento(1);
        System.out.println("Segundo estado guardado: "+m2.getGuardarEstado());

        System.out.println("Estado actual: "+p.getNombre()); //*/















//        p.restaurarDesdeMemento(caretaker.getMemento(1));


        //        Scanner sc = new Scanner(System.in);
//        int x;
//        do{
//            System.out.println("1. agregar nombre");
//            System.out.println("2. restaurar nombres ");
//            System.out.println("3. imprimir nombre");
//            x = sc.nextInt();
//            switch (x) {
//                case 1:
//                    System.out.println("ingrese el nombre");
//                    sc.nextLine();
//                    String nombre = sc.nextLine();
//                    p.setNombre(nombre);
//                    caretaker.AgregarMemento(p.GuardarMemento());
//                    break;
//                case 2:
//                    System.out.println("ingrese el indice");
//                    int z = sc.nextInt();
//                    p.restaurarDesdeMemento(caretaker.getMemento(z));
//
//                    break;
//                case 3:
//                    Memento m1 = caretaker.getMemento(0);
//                    Memento m2 = caretaker.getMemento(1);
//                    System.out.println("...............");
//                    System.out.println(m1.getGuardarEstado());
//                    System.out.println(m2.getGuardarEstado());
//                    System.out.println("...............");
//                    break;
//                case 4:
//                    break;
//
//            }
//        }while (x!=5);




    }
}
