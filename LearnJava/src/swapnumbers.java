
public class swapnumbers {

	int s;
	int t;
	
	public static void swapNumbers(int a, int b)// pass by value
	{
		int temp = a;
		a=b;
		b=temp;
		 
	}
	public static void swap(swapnumbers p){
		
		int temp = p.s;
		p.s = p.t;
		p.t = temp;
		
	}
	
	public static void main(String[] args) {
		
		swapnumbers sw = new swapnumbers();
		sw.s = 50;
		sw.t = 100;
		swapNumbers(sw.s,sw.t);
		System.out.println("Pass by values s is "+ sw.s);
		System.out.println("Pass by values t is "+ sw.t);
		
		swap(sw);
		System.out.println("Pass by reference s is " + sw.s);
		System.out.println("Pass by reference t is " + sw.t);
		
		
	}

}
