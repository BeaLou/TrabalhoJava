package Aluno;
public class Aluno {

    String RA, Nome, Curso;

    public Aluno( String Nome,String Curso, String RA){
        this.Nome = Nome;
        this.Curso = Curso;
        this.RA = RA;
    }

    @Override
    public String toString(){
        String retorno = "Aluno/a: " + Nome + " RA: " + RA + " Curso: " + Curso; 

        return retorno;
    }
}