import java.io.IOException;


public class Main {
	public static void main (String [] args) throws IOException {
		
		System.out.println("<<<<<<<<<<<<<<<<<<BEFORE MOVEMENT>>>>>>>>>>>>>>>>>>");
		Cube cube =  importexport.convertjson();
		Printer.printcube(cube);
		System.out.println("<<<<<<<<<<<<<<<<<<AFTER MOVEMENT>>>>>>>>>>>>>>>>>>");
		cube = Movements.D0(cube);
		Printer.printcube(cube);
		
		
	}
	
}
