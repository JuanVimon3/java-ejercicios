import java.util.ArrayList;

public class List {
    static void main(String[] args){

        //Declaración y creación. nota: dentro de <Tipo de dato>

        ArrayList<String> names = new ArrayList<>(); //Manera clásica de definirlas variables
        var numbers = new ArrayList<Integer>(); //Manera moderna de definir variables

        //Tamaño

        System.out.println(names.size());

        //Añadir elementos. Se debe de hacer por medio de funciones, no por medio de reasignación de variables

        names.add("Juan");
        names.add("Yazmin");
        names.add("David");

        System.out.println(names.size());

        //Acceder a los elementos. Se hace por medio de funciones con índices no por medio de índices solamente

        System.out.println(names.getFirst());
        System.out.println(names.get(1));
        System.out.println(names.getLast());

        //Modificar los elementos

        names.set(0, "Juancho");
        System.out.println(names.getFirst());

        //Eliminar elementos

        names.remove(2);

        //Buscar elementos

        System.out.println(names.contains("Yazmin"));

        //Limpiar el array

        names.clear();
        System.out.println(names.size());

    }
}
