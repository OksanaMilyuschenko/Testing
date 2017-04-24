
public class LearningFunctions {
	
	public static int a=30;
	public static int b=20;
	
	
	public static void print(){
		System.out.println("Learning functions");
	}
	public static int addNumbers(int r, int s){
		int add = r+s;
		return add;
	}
	
	
	public static void addNumbers(){
		int c = a+b;
		System.out.println(c);
	}
	
	
	public static void main (String []args){
		print();
		int res = addNumbers(10,10);
		System.out.println(res);
	}

}
