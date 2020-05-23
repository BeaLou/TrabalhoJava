package Carro;

import javax.swing.JOptionPane;

public class Carro {
    double velocidade;
    int opcao;

    public Carro(double velocidade)
    {
        this.velocidade = velocidade;
        this.opcao = 1;
    }
    public void controlarCarro()
    {

        while(opcao == 1 || opcao == 2)
        {
            opcao = Integer.parseInt(JOptionPane.showInputDialog(null,"Acelerar carro? (1) - Sim e (2) - Não (3) - Exibir velocidade."));

            if(opcao == 1)
            {
                this.acelerar();
            }
            else if(opcao == 2 )
            {
                this.frear();
            }
            else
            {
                this.mostrarVelocidade();        
                break;
            }
        }
       
    }
    public double acelerar()
    {
        velocidade += 10;

        return velocidade;
    }

    public double frear()
    {
        velocidade += 10;
        return velocidade;
    }

    public void mostrarVelocidade()
    {
        System.out.println("A velocidade do carro é: " + velocidade);
    }
}