package instagram;

import java.io.*;
import java.net.URL;
import java.util.Scanner;

import java.util.ArrayList;


public class Insta {
	/*public static void main(String[] args) throws FileNotFoundException{

		URL url = Insta.class.getResource("data");
		File f = new File(url.getPath());
		Scanner input = new Scanner(f);
		ArrayList<String> names = new ArrayList();
		while (input.hasNextLine()){
			String name = input.nextLine();
			names.add(name);
			if (input.hasNextLine()){
			String poo = input.nextLine();
			}
			if (input.hasNextLine()){
				String doo = input.nextLine();
			}
			if (input.hasNextLine()){
				String joo = input.nextLine();
			}
		}
		URL url2 = Insta.class.getResource("data2");
		File f2 = new File(url2.getPath());
		Scanner input2 = new Scanner(f2);
		ArrayList<String> names2 = new ArrayList();
		while (input2.hasNextLine()){
			String name2 = input2.nextLine();
			names2.add(name2);
			if (input2.hasNextLine()){
			String poo = input2.nextLine();
			}
			if (input2.hasNextLine()){
				String doo = input2.nextLine();
			}
			if (input2.hasNextLine()){
				String joo = input2.nextLine();
			}
		}
		/*for (int i=0; i<names2.size();i++){
			System.out.println(names2.get(i));
		}
		System.out.println("almost");
		ArrayList<String> names3 = new ArrayList();
		boolean check = false;
		for (int i=0; i<names.size();i++){
			for (int j =0; j<names2.size();j++){
				if (names.get(i).compareTo(names2.get(j)) == 0 ){
					check = true;
				}				
			}
			if (!check){
				names3.add(names.get(i));
			}
			check=false;
			
		}
		System.out.println("almost2");
		for (int i=0; i<names3.size();i++){
			System.out.println(names3.get(i));
		}
		if ("hello".compareTo("hello") ==0){
			System.out.println("done");
		}
		
		input2.close();
		input.close();
	}*/
	
	public static void main(String[] args) throws FileNotFoundException{

		URL url = Insta.class.getResource("FOLLOWINGDATAFILE");
		File f = new File(url.getPath());
		Scanner input = new Scanner(f);
		ArrayList<String> names = new ArrayList();
		//String[] names = new String[421];
		int ctr = 0;
		while (input.hasNextLine()){
			String name = input.nextLine();
			names.add(name);
			if(input.hasNextLine()){
				String followcheck = input.nextLine();
			//	int ctr2 =0;
				while (followcheck.compareTo("Following")!=0 && followcheck.compareTo("Follow")!=0){
					if(input.hasNextLine()){
						followcheck = input.nextLine();		
						//ctr2++;
					}
				}
				if(input.hasNextLine()){
					String follow = input.nextLine();	
				}
			/*	if(input.hasNextLine()){
					String follow2 = input.nextLine();	
				}*/
			}
		//	ctr++;
			//System.out.println(ctr);
		}
	//	System.out.println("starting");
	/*	for (int i=0; i<names.size();i++){
			System.out.println(names.get(i));
		}*/
		
		URL url2 = Insta.class.getResource("FOLLOWERSDATAFILE");
		File f2 = new File(url2.getPath());
		Scanner input2 = new Scanner(f2);
		ArrayList<String> names2 = new ArrayList();
		while (input2.hasNextLine()){
			String name = input2.nextLine();
			names2.add(name);
			if(input2.hasNextLine()){
				String followcheck = input2.nextLine();
			//	int ctr2 =0;
				while (followcheck.compareTo("Following")!=0 && followcheck.compareTo("Follow")!=0){
					if(input2.hasNextLine()){
						followcheck = input2.nextLine();		
						//ctr2++;
					}
				}
				if(input2.hasNextLine()){
					String follow = input2.nextLine();	
				}
			/*	if(input.hasNextLine()){
					String follow2 = input.nextLine();	
				}*/
			}
		//	ctr++;
			//System.out.println(ctr);
		}
		/*for (int i=0; i<names2.size();i++){
			System.out.println(names2.get(i));
		}*/
	
		ArrayList<String> names3 = new ArrayList();
		boolean check = false;
		for (int i=0; i<names.size();i++){
			for (int j =0; j<names2.size();j++){
				if (names.get(i).compareTo(names2.get(j)) == 0 ){
					check = true;
				}				
			}
			if (!check){
				names3.add(names.get(i));
			}
			check=false;
			
		}
		
		for (int i=0; i<names3.size();i++){
			System.out.println(names3.get(i));
		}
		System.out.println(names3.size());
		
		input2.close();
		input.close();
	}
}


