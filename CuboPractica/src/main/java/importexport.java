import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import com.google.gson.Gson;

public class importexport {
	
	
	public static String obj_to_jso (Cube cube) {
		//Method for converting the cube object to string
		Gson gson = new Gson();
		String json = gson.toJson(cube);
		return json;
	}
	
	public static String arreglar_string(String string) {
		//Method for upgrading the understandability of the json output file
		
		char first;
		char middle;
		char last;
		
		
		for(int i = 0;i < string.length()-2; i++) {
			
			first = string.charAt(i);
			middle = string.charAt(i+1);
			last = string.charAt(i+2);
			
			String aux =""+first +middle+last;
			
			if(aux.equals("]],")) {
				string = string.substring(0,i+2)+"\n"+string.substring(i+3);
			}
		}
		
		string = string+"\n\n\n";
		
		return string;
		
	}
	
	public static void write_json (String string) throws IOException {
		//Method that concatenates cubes to a json file
		FileWriter file = new FileWriter("C:\\Users\\VST\\git\\repositoryCUBE\\CuboPractica\\ejemploout.json",true);
		try {
			file.write(string);
			System.out.println("\nJSON Object: "+string);
			
		}catch(IOException e) {
			e.printStackTrace();
		}finally {
			file.flush();
			file.close();
		}
		
	}
	
	
	
	
	public static Cube convertjson () {
		JSONObject obj = (JSONObject) readjson();
		JSONArray down = (JSONArray) obj.get("DOWN");
		JSONArray left = (JSONArray) obj.get("LEFT");
		JSONArray back = (JSONArray) obj.get("BACK");
		JSONArray front = (JSONArray) obj.get("FRONT");
		JSONArray right = (JSONArray) obj.get("RIGHT");
		JSONArray up = (JSONArray) obj.get("UP");
		
		Cube cube = new Cube();
		cube.setBack(convert_jsonarray(back));
		cube.setDown(convert_jsonarray(down));
		cube.setFront(convert_jsonarray(front));
		cube.setLeft(convert_jsonarray(left));
		cube.setRight(convert_jsonarray(right));
		cube.setUp(convert_jsonarray(up));
		
		
		return cube;
	}
	
	public static int[][] convert_jsonarray(JSONArray array) {
		
		String string = array.toString();
		string = string.replace("[", "");
		string = string.replace("]", "");
		string = string.replace(",", "");
		//System.out.println(string);
		
		int num_rows = (int) Math.sqrt(string.length());
		//System.out.println(num_rows);
		
		int [][] arr = new int[num_rows][num_rows];
		int index_string = 0;
		for(int i = 0; i < num_rows; i++) {
			for(int j = 0; j < num_rows; j++ ) {
				arr[i][j] = Character.getNumericValue(string.charAt(index_string));
				index_string++;
			}
		}
		
		
		/*for(int x = 0; x < num_rows; x++) {
			for(int z = 0; z < num_rows; z++ ) {
				System.out.print(arr[x][z]);
			}
			System.out.println();
		}*/
		
		return arr;
			
	}

	
	public static Object readjson() {
		//Method that reads a json file
		
		//Parser
		JSONParser jsonParser = new JSONParser();
		Object obj = null;
		
		try (FileReader reader = new FileReader("ejemplo.json")){ //Name of the json file with the cube
			 //Read JSON file
            obj = jsonParser.parse(reader);
        
            
            //System.out.println(obj.toString());
            
		}catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (org.json.simple.parser.ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return obj;
	}
}
