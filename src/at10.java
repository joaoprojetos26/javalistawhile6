import java.util.Scanner;

public class at10 {
    public static void main(String[] args) {
        int numero = 1; // Começa no número 1

        // O loop continua enquanto o número for menor ou igual a 15
        while (numero <= 15) {
            int quadrado = numero * numero; // Calcula o quadrado
            System.out.println(numero + " ao quadrado = " + quadrado);

            numero++; // Avança para o próximo número
        }
    }
}
