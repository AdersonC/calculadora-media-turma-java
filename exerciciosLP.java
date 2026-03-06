package exercicios;

import java.util.Arrays;
import java.util.Scanner;

public class exerciciosLP {
    public static void main(String[] args) {

        int qtdAlunos;
        int qtdNotasAlunos = 0;

        Scanner sc = new Scanner(System.in);

        System.out.printf("Digite a quantidades de alunos: ");
        qtdAlunos = sc.nextInt();

        System.out.printf("Digite a quantidades de notas por aluno: ");
        qtdNotasAlunos = sc.nextInt();

        double[][] notaTurma = new double[qtdAlunos][qtdNotasAlunos];
        double notaTotal = 0;

        for (int a = 0; a < notaTurma.length; a++) {
            for (int n = 0; n < notaTurma[a].length; n++){
                System.out.printf("Nota %d do aluno %d: ", (a + 1), (n + 1));
                notaTurma[a][n] = sc.nextDouble();
                notaTotal += notaTurma[a][n];
                }
            }

        double media = notaTotal / (qtdAlunos * qtdNotasAlunos);

        System.out.println("media da turma: " + media);

        for (double[] notasAluno: notaTurma){
         System.out.println(Arrays.deepToString(notaTurma));
        }
    }
}






