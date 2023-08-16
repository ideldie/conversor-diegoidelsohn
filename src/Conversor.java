import javax.swing.JOptionPane;

public class Conversor {

		public void ConvertirPesosADolares (double valor) {
					
			double monedaDolar = valor / 685;
			monedaDolar = (double) Math.round(monedaDolar*100d)/100;
			JOptionPane.showMessageDialog(null, "Tienes $ " + monedaDolar+ "Dolares");
					}
		
		public void ConvertirPesosAEuros (double valor) {
			double monedaEuro = valor / 785;
			monedaEuro = (double) Math.round(monedaEuro*100d)/100;
			JOptionPane.showMessageDialog(null, "Tienes $ " + monedaEuro+ "Euros");
		}
		
		public void ConvertirPesosALibras(double valor) {
			double monedaLibra = valor / 800;
			JOptionPane.showMessageDialog(null, "Tenes " + monedaLibra + " Libras");
			} 
		
		public void ConvertirPesosAYen (double valor) {
			double monedaYen = valor / 900;
			JOptionPane.showMessageDialog(null, "Tenes " + monedaYen + " Yenes");
			}
		
		public void ConvertirPesosAWonCoreano (double valor) {
			double monedaWon = valor / 1000;
			JOptionPane.showMessageDialog(null, "Tenes " + monedaWon + " Wones");
			}
		
		
		
			
		
		
}


