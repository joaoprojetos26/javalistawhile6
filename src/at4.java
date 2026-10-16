import java.util.Scanner;

public class at4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("digite um numero ou 0 para sair");
        int num =1;
        while (num!=0){
            num=sc.nextInt();
            if (num!=0){
                System.out.println("digite novamente");
            }
        }
        sc.close();
    }
}
