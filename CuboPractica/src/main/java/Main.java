import java.io.IOException;


public class Main {
	public static void main (String [] args) throws IOException {
		
		System.out.println("<<<<<<<<<<<<<<<<<<BEFORE MOVEMENT>>>>>>>>>>>>>>>>>>");
		Cube cube =  importexport.convertjson();
		Printer.printcube(cube);
		System.out.println("<<<<<<<<<<<<<<<<<<AFTER MOVEMENT>>>>>>>>>>>>>>>>>>");
		cube = Movements.l(cube,0,2);
		cube = Movements.l(cube,0,2);
		cube = Movements.l(cube,0,2);
		cube = Movements.l(cube,0,2);

		Printer.printcube(cube);
		//System.out.println("Cube string: "  + importexport.create_string_cube(cube));
		//System.out.println("md5 ID: " + importexport.getMd5(importexport.create_string_cube(cube)));
		
		
	}
	
}
