package Stack;

import java.util.Stack;

public class Main {

	public static void main(String[] args) {
		Stack teste = new Stack();
		teste.push("Cachorro"); 
		teste.push("gato"); 
		teste.push("Vaca"); 
		teste.push("Boi"); 
		teste.push("Peixe"); 
		System.out.println(teste);
		System.out.println(teste.indexOf("Peixe"));
		String remove = (String) teste.pop(); 
		System.out.println(remove);
		System.out.println(remove.length());
		System.out.println(teste);
		teste.pop();
		System.out.println(teste);
		System.out.println(teste.peek());
		System.out.println(teste);
		teste.clear();
		System.out.println(teste);
		teste.push("Cachorro"); 
		teste.push("gato"); 
		teste.push("Vaca"); 
		teste.push("Boi"); 
		teste.push("Peixe"); 
		teste.push("Baleia"); 
		teste.push("Abelha"); 
		teste.push("Andorinha"); 
		teste.push("Babuino"); 
		teste.push("Camaleão"); 
		teste.push("Dromedário"); 
		teste.push("Ema"); 
		teste.push("Elefante"); 
		teste.push("Golfinho"); 
		teste.push("Hiena"); 
		System.out.println(teste);
		System.out.println("Posição: " + teste.indexOf("Peixe"));
		System.out.println("Posição: " + teste.indexOf("Hiena"));
		System.out.println("Posição Stack: " + teste.search("Peixe"));
		System.out.println("Posição Stack: " + teste.search("Hiena"));
		System.out.println("Posição Stack: " + teste.search("Cachorro"));

		System.out.println("--------------------------------------------");

		StaticStack test = new StaticStack(); 
		test.push("Cachorro");
		test.push("gato");
		test.push("Vaca");
		test.push("Boi");
		test.push("Peixe");
		System.out.println(test);
		System.out.println(test.indexOf("Peixe"));
		String remov = (String) test.pop();
		System.out.println(remov);
		System.out.println(remov.length());
		System.out.println(test);
		test.pop();
		System.out.println(test);
		System.out.println(test.peek());
		System.out.println(test);
		test.clear();
		System.out.println(test);
		test.push("Cachorro");
		test.push("gato");
		test.push("Vaca");
		test.push("Boi");
		test.push("Peixe");
		test.push("Baleia"); 
		test.push("Abelha"); 
		test.push("Andorinha"); 
		test.push("Babuino"); 
		test.push("Camaleão"); 
		test.push("Dromedário"); 
		test.push("Ema"); 
		test.push("Elefante"); 
		test.push("Golfinho"); 
		test.push("Hiena");
		System.out.println(test);
		System.out.println("Posição: " + test.indexOf("Peixe"));
		System.out.println("Posição: " + test.indexOf("Hiena"));
		System.out.println("Posição Stack: " + test.search("Peixe"));
		System.out.println("Posição Stack: " + test.search("Hiena"));
		System.out.println("Posição Stack: " + test.search("Cachorro"));
	}

}
