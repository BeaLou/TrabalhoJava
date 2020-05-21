package Aluno;
public class TesteAluno {
    public static void main( String[] args) {
         Aluno aluno1 = new Aluno("Beatriz Lourenço", "Sistemas de Informação", "n4438j5");
        System.out.println(aluno1.toString());

         Aluno aluno2 = new Aluno("Graziele Maria", "Administração Hospitalar", "n5587j8");
        System.out.println(aluno2.toString());

         Aluno aluno3 = new Aluno("Guilherme Ramos", "Engenharia Mecânica", "n7895j4");
        System.out.println(aluno3.toString());
    }  
}