import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Insira os dados do Funcionario:");
        System.out.print("ID: ");
        String funcId = sc.nextLine();
        System.out.print("Nome: ");
        String funcNome = sc.nextLine();
        System.out.print("Contato: ");
        String funcContato = sc.nextLine();
        System.out.print("Função: ");
        String funcFuncao = sc.nextLine();
        Funcionario funcionario = new Funcionario(funcId, funcNome, funcContato, funcFuncao);
        System.out.println("\nDados do Funcionario:");
        System.out.println(funcionario);

        System.out.println("\nInsira os dados do Aluno:");
        System.out.print("ID: ");
        String alunoId = sc.nextLine();
        System.out.print("Nome: ");
        String alunoNome = sc.nextLine();
        System.out.print("Contato: ");
        String alunoContato = sc.nextLine();
        System.out.print("Data de Inscrição: ");
        String alunoDataInscricao = sc.nextLine();
        Aluno aluno = new Aluno(alunoId, alunoNome, alunoContato, alunoDataInscricao);
        System.out.println("\nDados do Aluno:");
        System.out.println(aluno);

        System.out.println("\nInsira os dados do Treino:");
        System.out.print("ID: ");
        String treinoId = sc.nextLine();
        System.out.print("Nome: ");
        String treinoNome = sc.nextLine();
        System.out.print("Descrição: ");
        String treinoDescricao = sc.nextLine();
        System.out.print("Duração (em minutos): ");
        int treinoDuracao = sc.nextInt();
        sc.nextLine();
        System.out.print("Nível de Dificuldade: ");
        String treinoNivelDificuldade = sc.nextLine();
        Treino treino = new Treino(treinoId, treinoNome, treinoDescricao, treinoDuracao, treinoNivelDificuldade);
        System.out.println("\nDados do Treino:");
        System.out.println(treino);

        sc.close();
    }
}