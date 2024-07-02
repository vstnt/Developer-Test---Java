import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ThreeLetters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Pergunta ao usuário quantas palavras deseja inserir
        System.out.println("Quantas palavras você deseja inserir?");
        int numWords = scanner.nextInt();
        scanner.nextLine();  // Consome a nova linha deixada entrada do usuário no nextInt()

        // Inicializa a lista de palavras
        List<String> words = new ArrayList<>();

        // Permite que o usuário insira as palavras
        System.out.println("Por favor, insira as palavras:");
        for (int i = 0; i < numWords; i++) {
            System.out.print("Palavra " + (i + 1) + ": ");
            words.add(scanner.nextLine());
        }

        // Filtra as palavras que começam com 'a' e têm exatamente 3 letras
        List<String> result = filterWords(words);

        // Exibe o resultado
        System.out.println("Palavras que começam com 'a' e têm exatamente 3 letras:");
        result.forEach(System.out::println);

        scanner.close();
    }

    public static List<String> filterWords(List<String> words) {
        return words.stream()
                .filter(word -> word.startsWith("a") && word.length() == 3)
                .collect(Collectors.toList());
    }
}