
public class Printer {
	public static void printcube (Cube cube) {
		System.out.println("BACK ");
		printarray(cube.getBack());
		System.out.println("--------------------------");
		
		System.out.println("LEFT  DOWN  RIGTH  UP");
		System.out.println(printarrayrow(cube.getLeft(),0)+"   "+printarrayrow(cube.getDown(),0)+"   "
		+printarrayrow(cube.getRight(),0)+"   "+printarrayrow(cube.getUp(),0));
		System.out.println(printarrayrow(cube.getLeft(),1)+"   "+printarrayrow(cube.getDown(),1)+"   "
		+printarrayrow(cube.getRight(),1)+"   "+printarrayrow(cube.getUp(),1));
		System.out.println(printarrayrow(cube.getLeft(),2)+"   "+printarrayrow(cube.getDown(),2)+"   "
		+printarrayrow(cube.getRight(),2)+"   "+printarrayrow(cube.getUp(),2));
		
		System.out.println("--------------------------");
		
		System.out.println("FRONT");
		printarray(cube.getFront());
		
		
	}
	
	public static String printarrayrow(int[][] array,int row) {
		String string = "";
		for(int i = 0; i< array.length;i++) {
			string = string + array[row][i];
		}
		
		return string;
		
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
