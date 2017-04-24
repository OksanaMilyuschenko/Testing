
public class AssertMatchers {
	
	public boolean array_elements_is_kind_of (Object[] a, String type ){
		
		boolean res = true;
		
		for (int i = 0; i < a.length; i++) {
			String classType = a[i].getClass().getSimpleName();
			if (!(classType.equals(type))){
			   res = false;
			   break;
			}
		}
		return  res;
	}
	
	public static void main(String[] args){
		 
     Object[] array = new Object[]{1,2,3};

	 AssertMatchers test = new AssertMatchers();
	 boolean a =  test.array_elements_is_kind_of(array,"Integer");
	
	 if ( a == true) { 
		 System.out.println("Array is valid");
	 } else { 
		 System.out.println("Array is invalid");
	 }	 
	 
	}
}


