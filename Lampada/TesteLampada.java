package Lampada;

public class TesteLampada {
    public static void main(String[] args)
    {
        Lampada lampada = new Lampada();

        lampada.ligarDesligar();
        
        lampada.mostrarEstado(lampada.estado);

    }
}