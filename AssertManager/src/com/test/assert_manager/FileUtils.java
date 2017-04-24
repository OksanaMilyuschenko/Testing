package com.test.assert_manager;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

public class FileUtils {
	
	private String contentData;
	
	public static void  createFile(String filename, String content){
		 File file = new File(filename);
		 try {
		        if(!file.exists()){
		            file.createNewFile();
		        }
		        PrintWriter out = new PrintWriter(file.getAbsoluteFile());
		 
		        try {
		            out.print(content);
		        } finally {
		            out.close();
		        }
		    } catch(IOException e) {
		        throw new RuntimeException(e);
		    }
		}
	
	
	public FileUtils readFile(String filename){
		 File file = new File(filename);
		 StringBuilder sb = new StringBuilder(); 
		    try {
		        BufferedReader in = new BufferedReader(new FileReader( file.getAbsoluteFile()));
	        try {
		            
		            String s;
		            while ((s = in.readLine()) != null) {
		                sb.append(s);
		                sb.append("\n");
		        }
		        } finally {
		            in.close();
		        }
		    } catch(IOException e) {
		        throw new RuntimeException(e);
		          
		    }
		   contentData = sb.toString(); 
		   
		   return this;
		    	
		}
	
	public String content(){
		return contentData;
	}
		 
	public String replaceContent(String findItem, String replaceItem){
		return contentData.replace(findItem,replaceItem);
		 
	}

	public Integer count() {
		return contentData.length();
		}
	
	
	public static void main (String[]args){
		
		FileUtils.createFile("Oksana.txt", "Hello Oksana");
		FileUtils file = new FileUtils();
		file.readFile("Oksana.txt");
		System.out.println(file.count());
		file.replaceContent("Oksana","Sergey");
		System.out.println(file.content());
		String txt = file.replaceContent("Oksana","Sergey");
		System.out.print(txt);
		
	}
	
	
	
	}
	
	
	
	
	
	






