import java.util.Scanner;

public class at6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("digite a base");
        int base = sc.nextInt();
        System.out.println("digite o expoente");
        int expoente = sc.nextInt();
        int cont = 0;
        long resultado = 1; // Usamos 'long' para suportar números maiores
        while (cont<expoente){
            resultado = resultado*base;
            cont++;
        }
        System.out.println("O resultado de " + base + " elevado a " + expoente + " é: " + resultado);
        sc.close();

    }
}
