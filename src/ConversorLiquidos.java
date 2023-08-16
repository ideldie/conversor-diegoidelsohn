import javax.swing.JOptionPane;

public class ConversorLiquidos {
	
	public void ConvertirLitrosAMililitros(double valor) {
		double litrosMil = valor * 1000;
		JOptionPane.showMessageDialog(null, valor + "litros son  " + litrosMil + " ml");
		}
	
	public void ConvertirLitrosACm (double valor) {
		double litrosCm = valor *1000;
		JOptionPane.showMessageDialog(null, valor + "litros son  " + litrosCm + " cm3");
	}
		
	public void ConvertirMililitrosALitros (double valor) {
		double mlALitros = valor /1000;
		JOptionPane.showMessageDialog(null, valor + "Mililitros son  " + mlALitros + " Litros");
	}
	
	public void ConvertirCmALitros (double valor) {
		double cmALitros = valor /1000;
		JOptionPane.showMessageDialog(null, valor + "Cm3 son  " + cmALitros + " Litros");
	}	}


