import javax.swing.JOptionPane;

public class MenuInicio {
	
	public static void main(String[] args) {
		
		Funciones monedas = new Funciones();
		FuncionesLiquidos liquidos = new FuncionesLiquidos();
				
		boolean flag = true;
		while (flag) {
		
		Object[] opciones = {"Conversor de Monedas", "Conversor de Liquidos", "Conversor de Pesos"};
		String conversor = (JOptionPane.showInputDialog(null,"Seleccionar un conversor ", "Conversores",JOptionPane.PLAIN_MESSAGE,
				null,opciones,"Selecciona")).toString();

		String valor = (JOptionPane.showInputDialog("Ingresa la cantidad que quieres convertir"));
		double valorNumerico = Integer.valueOf(valor);
		System.out.println(valorNumerico);
		System.out.println(valor);
				
		switch (conversor) {
		
		case "Conversor de Monedas":
		if (ValidarNumero(valor)) {
			double minput  = Double.parseDouble(valor);
				monedas.ConvertirMonedas(minput);}
		else {JOptionPane.showMessageDialog(null, "valor invalido");
		}
			break;	 			 
		case "Conversor de Liquidos":
			
			if (ValidarNumero(valor)) {
				double minput  = Double.parseDouble(valor);
					liquidos.ConvertirLiquidos(minput);}
		else {JOptionPane.showMessageDialog(null, "valor invalido");
		}
				break;}
					
		 int finalizar = JOptionPane.showConfirmDialog(null,"Deseas realizar otra conversion?");
			
			if (JOptionPane.OK_OPTION == finalizar) {
				System.out.println("Opcion afirmativa");
				
			} else {
				flag = false;
					JOptionPane.showMessageDialog(null, "Programa Finalizado");
			}}}
				
		
		
			

		public static boolean ValidarNumero(String conversor) {
		try {
			double x = Double.parseDouble(conversor);
			if (x >= 0 || x < 0) {
				return true;
			}} catch (NumberFormatException e) {
				return false;
			}
		return false;}}	

		       
	