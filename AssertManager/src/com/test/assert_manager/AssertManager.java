package com.test.assert_manager;
import java.util.Timer;
import java.util.Arrays;
import java.util.Map;
import com.test.assert_manager.TimeManager;
import com.test.assert_manager.TimerExample;

public class AssertManager extends TimeManager {
	
	public boolean array_elements_is_kind_of(Object[]array, String type) {

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
	
	public void assert_raise(boolean condition, String message) {
		if (!condition){
			throw new Error(message);
		}
	}

	
	public void show_error(){
		
		  int x=8,y=0;  
		  
		    try {
		        int result=x/y;
		        System.out.println(result);
		    } catch (Exception e) {
		        System.out.println("division by zero exception");
		    }
		
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
	 
//		AssertManager test = new AssertManager();
//		String el1 = "Oksana";
//		int el2 = 12;
//		int el3 = 12;
//		
//		try {
//			test.assert_raise(test.equalTo(el2, el3), "Not equal");
//			System.out.println("Hello");
//		} catch (Error e) {
//			System.out.println(e + " Our error");
//		} finally {
//			System.out.println("123123123");
//		}
//		
//		
//	System.out.println("End prog");
//		if (test.equalTo(el2, el3)) {
//			System.out.print("equal");
//		} else {
//			System.out.print("not equal");			
//		}
		
//		test.sayName();
//		AssertManager test = new AssertManager();
//		String el1 = "Oksana";
	
		
		
		//AssertManager test = new AssertManager();
		//String time = test.getCurrentTime();
		//System.out.println(time);
		
//AssertManager test = new AssertManager();
//		test.show_error();
		
		Timer timer = new Timer();
		TimerExample tm = new TimerExample();
		timer.schedule(tm, 0, 400);
		
		
	}


	@Override
	public String format() {
	return "dd.MM.yyyy";
	}
}
