package Automovel;

import javax.swing.JOptionPane;

public class Automovel {
	String Placa, Cor, Combustivel, Renavam, Chassi;
	int NrPortas, NrMarchas, Velocidade;
	long Quilometragem;
    boolean Ligado = false;
	
    public Automovel() 
    {
        JOptionPane.showMessageDialog(null,"Cadastro de Veículo: ");
        
		this.Placa = JOptionPane.showInputDialog("Placa do veículo: ");
		this.Cor = JOptionPane.showInputDialog("Cor do seu veículo: ");
		this.Combustivel = JOptionPane.showInputDialog("Utiliza álcool ou diesel? ");
		this.Renavam = JOptionPane.showInputDialog("Renavam do veículo: ");
		this.Chassi = JOptionPane.showInputDialog("Chassi do veículo: ");
		this.NrPortas = Integer.parseInt(JOptionPane.showInputDialog("Número de portas: "));
		this.NrMarchas = Integer.parseInt(JOptionPane.showInputDialog("Quantidade de marchas: "));
		this.Velocidade = Integer.parseInt(JOptionPane.showInputDialog("Velocidade máxima do veículo: "));
        this.Quilometragem = Integer.parseInt(JOptionPane.showInputDialog("Quilômetros percorridos: "));
	}
	
    public void ligarDesligar(boolean liga, boolean desliga)
    {
		if (Ligado == true) {
            System.out.println("Carro ligado!");
            liga = true;
		}
		else if (Ligado == false) {
            System.out.println("\nCarro desligado!");
            desliga = true;
        }
    }

    @Override
    public String toString() 
    {
        String retorno ="Placa: " + Placa + " Cor: " + Cor + " Combustível: " + Combustivel +
         "\nRenavam: " + Renavam + " Chassi: " + Chassi + "Quantidade de Portas: " + NrPortas +
         "\nQuantidade de Marchas: " + NrMarchas + " Velocidade Máx: " + Velocidade + " Quilometragem: " +
         Quilometragem + "Carro Ligado: " + Ligado; 
        
         return retorno;				
	}

}
