package Ordem;
import javax.swing.JOptionPane;

public class Ordem {
    int x, y, z;

    public Ordem(int x, int y, int z)
    {
        this.x = Integer.parseInt(JOptionPane.showInputDialog(null,"Insira um valor inteiro - X"));;
        this.y = Integer.parseInt(JOptionPane.showInputDialog(null,"Insira um valor inteiro - Y"));;
        this.z = Integer.parseInt(JOptionPane.showInputDialog(null,"Insira um valor inteiro - Z"));;
    }

    public void mostrarMaior(int x, int y, int z)
    {
        if(x > y && x > z)
        {
            JOptionPane.showMessageDialog(null,"X=" + x + " é o maior número.");
        }
        else if( y > x && y > z)
        {
            JOptionPane.showMessageDialog(null,"Y=" + y + " é o maior número.");
        }
        else
        {
            JOptionPane.showMessageDialog(null,"Z=" + z + " é o maior número.");
        }
    }

    public void mostrarMenor(int x, int y, int z)
    {
        if(x < y && x < z)
        {
            JOptionPane.showMessageDialog(null,"X=" + x + " é o menor número.");
        }
        else if( y < x && y < z)
        {
            JOptionPane.showMessageDialog(null,"Y=" + y + " é o menor número.");
        }
        else
        {
            JOptionPane.showMessageDialog(null,"Z=" + z + " é o menor número.");
        }
    }

    public void mostrarCrescente(int x, int y, int z)
    {

    }

    public void mostrarDecrescente(int x, int y, int z)
    {

    }
}