import java.io.IOException;


public class Main {
	public static void main (String [] args) throws IOException {
		
		//System.out.println("<<<<<<<<<<<<<<<<<<BEFORE MOVEMENT>>>>>>>>>>>>>>>>>>");
		Cube cube =  importexport.convertjson();
		//Printer.printcube(cube);
		//System.out.println("<<<<<<<<<<<<<<<<<<AFTER MOVEMENT>>>>>>>>>>>>>>>>>>");
		//Printer.printcube(cube);
		
		/*cube = Movements.l(cube, 3, 6);//------------------------------------
		System.out.print("md5 ID: " + importexport.getMd5(importexport.create_string_cube(cube)));
		if((importexport.getMd5(importexport.create_string_cube(cube))).equals("130d0d212b8cc15f375b1b0f2cdf42ad")) {
			System.out.println(" <---YES  l3");
		}else {
			System.out.println(" <---NO  l3");
		}
		
		cube = Movements.D(cube, 8, 1, 1, 8);//---------------------------------------------------------------
		System.out.print("md5 ID: " + importexport.getMd5(importexport.create_string_cube(cube)));
		if((importexport.getMd5(importexport.create_string_cube(cube))).equals("d83b0f604f0fbdd646497bcc400cb701")) {
			System.out.println(" <---YES  D1");
		}else {
			System.out.println(" <---NO  D1");
		}
		
		cube = Movements.l(cube, 1, 8);//----------------------------------------------------
		System.out.print("md5 ID: " + importexport.getMd5(importexport.create_string_cube(cube)));
		if((importexport.getMd5(importexport.create_string_cube(cube))).equals("3072cd153434334e62487aa2c52d0b1c")) {
			System.out.println(" <---YES  l1");
		}else {
			System.out.println(" <---NO  l1");
		}
		
		cube = Movements.d(cube, 9, 0, 0, 9);//---------------------------------------------
		System.out.print("md5 ID: " + importexport.getMd5(importexport.create_string_cube(cube)));
		if((importexport.getMd5(importexport.create_string_cube(cube))).equals("dab05f73e4ed15c2394f1712f9dc4fca")) {
			System.out.println(" <---YES  d0");
		}else {
			System.out.println(" <---NO  d0");
		}
		
		cube = Movements.B(cube, 0);//-----------------------------------------------------
		System.out.print("md5 ID: " + importexport.getMd5(importexport.create_string_cube(cube)));
		if((importexport.getMd5(importexport.create_string_cube(cube))).equals("ff8a8cd7a7af5da72edfad5d0a801a97")) {
			System.out.println(" <---YES  B0");
		}else {
			System.out.println(" <---NO  B0");
		}
		
		cube = Movements.b(cube, 5);//-------------------------------------------------
		System.out.print("md5 ID: " + importexport.getMd5(importexport.create_string_cube(cube)));
		if((importexport.getMd5(importexport.create_string_cube(cube))).equals("8aef8f1a6b6d427fb55581dee01e2557")) {
			System.out.println(" <---YES  b5");
		}else {
			System.out.println(" <---NO  b5");
		}
		
		cube = Movements.l(cube, 2, 7);//-------------------------------------------
		System.out.print("md5 ID: " + importexport.getMd5(importexport.create_string_cube(cube)));
		if((importexport.getMd5(importexport.create_string_cube(cube))).equals("151faa80eb7b01fa8db7e8129778de10")) {
			System.out.println(" <---YES  l2");
		}else {
			System.out.println(" <---NO  l2");
		}
		
		cube = Movements.d(cube, 8, 1, 1, 8);//---------------------------------------------
		System.out.print("md5 ID: " + importexport.getMd5(importexport.create_string_cube(cube)));
		if((importexport.getMd5(importexport.create_string_cube(cube))).equals("e8682bbb2e6fabf5971e4b471ae2d46d")) {
			System.out.println(" <---YES  d1");
		}else {
			System.out.println(" <---NO  d1");
		}*/
		
		Movements.do_movement(cube,"l100000000");
		
	}
	
}
