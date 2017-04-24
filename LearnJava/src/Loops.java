
public class Loops {

	public static void main(String[] args) {
		
	/*	int i=1;
		
		do {
			System.out.println("Number is  " + i);
			i++;
		}while (i<=10);
*/
		/*int i =1;
		
		while (i<=10){
			
			System.out.println("Number is  "  +i);
			i++;
			
		}*/
		
//            for (int i=1; i<=10; i++){
//			System.out.println("Number is  " +i);
			
//		}
	
//		for (int i= 0; i<=20; i=i+2){
//			System.out.println("Number is even  " + i);
//		
		
//		for (int i=1; i<=10; i++){
//			System.out.println("table of 2 is "+ i*2);
//		}
//	}
		
		for (int table = 1;table<=10;table++){
			System.out.println("table of ----" + table);
			for (int x=1; x<=10; x++){
				System.out.println(table + "*" +x+"="+ table*x);
			}
			if (table ==6){
				break;
			}
		}
		}
	
	

}
