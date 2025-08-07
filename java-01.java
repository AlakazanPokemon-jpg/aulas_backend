import java.util.Scanner;

public class Saudacao {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Lê o nome
        System.out.print("Digite seu nome: ");
        String nome = scanner.nextLine();

        // Lê a idade
        System.out.print("Digite sua idade: ");
        int idade = scanner.nextInt();

        // Mostra saudação
        System.out.println("Olá, " + nome + "!");

        // Verifica se é maior de idade
        if (idade >= 18) {
            System.out.println("Você é maior de idade.");
        } else {
            System.out.println("Você é menor de idade.");
        }

        scanner.close();
    }
}
