import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class GeradorDeSenha {

    private static final String MINUSCULAS = "abcdefghijklmnopqrstuvwxyz";
    private static final String MAIUSCULAS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    private static final String NUMEROS = "0123456789";
    private static final String SIMBOLOS = "!@#$%&*?-_+=";

    private static final SecureRandom random = new SecureRandom();

    public static String gerarSenha(int tamanho) {
        if (tamanho < 4) {
            throw new IllegalArgumentException("O tamanho mínimo é 4.");
        }

        String todos = MINUSCULAS + MAIUSCULAS + NUMEROS + SIMBOLOS;
        List<Character> senha = new ArrayList<>();

        // 1. Garante um caractere de cada tipo
        senha.add(sortear(MINUSCULAS));
        senha.add(sortear(MAIUSCULAS));
        senha.add(sortear(NUMEROS));
        senha.add(sortear(SIMBOLOS));

        // 2. Completa o restante com qualquer caractere
        for (int i = senha.size(); i < tamanho; i++) {
            senha.add(sortear(todos));
        }

        // 3. Embaralha
        Collections.shuffle(senha, random);

        // 4. Converte a lista em String
        StringBuilder sb = new StringBuilder();
        for (char c : senha) {
            sb.append(c);
        }
        return sb.toString();
    }

    private static char sortear(String caracteres) {
        return caracteres.charAt(random.nextInt(caracteres.length()));
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Tamanho da senha: ");
        int tamanho = scanner.nextInt();

        System.out.println("Senha gerada: " + gerarSenha(tamanho));
        scanner.close();
    }
}