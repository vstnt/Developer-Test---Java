import java.util.Scanner;

public class RemoveSpaces {
    public static void main(String[] args) {
        // Scanner para leitura de entrada do usuário
        Scanner scanner = new Scanner(System.in);

        // Solicita ao usuário que insira uma string
        System.out.println("Digite uma string:");
        String input = scanner.nextLine();

        // Remove espaços em branco usando StringBuilder
        StringBuilder stringBuilder = new StringBuilder();
        for (char c : input.toCharArray()) {
            if (!Character.isWhitespace(c)) {
                stringBuilder.append(c);
            }
        }

        // Converte StringBuilder para string e exibe o resultado
        String result = stringBuilder.toString();
        System.out.println("String sem espaços em branco: " + result);

        // Fecha o scanner
        scanner.close();
    }
}