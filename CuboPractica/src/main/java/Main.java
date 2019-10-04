import java.io.IOException;


public class Main {
	public static void main (String [] args) throws IOException {
		
		System.out.println("<<<<<<<<<<<<<<<<<<BEFORE MOVEMENT>>>>>>>>>>>>>>>>>>");
		Cube cube =  importexport.convertjson();
		Printer.printcube(cube);
		System.out.println("<<<<<<<<<<<<<<<<<<AFTER MOVEMENT>>>>>>>>>>>>>>>>>>");
		cube = Movements.L0(cube);
		Printer.printcube(cube);
	}
	
	
	
	

	/*public static Cube middleVertical(Cube c) {
		int	[][]matriz1;
		int [][]matriz2;
		
		matriz1=nonReference(c.getBack());
		matriz2=nonReference(c.getUp());
		for (int i=0;i<matriz1.length;i++) {
				matriz2[1][matriz1.length-i-1]=matriz1[1][i];
		}
		matriz1=nonReference(c.getUp());
		printarray(c.getUp());
		c.setUp(matriz2);
		matriz2=nonReference(c.getFront());
		printarray(c.getFront());
		
		for (int i=0;i<matriz1.length;i++) {
			matriz2[1][matriz1.length-i-1]=matriz1[1][i];
		}
		matriz1=c.getFront();
		printarray(c.getFront());
		c.setFront(matriz2);
		printarray(c.getFront());
		matriz2=c.getDown();
		
		for (int i=0;i<matriz1.length;i++) {
			matriz2[1][i]=matriz1[1][i];
		}
		matriz1=c.getDown();
		c.setDown(matriz2);
		matriz2=c.getBack();		
		for (int i=0;i<matriz1.length;i++) {
			matriz2[1][i]=matriz1[1][i];
		}
		c.setBack(matriz2);
		
		return c;
	}
	public static int[][] nonReference(int[][]b) {
		int [][]a = null;
		for(int i=0;i<b.length;i++) {
			for(int j=0;j<b.length;j++) {
				//System.out.print(b);
				a[i][j]=b[i][j];
			}
		}
		return a;
	}//end nonReference*/
	
	
}
