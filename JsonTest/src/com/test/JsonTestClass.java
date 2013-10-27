package com.test;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.security.cert.TrustAnchor;

import org.json.JSONObject;

public class JsonTestClass {
	
	public static void main(String args[])
	{
		try {
			File file = new File("d:/test.txt");
			FileInputStream fileInputStream = new FileInputStream(file);
			BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(fileInputStream));
		
			StringBuilder stringBuilder = new StringBuilder();
			
			for(String string = bufferedReader.readLine();string!=null;string=bufferedReader.readLine()){
				stringBuilder.append(string);
				
			}
			
			System.out.println(stringBuilder.toString());
			
			JSONObject jsonObject = new JSONObject(stringBuilder.toString()).getJSONObject("book");
			JSONObject bookJson = jsonObject.getJSONObject("location");
			
			System.out.println(bookJson.getString("location"));
		
		} catch (Exception e) {
			// TODO: handle exception
		}
	   
	}
}
