import java.util.*;

public class Validacao {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n, tentativas = 0;
        boolean valido = false;

        System.out.println("=== VALIDAÇÃO DE NÚMERO ===");
        System.out.println("Digite um número entre 1 e 5.\n");

        // Laço que continua até o usuário digitar um valor válido
        do {
            System.out.print("Informe um número: ");
            n = s.nextInt();
            tentativas++;

            // Verifica se o número está dentro do intervalo permitido
            if (n >= 1 && n <= 5) {
                valido = true; // Marca que o valor é válido
            } else {
                System.out.println("Número inválido! Tente novamente.\n");
            }

            // Se o usuário errar muitas vezes, dá um aviso
            if (tentativas == 3 && !valido) {
                System.out.println("Dica: O número deve estar entre 1 e 5.");
            }
        } while (!valido);

        // Mensagem final com o número de tentativas
        System.out.println("\nNúmero válido confirmado: " + n);
        System.out.println("Tentativas: " + tentativas);

        s.close();
    }
}
