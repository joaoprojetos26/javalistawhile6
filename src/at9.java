import java.util.Scanner;

public class at9 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("escreva sua idade");
        int idade = sc.nextInt();
        int cont = 0;
        int soma = 0;
        while (idade>0){
           if (idade>0){
               soma += idade;
               cont++;
               System.out.println("escreva novamente");
           }
            idade = sc.nextInt();
        }
        System.out.println("media de idade e:"+(soma/cont));
    }
}
