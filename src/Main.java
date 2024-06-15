import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado;
        teclado = new Scanner(System.in);

        System.out.println("Escoge uno de los 4 ejercicios mediante un numero entre 1 y 4: ");
        System.out.println("1)Numero mayor");
        System.out.println("2)Resultado");
        System.out.println("3)Operacion a eleccion");
        System.out.println("4)Numero primo");
        System.out.println("5)Cerrar menu");

        int Ejercicio = teclado.nextInt();

        String NE = "";

        switch (Ejercicio) {

            case 1: NE =
                    "A";
            break;


            case 2: NE =
                    "B";
            break;


            case 3: NE =
                    "C";
            break;


            case  4: NE =
                    "D";
            break;


            case 5: System.out.print("Menu cerrado con exito");
            default:
            break;
        }
    }
}