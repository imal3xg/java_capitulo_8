import matematicas.varias;
import java.util.Scanner;
public class PrEjercicios{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Función esCapicua:");
        System.out.print("Escribe un número: ");
        long x = sc.nextLong();
        System.out.println(varias.esCapicua(x));
        System.out.println();
        System.out.println("Función esPrimo:");
        System.out.print("Escribe un número: ");
        long x1 = sc.nextLong();
        System.out.println(varias.esPrimo(x1));
        System.out.println();
        System.out.println("Función siguientePrimo:");
        System.out.print("Escribe un número: ");
        long x2 = sc.nextLong();
        System.out.println(varias.siguientePrimo(x2));
        System.out.println();
        System.out.println("Función potencia:");
        System.out.print("Escribe un número: ");
        int base = sc.nextInt();
        System.out.print("Escribe un exponente: ");
        int exp = sc.nextInt();
        System.out.println("La potencia es: "+varias.potencia(base, exp));
        System.out.println();
        System.out.println("Función digitos:");
        System.out.print("Escribe un número: ");
        long x4 = sc.nextLong();
        System.out.println(varias.digitos(x4));
        System.out.println();
        System.out.println("Función voltea:");
        System.out.print("Escribe un número: ");
        long x5 = sc.nextLong();
        System.out.println(varias.voltea(x5));
        System.out.println();
        System.out.println("Función digitoN:");
        System.out.print("Escribe un número: ");
        long x6 = sc.nextLong();
        System.out.print("Indica una posición del número: ");
        int n = sc.nextInt();
        System.out.println(varias.digitoN(x6, n));
        System.out.println();
        System.out.println("Función posicionDeDigito:");
        System.out.print("Escribe un número: ");
        long x7 = sc.nextLong();
        System.out.print("Indica un número que se encuentre dentro del número: ");
        int numpos = sc.nextInt();
        System.out.println(varias.posicionDeDigito(x7, numpos));
        System.out.println();
        System.out.println("Función quitaPorDetras:");
        System.out.print("Escribe un número: ");
        long x8 = sc.nextInt();
        System.out.print("Indica la posición hasta la que cortar el número: ");
        int posdet = sc.nextInt();
        System.out.println(varias.quitaPorDetras(x8, posdet));
        System.out.println();
        System.out.println("Función quitaPorDelante:");
        System.out.print("Escribe un número: ");
        long x9 = sc.nextLong();
        System.out.print("Indica la posición hasta la que cortar el número por delante: ");
        int posdel = sc.nextInt();
        System.out.println(varias.quitaPorDelante(x9, posdel));
        System.out.println();
        System.out.println("Función pegaPorDetrás:");
        System.out.print("Escribe un número: ");
        long x10 = sc.nextLong();
        System.out.print("Indica el dígito que añadir detrás de él: ");
        int numdet = sc.nextInt();
        System.out.println(varias.pegaPorDetras(x10, numdet));
        System.out.println();
        System.out.println("Función pegaPorDelante:");
        System.out.print("Escribe un número: ");
        long x11 = sc.nextLong();
        System.out.print("Escribe el dígito que añadir delante de él: ");
        int numdel = sc.nextInt();
        System.out.println(varias.pegaPorDelante(x11, numdel));
        System.out.println();
        System.out.println("Función trozoDeNúmero:");
        System.out.print("Escribe un número: ");
        long x12 = sc.nextLong();
        System.out.print("Escribe la posición inicial: ");
        int ini = sc.nextInt();
        System.out.print("Escribe la posición final: ");
        int fin = sc.nextInt();
        System.out.println(varias.trozoDeNumero(x12, ini, fin));
        System.out.println();
        System.out.println("Función juntaNúmeros:");
        System.out.print("Escribe un número: ");
        long x13 = sc.nextLong();
        System.out.print("Escribe otro número: ");
        long y = sc.nextLong();
        System.out.println(varias.juntaNumeros(x13, y));
        sc.close();
    }
}