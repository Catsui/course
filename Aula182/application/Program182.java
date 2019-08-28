package application;

import entites.Client182;

public class Program182 {

	public static void main(String[] args) {
		
		/*hashCode e equals são operações da classe Object utilizadas para comparar se um objeto é igual a outro
		 * equals: lento, resposta 100%
		 * hashCode: rápido, porém resposta positiva não é 100%¨
		 * Tipos comuns (String, Date, Integer, Double, etc.) já possuem implementação para essas operações.
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
		System.out.println(c1 == c2); //compara referencias de memórias para classes custom
		System.out.println(c1 + " - " + c2);
		System.out.println(s1 == s2); //tratativa diferente para formas literais
		System.out.println(s3 == s4); //objetos instanciados são comparados por alocação, e não por conteúdo
		

	}

}
