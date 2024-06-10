package ExerciciosAula.Ex12;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o nome do compromisso profissional:");
        String nomeProf = scanner.nextLine();
        System.out.println("Digite a data do compromisso profissional:");
        String dataProf = scanner.nextLine();
        System.out.println("Digite a hora do compromisso profissional:");
        String horaProf = scanner.nextLine();

        Profissional compromissoProfissional = new Profissional(nomeProf, dataProf, horaProf);

        System.out.println("Digite o nome do compromisso pessoal:");
        String nomePess = scanner.nextLine();
        System.out.println("Digite a data do compromisso pessoal:");
        String dataPess = scanner.nextLine();
        System.out.println("Digite a hora do compromisso pessoal:");
        String horaPess = scanner.nextLine();

        Pessoal compromissoPessoal = new Pessoal(nomePess, dataPess, horaPess);

        // Exibir informações de compromissos
        compromissoProfissional.exibeCompromisso();
        compromissoPessoal.exibeCompromisso();

        scanner.close();
    }
}
