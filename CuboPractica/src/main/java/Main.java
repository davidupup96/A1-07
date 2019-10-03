
 
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
		
		
		
	}
	
	public static void printarray(int[][] array) {
		for(int i = 0; i < array.length; i++) {
			for(int j = 0; j < array.length; j++ ) {
				System.out.print(array[i][j]);
			}
			System.out.println();
		}
	}
	
	
}
