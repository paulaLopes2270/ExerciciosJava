package ExerciciosAula.Ex12;

import java.util.Scanner;

public class Main extends Mensagem {
    public static void main(String[] args) {
        Main principal = new Main();
        Scanner scanner = new Scanner(System.in);

        // Exibe a Mensagem A: "Cuide bem dos animais."
        principal.exibeMensagemA();

        // Solicita ao usuário uma mensagem para preservação do planeta
        System.out.println("Digite uma mensagem para a preservação do planeta:");
        String mensagem = scanner.nextLine();

        // Exibe a Mensagem B: mensagem digitada pelo usuário
        principal.exibeMensagemB(mensagem);

        scanner.close();
    }

    @Override
    public void exibeMensagemA() {
        System.out.println("Cuide bem dos animais.");
    }

    @Override
    public void exibeMensagemB(String mensagem) {
        System.out.println(mensagem);
    }
}
