package application;

import entites.Client182;

public class Program182 {

	public static void main(String[] args) {
		
		/*hashCode e equals s�o opera��es da classe Object utilizadas para comparar se um objeto � igual a outro
		 * equals: lento, resposta 100%
		 * hashCode: r�pido, por�m resposta positiva n�o � 100%�
		 * Tipos comuns (String, Date, Integer, Double, etc.) j� possuem implementa��o para essas opera��es.
		 * Classes personalizadas precisam de @Override
		 */
		
		/*String a = "Maria";
		String b = "Alex";
		
		System.out.println(a.hashCode());
		System.out.println(b.hashCode());*/
		
		Client182 c1 = new Client182("Maria", "maria@gmail.com");
		Client182 c2 = new Client182("Maria", "maria@gmail.com");
		
		String s1 = "teste";
		String s2 = "teste";
		
		String s3 = new String("teste");
		String s4 = new String("teste");
		
		System.out.println(c1.hashCode());
		System.out.println(c2.hashCode());
		System.out.println(c1.equals(c2));
		System.out.println(c1 == c2); //compara referencias de mem�rias para classes custom
		System.out.println(c1 + " - " + c2);
		System.out.println(s1 == s2); //tratativa diferente para formas literais
		System.out.println(s3 == s4); //objetos instanciados s�o comparados por aloca��o, e n�o por conte�do
		

	}

}
