package Telefone;

import javax.swing.JOptionPane;

public class Telefone {
    int numeroMinutos = 0;
    double preco = 2.0;
    int vl;
    double prc;

    public void calculoContaTelefonica()
    {
        vl = Integer.parseInt(JOptionPane.showInputDialog("Insira os minutos da chamada:"));   
        this.duracaoLigacao(vl);

        prc = Integer.parseInt(JOptionPane.showInputDialog("Insira o valor:"));
        this.alterarPreco(prc);
    }

    public void duracaoLigacao(int vl)
    {
        numeroMinutos += vl;
    }

    public void alterarPreco(double prc)
    {
        preco += prc;
    }

    public void mostrarConta()
    {
        double conta = preco * (double)numeroMinutos;

        //System.out.println("O total da conta telefônica é de: R$" + conta);
        JOptionPane.showMessageDialog(null, "O valor total é de: R$" + conta);
    }
    
}