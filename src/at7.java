import java.util.Scanner;

public class at7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("digite um numero inteiro positivo");
        int num = sc.nextInt();
        long fatorial = 1;
        if (num<0){
            System.out.println("nao tem como eu fazer um fatorial de um numero negativo");
        } else if (num==0) {
            System.out.println("fatorial de 0 e 1");
        } else ;
        int cont=num;
        while (cont>1){
            fatorial *= cont;
            cont--;
        }
        System.out.println("O fatorial de " + num + " é " + fatorial + ".");
        sc.close();
    }
}
