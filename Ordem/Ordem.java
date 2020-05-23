package Ordem;

import javax.swing.JOptionPane;
import java.util.List;
import java.util.ArrayList;



public class Ordem {
    int x, y, z;
    // int[] ordemCrescente;

    public Ordem(int x, int y, int z)
    {
        this.x = Integer.parseInt(JOptionPane.showInputDialog(null,"Insira um valor inteiro - X"));;
        this.y = Integer.parseInt(JOptionPane.showInputDialog(null,"Insira um valor inteiro - Y"));;
        this.z = Integer.parseInt(JOptionPane.showInputDialog(null,"Insira um valor inteiro - Z"));;
    }
    

    public void mostrarMaior()
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

    public void mostrarMenor()
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

    public void mostrarCrescente()
    {
        System.out.println("Array crescente");
        List<Integer> ordemCrescente = new ArrayList<Integer>();
        Object[] arrayCrescente;

        if (x < y && x < z) ordemCrescente.add(x);
        else if (y < x && y < z) ordemCrescente.add(y);
        else ordemCrescente.add(z);

        if (x > y && x > z) ordemCrescente.add(1, x);
        else if (y > x && y > z) ordemCrescente.add(1, y);
        else ordemCrescente.add(1, y);

        if (!ordemCrescente.contains(x)) ordemCrescente.add(x);
        else if (!ordemCrescente.contains(y)) ordemCrescente.add(y);
        else ordemCrescente.add(z);

        arrayCrescente = ordemCrescente.toArray();

        for (int i = 0; i < arrayCrescente.length; i++) {
        System.out.println(arrayCrescente[i]);
        }
    }

    public void mostrarDecrescente()
    {
        System.out.println("Array decrescente");
       
        List<Integer> ordemDecrescente = new ArrayList<Integer>();
        Object[] arrayDecrescente;
        
        if (x > y && x > z) ordemDecrescente.add(x);
        else if (y > x && y > z) ordemDecrescente.add(y);
        else ordemDecrescente.add(y);
        
        if (x < y && x < z) ordemDecrescente.add(x);
        else if (y < x && y < z) ordemDecrescente.add(0, y);
        else ordemDecrescente.add(0, z);
        
        if (!ordemDecrescente.contains(x)) ordemDecrescente.add(0, x);
        else if (!ordemDecrescente.contains(y)) ordemDecrescente.add(0, y);
        else ordemDecrescente.add(0, z);
        
        arrayDecrescente = ordemDecrescente.toArray();
        
        for (int i = 0; i < arrayDecrescente.length; i++) {
        System.out.println(arrayDecrescente[i]);
        }        
    }
}