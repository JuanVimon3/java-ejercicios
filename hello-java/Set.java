import java.util.ArrayList;
import java.util.HashSet;

public class Set {

    //Estructura de datos, similar al array, que almacena datos únicos (los crea usando una clave única para cada uno)

    static void main (String[] args){

        //Declaración y creación. nota: dentro de <Tipo de dato>

        HashSet<String> names = new HashSet<>(); //Manera clásica de definir las variables
        var numbers = new HashSet<Integer>(); //Manera moderna de definir variables

        //Tamaño
        System.out.println(names.size());

        //Añadir elementos

        names.add("Juan");
        names.add("Yazmin");
        names.add("David");

        System.out.println(names.size());

        //Acceder a los elementos. No ordena la lista de manera ordenada, lo que usa para guardar y ordenar es un hash, por lo que no todas las funciones son iguales a las de los ArrayList

//        System.out.println(names.getFirst());
//        System.out.println(names.get(1));
//        System.out.println(names.getLast());


        //Buscar elementos

        System.out.println(names.contains("Yazmin"));

        //Eliminar elementos: aquí no se busca por índice sino por el elemento mismo
        names.remove("David");

        //Conjuntos

        HashSet<String> countries = new HashSet<>();

        countries.add("Colombia");
        countries.add("USA");
        countries.add("España");

        names.addAll(countries);

        System.out.println(names);

        //La función retail() deja solo los elementos comunes

    }
}









