package Pessoa;

public class TestePessoa {
    public static void main(String[] args)
    {
        Pessoa pessoa1 = new Pessoa("Cristiane Sebastiana Nina Lopes","40.652.898-6",
        "847.080.499-51","Quadra 8 LE 13","(61) 99472-8412",
        "ccristianesebastiananinalopes@msds.com.br",1.66,56.8,'F',60);

        System.out.println(pessoa1.toString());

        Pessoa pessoa2 = new Pessoa("Arthur Breno Miguel Caldeira","45.602.722-1",
        "228.947.460-67","Rua Paulo Augusto Fonseca","(34) 99523-2118",
        "arthurbrenomiguelcaldeira@tam.com.br",1.90,85.1,'F',35);

        System.out.println(pessoa2.toString());

        Pessoa pessoa3 = new Pessoa("Bruna Heloisa Pereira","40.665.898-6",
        "847.080.499-51","Av Rebolças","(11) 98752-8412",
        "BrunninhaahLinda@outlook.com.br",1.46,56.8,'F',12);

        System.out.println(pessoa3.toString());
        
    }
}