import javax.swing.JOptionPane;



public class Funciones {
	
		Conversor monedas = new Conversor();
		ConvertirMonedasAPesos pesos = new ConvertirMonedasAPesos();
		
	public void ConvertirMonedas(double minput) {
	Object[] opcionesMonedas = {"Pesos a Dolares", "Pesos a Euros","Pesos a Libras", "Pesos a Yen","Pesos a Won Coreano",
			"Dolares a Pesos","Euros a Pesos", "Libras a Pesos","Yen a Pesos", "Won Coreano a Pesos"};
	String conversorMonedas = (JOptionPane.showInputDialog(null,"Seleccionar Monedas ", "Monedas",JOptionPane.PLAIN_MESSAGE,
			null,opcionesMonedas,"Selecciona")).toString();
	
			switch(conversorMonedas) {
			
			case "Pesos a Dolares": 
				monedas.ConvertirPesosADolares(minput);
	        	break;
						
			case "Pesos a Euro":
				monedas.ConvertirPesosAEuros(minput);
				break;
			case "Pesos a Libras":
				monedas.ConvertirPesosALibras(minput);
				break;
			case "Pesos a Yen":
				monedas.ConvertirPesosAYen(minput);
				break;
			case "Pesos a Won Coreano":
				monedas.ConvertirPesosAWonCoreano(minput);
				break;    	    	                          
    
			case "Dolares a Pesos":
				pesos.ConvertirDolarAPesos(minput);
				break;
			case "Euro a Pesos":
    	pesos.ConvertirEurosAPesos(minput);
    	break;
			case "Libras a Pesos":
    	pesos.ConvertirLibrasAPesos(minput);
    	break;
			case "Yen a Pesos":
    	pesos.ConvertirYenAPesos(minput);
    	break;
			case "Won Coreano a Pesos":
        pesos.ConvertirWonAPesos(minput);
        break;
    
			}}}
	


    

			



