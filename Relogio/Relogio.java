package Relogio;

import javax.swing.JOptionPane;

public class Relogio {
    int hora = 0;
    int opcao;
    public void controlarHoras()
    {
        while(opcao <=3)
        {
            opcao = Integer.parseInt(JOptionPane.showInputDialog(null,"HORAS:\n (1) -Adicionar, (2) - Subtrair (3) - Exibir horas."));

            if(opcao == 1)
            {
                this.adicionarHora();
            }
            else if(opcao == 2)
            {
                this.subtrairHora();
            }
            else
            {
                this.mostrarHora();
            }
        }
    }

    public void adicionarHora()
    {
        if(hora < 23)
        {
            hora += 1;
        }
        else
        {
            hora = 0;
        }
    }

    public void subtrairHora()
    {
        if(hora > 0)
        {
            hora -= 1;
        }
        else
        {
            hora = 23;
        }
    }

    public void mostrarHora()
    {
        System.out.println("Horas: " + hora);
    }
 
}