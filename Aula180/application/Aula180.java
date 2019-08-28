package application;

import java.util.Arrays;
import java.util.List;

public class Aula180 {

	public static void main(String[] args) {
		
		/*List<Object> myObjs = new ArrayList<Object>()
		List<Integer> myInteger = new ArrayList<Integer>()*/
		
		//myObjs = myInteger; Isso dá erro porque Generics são invariantes. List<Object> não é um supertipo de qualquer lista.
		
		//O supertipo de qualquer lista é List<?>
		
		/*List<?> myObjs = new ArrayList<Object>();
		List<Integer> myNumbers = new ArrayList<Integer>();
		
		myObjs = myNumbers; //OK! List<?> é um tipo coringa.*/
		
		List<Integer> myInts = Arrays.asList(5,2,10);
		printList(myInts);
		
		List<String> myStr = Arrays.asList("Maria", "Alex", "Boris");
		printList(myStr);
		
		
	}
	
	public static void printList(List<?> list) {
		for (Object obj : list) {
			//list.add(3); Dá erro. O compilador não deixa adicionar nada a coringas, pois não sabe se o elemento é de um tipo compatível.
			System.out.println(obj);
		}
	}

}
