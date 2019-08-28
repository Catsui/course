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
		
		//list.add(20); Erro: compilador n�o tem informa��o de compatibilidade para o curinga
		
		/*Princ�pio get/put - covari�ncia: get � poss�vel, mas put n�o � poss�vel*/
		
		List<Object> myObjs = new ArrayList<Object>();
		myObjs.add("Maria");
		myObjs.add("Alex");
		
		List<? super Number> myNums = myObjs;
		
		myNums.add(10);
		myNums.add(3.15);
	
		
		//Number y = myNums.get(0); Erro: n�o posso acessar elementos da lista e guardar em um Number, pois o tipo pode ser um supertipo.		
		
		 /* Princ�pio get/put - contravari�ncia: get n�o � poss�vel, mas put � poss�vel
		 */
	}

}
