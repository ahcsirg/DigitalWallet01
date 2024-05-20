package cl.AlkeWalletProyect01;

/**
 * 
 * @author Alexis Santander
 *
 */

public class Currency {
	
	public static double convertirEurosADolares(double euros) {
     
        double tasaConversion = 1.18; // 1 euro = 1.18 dólares
        return euros * tasaConversion;
    }

    public static double convertirDolaresAEuros(double dolares) {
        double tasaConversion = 0.85; // 1 dólar = 0.85 euros
        return dolares * tasaConversion;
    }
    
    public static double convertirDolaresACLP(double dolares) {
        double tasaConversion = 894.50; // 1 dólar = 894.50 clp
        return dolares * tasaConversion;
    }

}
