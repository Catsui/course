package application;

import java.util.ArrayList;
import java.util.List;

public class Program2181 {

	public static void main(String[] args) {
		
		List<Integer> intList = new ArrayList<Integer>();
		intList.add(10);
		intList.add(5);
		
		//List<? extends Number> list = intList;
		
		//Number x = list.get(0);
		
		//list.add(20); Erro: compilador não tem informação de compatibilidade para o curinga
		
		/*Princípio get/put - covariância: get é possível, mas put não é possível*/
		
		List<Object> myObjs = new ArrayList<Object>();
		myObjs.add("Maria");
		myObjs.add("Alex");
		
		List<? super Number> myNums = myObjs;
		
		myNums.add(10);
		myNums.add(3.15);
	
		
		//Number y = myNums.get(0); Erro: não posso acessar elementos da lista e guardar em um Number, pois o tipo pode ser um supertipo.		
		
		 /* Princípio get/put - contravariância: get não é possível, mas put é possível
		 */
	}

}
