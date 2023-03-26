package algoritmos;

public class Main {

    public static void main(String[] args) {
	System.out.println(
		findCheaperTaxi("2.50", "5.00", "1.00", "0.75"));
    }

    public static String findCheaperTaxi(String taxaFixaEmpresa1,
	    String taxaFixaEmpresa2, String valorKMEmpresa1,
	    String valorKMEmpresa2) {

	Double taxa1 = Double.parseDouble(taxaFixaEmpresa1);
	Double taxa2 = Double.parseDouble(taxaFixaEmpresa2);
	Double km1 = Double.parseDouble(valorKMEmpresa1);
	Double km2 = Double.parseDouble(valorKMEmpresa2);

	StringBuilder builder = new StringBuilder();
	String resp1 = "";
	String resp2 = "";
	String resp3 = "";

	int loop = 0;

	boolean foundEqual = false;
	boolean if2 = true;

	Double totalKM = 1d;
	Double kmFixo = 1d;
	Double totalEmpresa1 = 0d;
	Double totalEmpresa2 = 0d;
	while (loop < 2) {
	    totalEmpresa1 = taxa1 + (km1 * totalKM);
	    totalEmpresa2 = taxa2 + (km2 * totalKM);

	    if (if2 && totalEmpresa1.equals(totalEmpresa2)) {
		resp2 = "Tanto faz quando a distância = " + totalKM
			+ ", ";
		kmFixo = totalKM;
		if2 = false;
		loop++;
		foundEqual= true;
	    }
	    if (foundEqual && totalEmpresa1 < totalEmpresa2) {
		resp1 = "Empresa 1 quando a distância < " + kmFixo
			+ ", ";
		resp3 = "Empresa 2 quando a distância > " + kmFixo;
		foundEqual = false;
		loop++;
	    }

	    if (foundEqual && totalEmpresa1 > totalEmpresa2) {
		resp1 = "Empresa 2 quando a distância < " + kmFixo
			+ ", ";
		resp3 = "Empresa 1 quando a distância > " + kmFixo
			+ ", ";
		foundEqual = false;
		loop++;
	    }

	    totalKM++;
	}
	builder.append(resp1 + resp2 + resp3);
	return builder.toString();
    }
}
