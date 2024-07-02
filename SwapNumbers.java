import java.util.Scanner;

public class SwapNumbers {
    public static void main(String[] args) {
        // Scanner para leitura de entrada do usuário
        Scanner scanner = new Scanner(System.in);

        // Solicita ao usuário que insira dois números
        System.out.print("Digite o primeiro número: ");
        int num1 = scanner.nextInt();

        System.out.print("Digite o segundo número: ");
        int num2 = scanner.nextInt();

        // Exibe os valores originais
        System.out.println("Valores originais - primeiro número: " + num1 + ", segundo número: " + num2);

        // Troca os números sem usar uma terceira variável
        num1 = num1 + num2; // num1 agora é a soma dos dois números
        num2 = num1 - num2; // num2 agora é o valor original de num1
        num1 = num1 - num2; // num1 agora é o valor original de num2

        // Exibe os valores trocados
        System.out.println("Valores trocados - primeiro número: " + num1 + ", segundo número: " + num2);

        // Fecha o scanner
        scanner.close();
    }
}