package List;

import java.util.LinkedList;

public class Main {

	public static void main(String[] args) {
		
		LinkedList te = new LinkedList();
		te.add(0, 4);
		System.out.println(te);
		System.out.println(te.size());
		/*te.add(1, 6);
		System.out.println(te);
		System.out.println(te.size());*/
		te.add(1, 6);
		System.out.println(te);
		System.out.println(te.size());
		te.add(1, 7);
		System.out.println(te);
		System.out.println(te.size());
		te.add(0, 8);
		System.out.println(te);
		System.out.println(te.size());
		te.add(4, 8);
		System.out.println(te);
		System.out.println(te.size());
		te.add(4, 10);
		System.out.println(te);
		System.out.println(te.size());
		te.add(1, 11);
		System.out.println(te);
		System.out.println(te.size());
		//System.out.println(te.get(6));
		
		System.out.println("-----------------");
		
		te.remove(6);
		System.out.println(te);
		System.out.println(te.size());
		te.remove(5);
		System.out.println(te);
		System.out.println(te.size());
		te.remove(1);
		System.out.println(te);
		System.out.println(te.size());
		te.remove(0);
		System.out.println(te);
		System.out.println(te.size());
		
		System.out.println("");
		
		te.set(2, 2);
		System.out.println(te);
		System.out.println(te.size());
		
		/*LinkedList teste = new LinkedList();
		teste.set(0, 3); 
		System.out.println(teste);
		System.out.println(teste.size());*/
		
		DynamicList list = new DynamicList();
		list.adicionarInicio(100);
		list.adicionarInicio(200);
		list.adicionarInicio(300); 
		list.set(1, 45);
		System.out.println(list);
		/*list.adicionarInicio(300); 
		System.out.println(list);
		list.addPosicao(1, 700);
		System.out.println(list);
		list.removerPosicao(2);
		list.removerPosicao(0);
		System.out.println(list);
		System.out.println(list.size());*/
	}
}

//Teste 1
/*
 * DynamicList list = new DynamicList();
		list.adicionarInicio(100);
		list.adicionarInicio(200);
		list.adicionarInicio(300);
		list.adicionarFinal(10);
		list.adicionarFinal(20);
		list.adicionarFinal(30);
		System.out.println(list);
		System.out.println(list.size());
		list.removerInicio();
		System.out.println(list);
		System.out.println(list.size());
		list.removerFinal();
		System.out.println(list);
		System.out.println(list.size());
		list.clear();
		System.out.println(list);
		System.out.println(list.size());
		list.adicionarInicio(100);
		list.adicionarInicio(200);
		System.out.println(list);
		System.out.println(list.size());
		
 * */

//Teste 2 
/*
 
 DynamicList listdois = new DynamicList();
		//System.out.println(listdois.get(0));
		listdois.adicionarFinal(3);
		listdois.adicionarFinal(4);
		listdois.adicionarFinal(5);
		listdois.adicionarFinal("oi");
		System.out.println(listdois);
		System.out.println(listdois.size());
		System.out.println(listdois.get(3));
		System.out.println(listdois.get(1));
		System.out.println(listdois.get(0));
		listdois.removerInicio();
		System.out.println(listdois);
		System.out.println(listdois.get(0));
		System.out.println(listdois.get(2));
 
 * */

//Teste 3
/*
 
 DynamicList listtres = new DynamicList();
		//listtres.addPosicao(3, 4);
		System.out.println(listtres.constains(2));
		listtres.addPosicao(0, 4);
		System.out.println(listtres);
		System.out.println(listtres.size());
		listtres.addPosicao(1, 6);
		System.out.println(listtres);
		System.out.println(listtres.size());
		listtres.addPosicao(1, 7);
		System.out.println(listtres);
		System.out.println(listtres.size());
		listtres.addPosicao(0, 8);
		System.out.println(listtres);
		System.out.println(listtres.size());
		listtres.addPosicao(4, 8);
		System.out.println(listtres);
		System.out.println(listtres.size());
		listtres.addPosicao(4, 10);
		System.out.println(listtres);
		System.out.println(listtres.size());
		listtres.addPosicao(1, 11);
		System.out.println(listtres);
		System.out.println(listtres.size());
		//System.out.println(listtres.get(6));
		
		System.out.println("-----------------");
		
		listtres.removerPosicao(6);
		System.out.println(listtres);
		System.out.println(listtres.size());
		listtres.removerPosicao(5);
		System.out.println(listtres);
		System.out.println(listtres.size());
		listtres.removerPosicao(1);
		System.out.println(listtres);
		System.out.println(listtres.size());
		listtres.removerPosicao(0);
		System.out.println(listtres);
		System.out.println(listtres.size());
		
		System.out.println(listtres.indexOf(7));
		System.out.println(listtres.indexOf(4));
		System.out.println(listtres.indexOf(6));
		
		listtres.clear();
		System.out.println(listtres);
		System.out.println(listtres.size());
		
		listtres.addPosicao(0, 4);
		listtres.addPosicao(0, "ola");
		listtres.addPosicao(0, 2);
		listtres.addPosicao(0, "eae");
		System.out.println(listtres);
		System.out.println(listtres.indexOf(2));
		System.out.println(listtres.indexOf("ola"));
		System.out.println(listtres.get(0));
		System.out.println(listtres.constains(2));
		System.out.println(listtres.constains("ola"));
 
 * */

