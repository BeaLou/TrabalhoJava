package Lampada;

import javax.swing.JOptionPane;

public class Lampada {
    boolean estado;

    public void ligarDesligar()
    {
        int opcao = Integer.parseInt(JOptionPane.showInputDialog(null,"Ligar lâmpada? (1) - Sim e (2) - Não"));
        
        if(opcao == 1)
        {
            this.ligar();
        }
        else
        {
            this.desligar();
        }
    }

    public boolean ligar()
    {
        estado = true;
        return estado;
    }
    public boolean desligar()
    {
        estado = false;
        return estado;
    }

    public void mostrarEstado(boolean estado)
    {
        if(estado == true)
        {
            System.out.println("Lâmpada ligada.");
        }
        else
        {
            System.out.print("Lâmpada desligada.");
        }
    }
    
}