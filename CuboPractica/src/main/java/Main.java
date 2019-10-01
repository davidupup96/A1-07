
 
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
	public static void main (String [] args) {
		
		Cube cube =  importexport.convertjson();
		importexport.array_to_json_format(cube);
		
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
