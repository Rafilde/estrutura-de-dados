package dynamicstack;

import java.util.Stack;

public class Main {

	public static void main(String[] args) {
		Stack teste = new Stack();
		System.out.println(teste.isEmpty());
		teste.push("Cachorro"); 
		System.out.println(teste);
		System.out.println(teste.peek());
		teste.push("gato"); 
		System.out.println(teste);
		System.out.println(teste.peek());
		teste.push("Vaca"); 
		System.out.println(teste);
		System.out.println(teste.peek());
		teste.push("Boi"); 
		System.out.println(teste);
		System.out.println(teste.peek());
		teste.push("Peixe"); 
		System.out.println(teste);
		System.out.println(teste.peek());
		System.out.println(teste.size());
		System.out.println(teste.isEmpty());
		teste.clear();
		System.out.println(teste);
		System.out.println(teste.isEmpty());
		System.out.println(teste.size());
		teste.push("Cachorro"); 
		teste.push("gato"); 
		teste.push("Vaca"); 
		teste.push("Boi");
		teste.push("Peixe"); 
		System.out.println(teste);
		System.out.println(teste.pop());
		System.out.println(teste);
		System.out.println(teste.pop());
		System.out.println(teste);
		System.out.println(teste.pop());
		System.out.println(teste);
		System.out.println(teste.pop());
		System.out.println(teste);
		System.out.println(teste.pop());
		System.out.println(teste);
		teste.push("Cachorro"); 
		teste.push("gato"); 
		teste.push("Vaca"); 
		teste.push("Boi");
		teste.push("Peixe");
		System.out.println(teste);
		System.out.println(teste.indexOf("Peixe"));
		System.out.println(teste.indexOf("Cachorro"));
		System.out.println(teste.search("Cachorro"));
		System.out.println(teste.search("gato"));
		System.out.println(teste.search("Vaca"));
		System.out.println(teste.search("Boi"));
		System.out.println(teste.search("Peixe"));
		System.out.println(teste.search("Teste"));
		System.out.println(teste.contains("Cachorro"));
		System.out.println(teste.contains("Boi"));
		System.out.println(teste.contains("Peixe"));
		System.out.println(teste.contains("Teste"));
		
		System.out.println("---------------------------------");
		
		DynamicStack stack = new DynamicStack(); 
		System.out.println(stack.isEmpty());
		stack.push("Cachorro");
		System.out.println(stack);
		System.out.println(stack.peek());
		stack.push("gato");
		System.out.println(stack);
		System.out.println(stack.peek());
		stack.push("Vaca");
		System.out.println(stack);
		System.out.println(stack.peek());
		stack.push("Boi");
		System.out.println(stack);
		System.out.println(stack.peek());
		stack.push("Peixe");
		System.out.println(stack);
		System.out.println(stack.peek());
		System.out.println(stack.size());
		System.out.println(stack.isEmpty());
		stack.clear();
		System.out.println(stack);
		System.out.println(stack.isEmpty());
		System.out.println(stack.size());
		stack.push("Cachorro"); 
		stack.push("gato"); 
		stack.push("Vaca"); 
		stack.push("Boi");
		stack.push("Peixe"); 
		System.out.println(stack);
		System.out.println(stack.pop());
		System.out.println(stack);
		System.out.println(stack.pop());
		System.out.println(stack);
		System.out.println(stack.pop());
		System.out.println(stack);
		System.out.println(stack.pop());
		System.out.println(stack);
		System.out.println(stack.pop());
		System.out.println(stack);
		stack.push("Cachorro"); 
		stack.push("gato"); 
		stack.push("Vaca"); 
		stack.push("Boi");
		stack.push("Peixe"); 
		System.out.println(stack);
		System.out.println(stack.indexOf("Peixe"));
		System.out.println(stack.indexOf("Cachorro"));
		System.out.println(stack.search("Cachorro"));
		System.out.println(stack.search("gato"));
		System.out.println(stack.search("Vaca"));
		System.out.println(stack.search("Boi"));
		System.out.println(stack.search("Peixe"));
		System.out.println(stack.search("Teste"));
		System.out.println(stack.contains("Cachorro"));
		System.out.println(stack.contains("Boi"));
		System.out.println(stack.contains("Peixe"));
		System.out.println(stack.contains("Teste"));
	}

}
