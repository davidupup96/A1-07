
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
	public static Cube L1(Cube cube) {

		// Hacer los movimientos
		cube = mov_traslacionL(cube, 1, 1);

		return cube;
	}
	public static Cube L2(Cube cube) {

		// Girar cara left
		int[][] rigth = cube.getRight(); 
			rigth =	rotate90(rigth,rigth.length);
		cube.setRight(rigth);;
		// Hacer los movimientos
		cube = mov_traslacionL(cube, 2, 0);

		return cube;
	}

	public static Cube D0(Cube cube) {
		
		int[][] down = cube.getDown();
		down = rotate90(down,down.length);
		cube.setDown(down);
		cube = mov_traslacionD(cube, 2, 0, 0, 2);

		return cube;

	}
	
	public static Cube D1(Cube cube) {
		
		cube = mov_traslacionD(cube, 1, 1, 1, 1);

		return cube;

	}
	
	public static Cube D2(Cube cube) {
		
		int[][] up = cube.getUp();
		up = rotate90(up,up.length);
		cube.setUp(up);
		cube = mov_traslacionD(cube, 0, 2, 2, 0);

		return cube;

	}
	
	public static Cube B0(Cube cube) {
		
		int[][] back = cube.getBack();
		back = rotate90(back,back.length);
		cube.setBack(back);
		
		cube = mov_traslacionB (cube,0);
		return cube;
	}
	
	public static Cube B1(Cube cube) {
		
		cube = mov_traslacionB (cube,0);
		return cube;
	}
	
	public static Cube B2(Cube cube) {
		
		int[][] front = cube.getFront();
		front = rotate90(front,front.length);
		cube.setFront(front);
		
		cube = mov_traslacionB (cube,0);
		return cube;
	}
	
	public static Cube b0(Cube cube) {
		int[][] back = cube.getBack();
		back = rotateminus90(back);
		cube.setBack(back);
		cube = mov_traslacionb (cube, 0);
		return cube;
	}
	
	public static Cube b1(Cube cube) {
		cube = mov_traslacionb (cube, 1);
		return cube;
	}
	
	public static Cube b2(Cube cube) {
		int[][] front = cube.getFront();
		front = rotateminus90(front);
		cube.setFront(front);
		cube = mov_traslacionb (cube, 2);
		return cube;
	}
	
	public static Cube d0(Cube cube) {
		int[][] down = cube.getDown();
		down = rotateminus90(down);
		cube.setDown(down);
		cube = mov_traslaciond(cube, 2, 0, 0, 2);
		return cube;
	}
	
	public static Cube d1(Cube cube) {
		cube = mov_traslaciond(cube, 1, 1, 1, 1);
		return cube;
	}
	
	public static Cube d2(Cube cube) {
		int[][] up = cube.getUp();
		up = rotateminus90(up);
		cube.setUp(up);
		cube = mov_traslaciond(cube, 0, 2, 2, 0);
		return cube;
	}
	
	public static Cube l0(Cube cube) {
		int[][] left = cube.getLeft();
		left = rotateminus90(left);
		cube.setLeft(left);
		cube = mov_traslacionl(cube, 0, 2);
		return cube;
	}
	
	public static Cube l1(Cube cube) {
		cube = mov_traslacionl(cube, 1, 1);
		return cube;
	}
	
	public static Cube l2(Cube cube) {
		int[][] right = cube.getRight();
		right = rotateminus90(right);
		cube.setRight(right);
		cube = mov_traslacionl(cube, 2, 0);
		return cube;
	}

	public static Cube mov_traslacionb (Cube cube, int row) {
		int len = cube.getLeft().length;
		Cube aux = copy_cube(cube);
		int [] left = copy_content_of_array_row(cube.getLeft(), len, row);
		
		for(int i = 0; i < len; i++) {
			aux.getLeft()[row][i] = cube.getDown()[row][i];
			aux.getDown()[row][i] = cube.getRight()[row][i];
			aux.getRight()[row][i] = cube.getUp()[row][i];
			aux.getUp()[row][i] = left[i];
		}
		
		return aux;
	}
	
	public static Cube mov_traslacionB (Cube cube, int row) {
		int len = cube.getLeft().length;
		Cube aux = copy_cube(cube);
		int[] uprow = copy_content_of_array_row(cube.getUp(), len, row);
		
		for(int i = 0; i < len; i++) {
			aux.getUp()[row][i] = cube.getRight()[row][i];
			aux.getRight()[row][i] = cube.getDown()[row][i];
			aux.getDown()[row][i] = cube.getLeft()[row][i];
			aux.getLeft()[row][i] = uprow[i];
		}
		
		return aux;
	}
	
	public static Cube mov_traslaciond(Cube cube, int left_col, int rigth_col, int front_row, int back_row) {
		int len = cube.getBack().length;
		Cube aux = copy_cube(cube);
		int [] right = copy_content_of_array_col(cube.getRight(),len, rigth_col);
		

		for (int i = 0; i < len; i++) {
			aux.getRight()[i][rigth_col] = cube.getFront()[front_row][len-1-i];
		}
		for (int i = 0; i < len; i++) {
			aux.getFront()[front_row][i] = cube.getLeft()[i][left_col];
		}

		for (int i = 0; i < len; i++) {
			aux.getLeft()[i][left_col] = cube.getBack()[back_row][len-1-i];
		}

		for (int j = 0; j < len; j++) {
			aux.getBack()[back_row][j] = right[j];
		}

		return aux;
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
	
	public static Cube mov_traslacionl(Cube cube, int col_back_down_front, int col_up) {
		int len = cube.getBack().length;
		Cube aux = copy_cube(cube);
		int [] up = copy_content_of_array_col(cube.getUp(),len, col_up);
		

		for (int i = 0; i < len; i++) {
			aux.getUp()[i][col_up] = cube.getFront()[len-1-i][col_back_down_front];
			aux.getFront()[i][col_back_down_front] = cube.getFront()[i][col_back_down_front];
			aux.getDown()[i][col_back_down_front] = cube.getBack()[i][col_back_down_front];
			aux.getBack()[i][col_back_down_front] = up[i];

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
	
	public static int[][] rotateminus90 (int[][] a) {
		for (int i = 0; i < 3; i++) {
			a = rotate90(a,a.length);
		}

		return a;
	}

}
