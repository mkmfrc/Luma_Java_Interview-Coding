package javacoding.challenges;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;
import java.util.Vector;

import org.testng.annotations.Test;

public class ListPractices {

	public static void main(String[] args) {
		
		//1 :  non generic code
		//Earlier system and it can handle primitive and non primitive data type both but there was warning sign
		ArrayList listA = new ArrayList();
		
		
		
		listA.add(1000);
		listA.add(2000);
		
		//2 : generic code
		//After java 1.5 this generic code concept comes
		//It can not handle primitive and non primitive datatype.there is no warning sign now
		
		List<Integer> obj = new ArrayList<>();
		obj.addAll(obj);
	
		
		
		obj.add(100);
		obj.add(200);
		obj.add(200);
		obj.add(null);
		obj.add(null);
		//System.out.println(list.get(1));
		
		for (int i=0; i<obj.size(); i++){
			//System.out.println(arlist.get(i));
		}
		
		//3
		//List is an interface which creates instance or 
		//Or we can say Reference object of ArrayList Class
		List<Integer> listThree = new ArrayList<Integer>();  
		
		listThree.add(100);
		listThree.add(200);
		listThree.add(300);
		listThree.add(800);
		listThree.add(900);
		System.out.println(listThree.get(3));
		
		//System.out.println(listThree.get(1));
		
		//4
		List<Integer> listThree2 = new ArrayList<Integer>(Arrays.asList(100, 200));
		
		
		LinkedList<String> linkedlist = new LinkedList<String>();
		linkedlist.add("Smart Tech");
		
		Vector<String> vc = new Vector<String>();
		vc.add("Anything");
		
		List<Integer> vector= new Vector<Integer>();  //Its an interface
		listThree.add(100);
		listThree.add(200);
		
		
		
		Stack<String> stack = new Stack<String>();
		stack.add("Anything");
		
	}
	
	@Test
	public void getSortRev() {
		
		List<String> list = Arrays.asList("aa", "zz", "rr", "cc");
		System.out.println("Before : "+list);
		
		Collections.sort(list);
		System.out.println("After : "+list);
		
		Collections.reverse(list);
		System.out.println("After Reverse : "+list);
	}
	
	@Test
	public void getSortRev1() {
		
	}
	
}
