
public class TwoDementionalArrays {

	public static void main(String[] args) {
		
		int rows, cols;
		rows = 3; cols = 3;
		
		int table[][] = new int[rows][cols]; 
		
	    //assign the values in first row
		table [0][0] = 10;
		table [0][1] = 11;
		table [0][2] = 12;
		
		table [1][0] = 20;
		table [1][1] = 21;
		table [1][2] = 22;
		
		table [2][0] = 30;
		table [2][1] = 31;
		table [2][2] = 32;
		
		System.out.println(table.length);
		
		for (int i=0; i<rows;i++){
			for(int j=0;j<cols;j++){
				System.out.print(" "+ table[i][j]);
			} System.out.println("");
		}
		
		


	}

}
