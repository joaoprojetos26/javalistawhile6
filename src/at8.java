import java.util.Scanner;

public class at8 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int cont = 0;
        double cityA = 1000;
        double cityB = 1500;
        while (cityB<cityA){
            cityA = cityA + (cityA * 0.02);
            cityB = cityB + (cityB * 0.01);
            cont++;
            System.out.println(cont);

        }
        System.out.println("A quantidade de anos :"+cont);
        sc.close();
    }
}
