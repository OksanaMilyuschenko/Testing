import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class AssertMatchers {
	
	public boolean array_elements_is_kind_of(Object[] array, String type) {

		boolean res = true;
		
		for (int i=0; i<array.length; i++){
			String classType = array[i].getClass().getSimpleName();
			
			if (!(classType.equals(type))){		
				res = false;			
				break;
			}	
		}
		return res;
	}
	
	
	public boolean string_should_contains (String original_str, String match_str ){
		return original_str.contains(match_str);
	}  
	
	public boolean arrays_equal(Object[] ar1,Object[]ar2){
		return Arrays.equals(ar1, ar2);
	}
	
	public boolean collection_equal(Map map,Map map2){
		return map.equals(map2);
	}
	
	public boolean collection_should_contains_key(Map map,Object key){
		return map.containsKey(key);
	}

	public boolean equalTo(Object el1, Object el2){
		return el1.equals(el2);
	}

     public void assert_raise(arrays_equal (ar1, ar2), "Array should be equal!"){
    	 
     }
	
	public static void main (String[]args){
		
//		
//		Object [] array = new Object[] {"Oksana"};
//		
//		AssertMatchers test = new AssertMatchers();
//		boolean testcase = test.array_elements_is_kind_of(array, "String");
//		
//		if (testcase){
//			System.out.println("Array is valid");
//		} else{
//			System.out.println("Array is invalid");
//		}
		
//	AssertMatchers test = new AssertMatchers();
//   boolean testcase = test.string_should_contains("котенок","кот");
	    
	     
//		AssertMatchers test = new AssertMatchers();
		
//		Object [] ar1 = new Object[] {"Oksana"};
//		Object [] ar2 = new Object[] {"Oksana"};
//		
//		boolean testcase = test.arrays_equal(ar1, ar2);
		
//		AssertMatchers test = new AssertMatchers();
		
//		  Map map = new HashMap();
//		  Map map2 = new HashMap();
//		  map.put("Oksana", "value1");
//		  map2.put("Oksana", "value1");
		
//		  boolean testcase = test.collection_equal(map, map2);
		
//		AssertMatchers test = new AssertMatchers();
//		 Map map = new HashMap();
//	     map.put("Oksana", "value1");
//	     test.collection_should_contains_key(map, "Oksana");
	 
		AssertMatchers test = new AssertMatchers();
		String el1 = "Oksana";
		int el2 = 12;
		if (test.equalTo(el1, el2)) {
			System.out.print("equal");
		} else {
			System.out.print("not equal");			
		}
		
		
	}
	

}
