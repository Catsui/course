package application;

import java.util.Arrays;
import java.util.List;

public class Aula180 {

	public static void main(String[] args) {
		
		/*List<Object> myObjs = new ArrayList<Object>()
		List<Integer> myInteger = new ArrayList<Integer>()*/
		
		//myObjs = myInteger; Isso d� erro porque Generics s�o invariantes. List<Object> n�o � um supertipo de qualquer lista.
		
		//O supertipo de qualquer lista � List<?>
		
		/*List<?> myObjs = new ArrayList<Object>();
		List<Integer> myNumbers = new ArrayList<Integer>();
		
		myObjs = myNumbers; //OK! List<?> � um tipo coringa.*/
		
		List<Integer> myInts = Arrays.asList(5,2,10);
		printList(myInts);
		
		List<String> myStr = Arrays.asList("Maria", "Alex", "Boris");
		printList(myStr);
		
		
	}
	
	public static void printList(List<?> list) {
		for (Object obj : list) {
			//list.add(3); D� erro. O compilador n�o deixa adicionar nada a coringas, pois n�o sabe se o elemento � de um tipo compat�vel.
			System.out.println(obj);
		}
	}

}
