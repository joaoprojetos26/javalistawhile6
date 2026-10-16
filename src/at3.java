import java.util.Scanner;

public class at3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cont=0;
        int cont2=0;
        System.out.println("digite um numero");
        while (cont<10){
            cont++;
            int num = sc.nextInt();
            if (num<0){
                cont2++;
            }
            System.out.println("digite novamente");
        }
        System.out.println("numeros nagativos: "+cont2);
        sc.close();
    }
}
