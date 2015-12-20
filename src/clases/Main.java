package clases;
import java.util.ArrayList;
import java.util.Scanner;

import Demo.entidades.Cliente;

public class Main {
public static void main (String[] args){
	Cliente cl1= new Cliente("099999999", "cesar", "bustamante", 31);
	Cliente cl2= new Cliente("099999549", "genesis", "figueroa", 22);
	Cliente cl3= new Cliente("09993499", "aylis", "cedillo", 21);
	
	ArrayList<Cliente> clientes= new ArrayList<Cliente>();
	clientes.add(cl1);
	clientes.add(cl2);
	clientes.add(cl3);
	
	 /* forma larga de presentar los arreglos
	Cliente temp1=clientes.get(0);
	Cliente temp2=clientes.get(1);
	Cliente temp3=clientes.get(2);
	*/
	System.out.println("tama�o de clientes:" + clientes.size());
	//forma corta de presentar el arreglo
	for (int i=0; i<clientes.size(); i++){
		Cliente temp=clientes.get(i);
		System.out.println(temp);	}
	
	int op=0;
	do{
		System.out.println("<1> ingresar cliente");
		System.out.println("<2> modificar clientes");
		System.out.println("<3> eliminar clientes");
		System.out.println("<4> mostrar clientes");
		System.out.println("<5> salir");
		Scanner sc=new Scanner(System.in);
		System.out.println("leer op");
		op=sc.nextInt();
		switch (op){
		case 1: 
			System.out.println("ingrese identificacion");
		String identificacion=sc.next();
		System.out.println("ingrese nombre");
		String nombre=sc.next();
		System.out.println("ingrese apellido");
		String apellido=sc.next();
		System.out.println("ingrese edad");
		int edad=sc.nextInt();
		Cliente cl=new Cliente(identificacion, nombre, apellido, edad);
		clientes.add(cl);
		break;
		case 2:
			System.out.println("listas de clientes");
			for (int i=0; i<clientes.size(); i++){
				Cliente temp=clientes.get(i);
				System.out.println(temp);	}
			break ;
		}
		
}while (op!=3);
	/*
	System.out.println(temp1);
	System.out.println(temp2);
	System.out.println(temp3);
	*/
}
}

