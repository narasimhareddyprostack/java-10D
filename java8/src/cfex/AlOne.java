package cfex;

import java.util.ArrayList;

public class AlOne {

	public static void main(String[] args) {
	ArrayList<Integer> al1=new ArrayList<Integer>();
	
	ArrayList<String> al2=new ArrayList<String>();
	
	ArrayList al3=new ArrayList();
	
	al1.add(745);
	al1.add(145);
	al1.add(545);
	al1.add(45);
	al1.add(245);
	for(int i=0;i<=al1.size()-1; i++) {
		System.out.println(al1.get(i));
	}
	/*
	for(int id:al1) {
		System.out.println(id);
	}
	*/
	}

}
