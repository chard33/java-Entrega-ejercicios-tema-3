package ejerciciosTema3;

public class Main {

    public static void main(String[] args){

        String[] nombres = {"SERGIO", "ALEJANDRO", "CAMPOS", "HERNANDEZ"};

        System.out.println(concatenarTextos(nombres));
    }

    private static String concatenarTextos(String[] nombres) {

        String nombre = "";

        for (String texto : nombres) {

            nombre += texto + " ";
        }

        return nombre;
    }
}
