package ExerciciosAula.Ex12;

import java.util.Scanner;

public class Main extends Mensagem {
    public static void main(String[] args) {
        Main principal = new Main();
        Scanner scanner = new Scanner(System.in);

        // Exibindo Mensagem A
        principal.exibeMensagemA();

        // Solicitando e exibindo Mensagem B
        System.out.println("Digite uma mensagem para a preservação do planeta:");
        String mensagem = scanner.nextLine();
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
