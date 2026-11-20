package lab6p1_juliomartinez;
import java.util.Scanner;
import java.util.Random;
public class Lab6P1_JulioMartinez {
    static Scanner leer = new Scanner(System.in);
    static Random r = new Random();
    public static void main(String[] args) {
        int op = menu();
        while(op != 3){
            switch (op){
                case 1:
                    ejercicio1();
                    break;
                case 2:
                    
                    break;
                default:
                    System.out.println("Ingrese otra opcion: ");
            }
            op = menu();
        }
    }
    
    public static int menu(){
        System.out.println("--MENU--");
        System.out.println("1. ");
        System.out.println("1. ");
        System.out.println("1. ");
        System.out.println("4. Salir ");
        System.out.print("Ingrese lo que desea hacer: ");
        int opcion = leer.nextInt();
        return opcion;
    }
    
    public static void ejercicio1(){
        double total = 0;
        System.out.print("Ingrese n (1 a 169): ");
        int n = leer.nextInt();
        while (n < 1 || n > 169){
            System.out.print("Ingrese n (1 a 169): ");
            n = leer.nextInt();
        }
        System.out.print("Ingrese x (0 a 170): ");
        int x = leer.nextInt();
        while (x < 0 || x > 170){
            System.out.print("Ingrese n (0 a 170): ");
            x = leer.nextInt();
        }
        System.out.print("Ingrese r (0 a 5): ");
        int r = leer.nextInt();
        while (r < 0 || r > 5){
            System.out.print("Ingrese r (0 a 5): ");
            r = leer.nextInt();
        }
        
        
    }
    
    public static double factorial(int numero){
        double facto = 1;
        for (int i = 1; i <= numero; i++){
            facto *= i;
        }
        return facto;
    }
    
    public static double potencia(int base, int exponente){
        double total = 1;
        if (exponente <= 0){
            total = 1;
        }
        for (int i = 1; i <= exponente; i++){
            total *= base;
        }
        return total;
    }
    
    public static double combinatoria(int x, int r){
        double total = factorial(x)/(factorial(r)*factorial(x-r));
        return total;
    }
    
    public static double calcularTermino(int i, int x, int r){
        double medio = 0;
        double der = 0;
        double izq = combinatoria(x, r);
        double total = 0;
        medio = potencia(i, r)/factorial(i+1);
        der = 1/(i+2);
        total = izq*medio*der;
        return total;
    }
    
    public static double calcularSumatoria(int n, int x, int r){
        double total = 0;
        for (int i = 1; i <= n; i++){
            total += calcularTermino(i, x, r);
        }
    }
    
}
