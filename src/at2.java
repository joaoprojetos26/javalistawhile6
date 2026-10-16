import java.util.Scanner;

public class at2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int senha =0 ;
        System.out.println("digite sua senha");
        while (senha!=1234){
            senha = sc.nextInt();
           if (senha!=1234){
               System.out.println("digite novamente");
           }
        }
        System.out.println("senha correta");
        sc.close();
    }
}
