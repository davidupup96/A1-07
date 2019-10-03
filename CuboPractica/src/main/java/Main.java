
 
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.ParseException;
import java.util.ArrayList;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;



public class Main {
	public static void main (String [] args) throws IOException {
		
		Cube cube =  importexport.convertjson();
		String a = importexport.obj_to_jso(cube);
		a = importexport.arreglar_string(a);
		importexport.write_json(a);
		//System.out.println(a);
		
		cube=middleVertical(cube);
		/*System.out.println("UP");
		printarray(cube.getUp());
		System.out.println("down");
		printarray(cube.getDown());
		System.out.println("Front");
		printarray(cube.getFront());
		System.out.println("BAck");
		printarray(cube.getBack());*/
		
	}
	
	public static void printarray(int[][] array) {
		for(int i = 0; i < array.length; i++) {
			for(int j = 0; j < array.length; j++ ) {
				System.out.print(array[i][j]);
			}
			System.out.println();
		}
	}
	public static void horizontal(Cube c) {
		
	}
	public static void vertical(Cube c) {
		
	}
	public static Cube middleVertical(Cube c) {
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
	}//end nonReference
	
	
}
