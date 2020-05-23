package Pontuacao;

import javax.swing.JOptionPane;

public class Pontuacao {
    int pontosGanhos;
    int opcao;

    public Pontuacao(int pontosGanhos)
    {
        this.pontosGanhos =  0;
    }

    public void registrarPontuacao()
    {
        while(opcao != 4 && opcao <= 3)
        {
            opcao = Integer.parseInt(JOptionPane.showInputDialog(null,"Registro de Pontuação" +
            "(1) - Ganhar, (2) - Empatar, (3) - Perder, (4) - Sair."));
           if(opcao == 1 )
           {
               this.ganharPartida();
           }
           else if(opcao == 2)
           {
               this.empatarPartida();
           }
           else if(opcao == 3)
           {
               this.perderPartida();
           }
           else
           {
           System.out.print("A pontuação atual é: " + pontosGanhos);
           }
        }
    }


    public void ganharPartida()
    {
        pontosGanhos += 3;
    }

    public void empatarPartida()
    {
        pontosGanhos += 3;
    }

    public void perderPartida()
    {
        pontosGanhos += 0; 
    }
    
}