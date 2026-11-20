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
                    Ejercicio1();
                    break;
                case 2:
                    Ejercicio2();
                    break;
                default:
                    System.out.println("Ingrese otra opcion: ");
            }
            op = menu();
        }
    }
    
    public static int menu(){
        System.out.println("--MENU--");
        System.out.println("1. Sumatoria de variables");
        System.out.println("2. Cuantos primos tenés???");
        System.out.println("3. Salir ");
        System.out.print("Ingrese lo que desea hacer: ");
        int opcion = leer.nextInt();
        return opcion;
    }
    
    public static void Ejercicio1(){
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
        System.out.println();
        for (int i = 1; i<= n; i++){
            System.out.println("Termino i="+i + " "+ calcularTermino(i, x, r));
        }
        System.out.println();
        System.out.println("Resultado de la sumatoria: "+ calcularSumatoria(n, x, r));
    }
    
    public static void Ejercicio2(){
        System.out.print("Ingrese el tamano del arreglo a generar: ");
        int size = leer.nextInt();
        while (size < 0){
            System.out.print("Ingrese el tamano del arreglo a generar: ");
            size = leer.nextInt();
        }
        System.out.print("Ingrese el limite inferior: ");
        int infe = leer.nextInt();
        while (infe < 0){
            System.out.print("Ingrese el limite inferior: ");
            infe = leer.nextInt();
        }
        System.out.print("Ingrese el limite superior: ");
        int supe = leer.nextInt();
        while (supe <= infe){
            System.out.print("Ingrese el limite superior: ");
            supe = leer.nextInt();
        }
        System.out.println("Arreglo generado: "+ );
        System.out.println("No. divisores primos: "+ );
        System.out.println("Primos encontrados: "+ );
        System.out.println("Promedio de factores primos: "+ );
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
        double i2 = i+2;
        medio = potencia(i, r)/factorial(i+1);
        der = 1/i2;
        total = izq*medio*der;
        return total;
    }
    
    public static double calcularSumatoria(int n, int x, int r){
        double total = 0;
        for (int i = 1; i <= n; i++){
            total += calcularTermino(i, x, r);
        }
        return total;
    }
    
    public static int [] genRandArray(int tam, int min, int max){
        int [] arreglo = new int [tam];
        for (int i = 1; i <= arreglo.length ; i++){
            int num = min + r(max);
        }
    }
    
    public static int isPrime(int numero){
        
    }
    
    public static int countPrimeFactors(int numero){
        
    }
    
    public static int[] getTotalPrimeCount(int [] arreglo){
        
    }
    
    public static int[] filtrarPrimos(int [] arreglo){
        
    }
    
    public static double calcularPromedio(int [] arreglo){
        
    }
    
    public static void imprimirArreglo(int [] arreglo){
        
    }
}
