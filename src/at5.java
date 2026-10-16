import java.util.Scanner;

public class at5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("digite o valor da sua compra ou um numero negativo para sair");
        double compra = 0;
        double soma = 0;
        while (compra>=0){
            compra = sc.nextDouble();
            if (compra>=0){
                System.out.println("digite novamente");
            }
            soma = compra+soma;
        }
        System.out.println("total da sua compra"+soma);
        sc.close();
    }
}
