
public class Movements {

	public static Cube L0(Cube cube) {

		// Girar cara left
		int[][] left = cube.getLeft(); 
			left =	rotate90(left,left.length);
		cube.setLeft(left);
		// Hacer los movimientos
		cube = mov_traslacionL(cube, 0, 2);

		return cube;
	}

	public static Cube D0(Cube cube) {
		
		int[][] down = cube.getDown();
		down = rotate90(down,down.length);
		cube.setDown(down);
		cube = mov_traslacionD(cube, 2, 0, 0, 2);

		return cube;

	}

	public static Cube mov_traslacionD(Cube cube, int left_col, int rigth_col, int front_row, int back_row) {
		int len = cube.getBack().length;
		Cube aux = copy_cube(cube);
		int[] backrow = copy_content_of_array_row(cube.getBack(), len, back_row);

		for (int i = 0; i < len; i++) {

			aux.getBack()[back_row][i] = cube.getLeft()[len - 1 - i][left_col];
		}
		for (int i = 0; i < len; i++) {
			aux.getLeft()[i][left_col] = cube.getFront()[front_row][i];
		}

		for (int i = 0; i < len; i++) {
			aux.getFront()[front_row][i] = cube.getRight()[len - 1 - i][rigth_col];
		}

		for (int j = 0; j < len; j++) {
			aux.getRight()[j][rigth_col] = backrow[j];
			//cambiar
		}

		return aux;
	}

	public static Cube mov_traslacionL(Cube cube, int col_back_down_front, int col_up) {
		int len = cube.getBack().length;
		Cube aux = copy_cube(cube);
		int[] backrow = copy_content_of_array_col(cube.getBack(), len, col_back_down_front);
		backrow = invertrow(backrow);
		int[] uprow = copy_content_of_array_col(cube.getUp(), len, col_up);
		uprow = invertrow(uprow);

		for (int i = 0; i < len; i++) {

			aux.getBack()[i][col_back_down_front] = cube.getDown()[i][col_back_down_front];
			aux.getDown()[i][col_back_down_front] = cube.getFront()[i][col_back_down_front];
			aux.getFront()[i][col_back_down_front] = uprow[i];
			aux.getUp()[i][col_up] = backrow[i];

		}

		return aux;

	}

	public static Cube copy_cube(Cube cube) {
		Cube aux = new Cube();
		aux.setBack(cube.getBack());
		aux.setDown(cube.getDown());
		aux.setFront(cube.getFront());
		aux.setLeft(cube.getLeft());
		aux.setRight(cube.getRight());
		aux.setUp(cube.getUp());

		return aux;
	}

	public static int[] copy_content_of_array_row(int[][] array, int len, int row) {
		int[] aux = new int[len];
		for (int i = 0; i < len; i++) {
			aux[i] = array[row][i];
		}

		return aux;
	}
	// Unir metodos

	public static int[] copy_content_of_array_col(int[][] array, int len, int col) {
		int[] aux = new int[len];
		for (int i = 0; i < len; i++) {
			aux[i] = array[i][col];
		}

		return aux;
	}

	public static int[][] invertcara(int[][] cara) {

		int[][] aux = new int[cara.length][cara.length];
		for (int j = 0; j < cara.length; j++) {
			for (int i = 0; i < cara.length; i++) {
				aux[i][j] = cara[cara.length - i - 1][cara.length - j - 1];
			}
		}

		return aux;
	}

	public static int[] invertrow(int[] array) {

		for (int i = 0; i < array.length / 2; i++) {
			int temp = array[i];
			array[i] = array[array.length - 1 - i];
			array[array.length - 1 - i] = temp;
		}
		return array;
	}
	
	public static int[][] rotate90 (int[][] a,int N) {
		
		for (int i = 0; i < N / 2; i++) { 
	        for (int j = i; j < N - i - 1; j++) { 
	  
	            // Swap elements of each cycle 
	            // in clockwise direction 
	            int temp = a[i][j]; 
	            a[i][j] = a[N - 1 - j][i]; 
	            a[N - 1 - j][i] = a[N - 1 - i][N - 1 - j]; 
	            a[N - 1 - i][N - 1 - j] = a[j][N - 1 - i]; 
	            a[j][N - 1 - i] = temp; 
	        } 
	    }
		return a;
	}

}
