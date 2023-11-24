
// Java Program for renaming a existing file

package com.split.pakage;

import java.io.File;

public class MainScript {

	public static void main(String[] args) 
	{// TODO Auto-generated method stub
		File folder = new File("Your Folder path");
		File[] files = folder.listFiles();
		System.out.println("New name : "+files[1]);
		
		
		/*
		 * for(int i=0;i<files.length;i++) { System.out.println("Old name : "+files[i]);
		 * String[] str = String.valueOf(files[i]).split(",",2); String s1 =
		 * str[0]+".JPG"; System.out.println("New name : "+s1);
		 * 
		 * boolean flag = files[i].renameTo(new File(s1));
		 * 
		 * if (flag == true) { System.out.println("File Successfully Rename"); }else{
		 * System.out.println("Operation Failed"); } }
		 */
	}
}
