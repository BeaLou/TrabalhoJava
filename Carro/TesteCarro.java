package Carro;

public class TesteCarro {
 
    public static void main(String[] args)
    {
        double velocidade = 0;

        Carro carro = new Carro(velocidade);

        carro.controlarCarro();
    }
}