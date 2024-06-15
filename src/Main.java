import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado;
        teclado = new Scanner(System.in);

        System.out.println("Escoge uno de las 5 opciones mediante un numero entre 1 y 5: ");
        System.out.println("1)Numero mayor");
        System.out.println("2)Resultado");
        System.out.println("3)Operacion a eleccion");
        System.out.println("4)Numero primo");
        System.out.println("5)Cerrar menu");

        int Ejercicio = teclado.nextInt();

        String NE = "";

        switch (Ejercicio) {

            case 1: NE = "Numero mayor";
                Scanner sc = new Scanner(System.in);
                int n1, n2, n3;

                System.out.print("Introduzca primer numero: ");
                n1 = sc.nextInt();
                System.out.print("Introduzca segundo numero: ");
                n2 = sc.nextInt();
                System.out.print("Introduzca tercer numero: ");
                n3 = sc.nextInt();

                if (n1 > n2) {
                    System.out.println("El mayor es " + n1);
                } else if (n2 < n3) {
                    System.out.println("El mayor es " + n3);
                } else if (n3 < n2) {
                    System.out.println("El mayor es " + n2);
                }else{
                    System.out.println("Los números son iguales");
                }
                break;


            case 2: NE =
                        "B";
                break;


            case 3: NE = "Resultado de operaion seleccionada";
            Scanner es = new Scanner(System.in);
            int a1, a2;
            char s1;

             System.out.print("Escoja un numero: ");
             a1 = es.nextInt();
             System.out.print("Escoja un segundo numero: ");
             a2 = es.nextInt();
             System.out.print("Escoja la operacion entre /,*,+,-: ");
             s1 = es.next().charAt(0);

             System.out.println("Su resultado es= ");
             System.out.print(a1 & s1 & a2);
                break;


            case 4:
                NE =
                        "D";
                break;


            case 5:
                System.out.print("Menu cerrado con exito");
            default:
                break;
        }
    }

}
