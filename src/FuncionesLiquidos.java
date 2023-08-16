import javax.swing.JOptionPane;

public class FuncionesLiquidos {
	
	ConversorLiquidos liquidos = new ConversorLiquidos();
	
	public void ConvertirLiquidos (double minput) {
	
	Object[] opcionesLiquidos = {"Litros a Mililitros", "Litros a cm3","Mililitros a Litros", "cm3 a Litros"};
	String conversorLiquidos = (JOptionPane.showInputDialog(null,"Seleccionar Conversion ", "Liquidos",JOptionPane.PLAIN_MESSAGE,
			null,opcionesLiquidos,"Selecciona")).toString();
	
	
	switch (conversorLiquidos) {
	case "Litros a Mililitros":
		liquidos.ConvertirLitrosAMililitros(minput);
		 	break;
		 	
	case "Litros a cm3":
		liquidos.ConvertirLitrosACm(minput);
		break;
		
	case "Mililitros a Litros":
		liquidos.ConvertirMililitrosALitros(minput);
		 	break;
		 	
	case "cm3 a Litros":
		liquidos.ConvertirCmALitros(minput);
		break;
				
	}}}
	
	
	
	
