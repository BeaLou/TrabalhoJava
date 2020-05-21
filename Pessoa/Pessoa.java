package Pessoa;

public class Pessoa {
    String RG, CPF, Nome, Endereco, Celular, Email;
	double Altura, Peso;
	char Sexo;
	int Idade;
    
    public Pessoa(String Nome, String RG, String CPF, String Endereco, String Celular,
         String Email, double Altura, double Peso, char Sexo, int Idade)
    {
        this.Nome = Nome;
        this.RG = RG;
        this.CPF = CPF;
        this.Endereco = Endereco;
        this.Celular = Celular;
        this.Email = Email;

        this.Altura = Altura;
        this.Peso = Peso;
        
        this.Sexo = Sexo;

        this.Idade = Idade;
    }

    public String toString()
    {
        String retornoString = "Nome: " + Nome + " RG: " + RG + " CPF: " + CPF 
        + "\n Endereço: " + Endereco + " Celular:" + Celular + " E-mail: " + Email;

        String retornoDouble = "Altura: " + Altura + " Peso: " + Peso;

        String retornoCharInt = "Sexo: " + Sexo + " Idade: " + Idade;

        String retorno  = retornoString + "\n" + retornoDouble + "\n" + retornoCharInt;
        
        return retorno;
    }
}