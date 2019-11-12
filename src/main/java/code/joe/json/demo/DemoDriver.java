package code.joe.json.demo;

import java.io.File;

import com.fasterxml.jackson.databind.ObjectMapper;

public class DemoDriver {

	public static void main(String[] args) {
		
		
		// TODO Auto-generated method stub
		try {
			//Object Mapper
			ObjectMapper mapper=new ObjectMapper();
			
			//read JSON  and map to POJO
			Doctor doc1= mapper.readValue(new File("jsondata/sample1.json"), Doctor.class);
			Address add=doc1.getAddress();
			Doctor doc2= mapper.readValue(new File("jsondata/sample2.json"), Doctor.class);
		//print the object			
			System.out.println("First Name of the Doctor: " +doc1.getFirstName());
			System.out.println("City: "+add.getCity());
			System.out.println("First Name of the Doctor: " +doc2.getFirstName());
			String [] doc1interest= doc1.getInterests();
			System.out.println("Interest of "+doc1.getFirstName()+":");
			for (String str: doc1interest) {
			System.out.println(str);
			}
		}catch(Exception e) {
			e.printStackTrace();
		
		}

	}

}
