package excessoes;

public class Exemplo2 {
	public static void main(String[] args) {
	  System.out.println("Início do main");
	  metodo1();
	  System.out.println("Fim do main");
	}
	static void metodo1() {
	  System.out.println("Início do metodo1");
	  metodo2();
	  System.out.println("Fim do metodo1");
	}
	static void metodo2() {
	  System.out.println("Início do metodo2");
	  int[] array = new int[5];
	  for (int i = 0; i <= 5; i++) {
		  try {
		     array[i] = i;
			 System.out.println(i);
	      } catch(ArrayIndexOutOfBoundsException e) {
	    	  System.out.println("Excessão no for -> indice: " + i);
	      }
	  }
	  System.out.println("Fim do metodo2");
	}
}


// soluções para ajustar o código (mais adequado do que try/catch)
// 1 -  for (int i=0; i < array.length; i++) {}
// 2 -  for (int i=0; i < 5; i++) {}
// 3 - if (i>0 && i<5) {}