import java.util.Scanner;


    public class at1 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            double nota = -1; // Começa com um valor inválido para forçar a entrada no loop

            // O laço continua enquanto a nota for MENOR que 0 OU MAIOR que 10
            while (nota < 0 || nota > 10) {
                System.out.print("Digite uma nota entre 0 e 10: ");
                nota = sc.nextDouble(); // Mudado para double para aceitar notas quebradas (ex: 7.5)

                // Se ainda for inválida, avisa o usuário antes de repetir
                if (nota < 0 || nota > 10) {
                    System.out.println("Nota inválida! Tente novamente.");
                }
            }

            // Só chega aqui quando a nota for válida
            System.out.println("Nota válida cadastrada com sucesso: " + nota);
            sc.close();
        }
    }

