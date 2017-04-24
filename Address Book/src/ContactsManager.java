import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ContactsManager {

	List<Map> contacts = new ArrayList();
	Scanner in = new Scanner(System.in); 
	
	public  void showMenu(){
		System.out.println("(1)Add contact (2)Show all contacts");
	}
	
	 void addContact(){
		 Scanner in = new Scanner(System.in);
		 System.out.println("name   ");
	     String name =in.nextLine();
		 System.out.println("phone   ");
	     String phone =in.nextLine();
	     Map<String, String> hashMap = new HashMap<String, String>();
	     hashMap.put("name",name );
	     hashMap.put("phone",phone);
	     contacts.add(hashMap);
	     
	 }
	
	 void showContact(){
		 for (Map<String,String> element : this.contacts) { 
			 System.out.println("name is  "+element.get("name")+"    phone is " +element.get("phone"));
        }
	 }
	 
	 void exitScanner(){
		 
	 }
	 
	
	public void run(){
		while (true){
			this.showMenu();
			int index =in.nextInt();
			if (!(this.handleMenu(index))){
				break;
			};
			
		}
	}
	 public boolean handleMenu(int index){
		 
		 boolean shouldnadle = true;
		 
		switch(index) {
		  case 1:addContact();
		  break;
		  case 2:showContact();
		  break;
		  case 3: shouldnadle = false;
		         in.close();
		} 
		return shouldnadle;
	 }
	 public static void main (String[]args){
		 
		 ContactsManager test = new ContactsManager();
		 test.run();
	
		 
		 
		 
		 
	 }

}