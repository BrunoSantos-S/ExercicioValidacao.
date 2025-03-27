import java.util.*;

public class ValidacaoSenha {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String senha;

        System.out.println("Digite a senha correta para acessar:");

        // Continua pedindo até o usuário digitar "Java21"
        do {
            System.out.print("Senha: ");
            senha = s.next();
        } while (!senha.equals("Java21"));

        System.out.println("Acesso permitido.");
        s.close();
    }
}
