package com;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Principal {
	public static void main(String[] args) {
		ArrayList<Auto> productos = new ArrayList<Auto>();
		Scanner sc = new Scanner(System.in);
		boolean lt = true;
		
		do {
		System.out.println("---------MENU---------");
		System.out.println("1. Insertar producto");
		System.out.println("2. Eliminar producto");
		System.out.println("3. Modificar producto");
		System.out.println("4. consultar producto");
		System.out.println("5. buscar producto");
		System.out.println("6. Salir");
		
		int opcion = sc.nextInt();
		
		if(opcion == 1) {
			System.out.println("Introduce el id de producto");
			int id = sc.nextInt();
			sc.nextLine();
			System.out.println("Introduce el nombre del producto");
			String nombre = sc.nextLine();
			System.out.println("Introduce la marca de producto");
			String marca = sc.nextLine();
			System.out.println("Introduce el precio del producto");
			double precio = sc.nextDouble();
			
			Auto pro = new Auto();
			pro.setId(id);
			pro.setNombre(nombre);
			pro.setModelo(marca);
			pro.setPrecio(precio);
			productos.add(pro);
			
		}else if(opcion==2) {
			System.out.println("Introduce el nombre del producto que desea eliminar");
			String id = sc.next();
			
			Iterator<Auto> it = productos.iterator();
			
			while(it.hasNext()) {
				Auto pro = it.next();
				if(pro.getNombre().equals(id)) {
					it.remove();
					System.out.println("Producto eliminado ");
				}
			}
			
			
			
		}else if(opcion==3) {
			System.out.println("Introduce el id del producto que desea modificar");
			String id = sc.next();
			
			System.out.println("Introduce el nuevo id de producto");
			int ide = sc.nextInt();
			sc.nextLine();
			System.out.println("Introduce el nuevo nombre del producto");
			String nom = sc.nextLine();
			System.out.println("Introduce la nueva marca de producto");
			String marca = sc.nextLine();
			System.out.println("Introduce el nuevo precio del producto");
			double precio = sc.nextDouble();
			
			Iterator<Auto> it = productos.iterator();
			
			while(it.hasNext()) {
				Auto pro = it.next();
				if(pro.getNombre().equals(id)) {
					pro.setId(ide);
					pro.setNombre(nom);
					pro.setModelo(marca);
					pro.setPrecio(precio);
					System.out.println("Producto actualizado");
				}
			}
			
			
		}else if(opcion==4) {
			for(Auto pro: productos) {
				System.out.println("id: " + pro.getId() + " Nombre: " + pro.getNombre() + " marca: "+ pro.getModelo() + " precio: "+ pro.getPrecio());
				
			}
			
		}else if(opcion==5) {
			System.out.println("Introduce el nombre del producto que deseas buscar");
			String id = sc.next();
			
			Iterator<Auto> it = productos.iterator();
			
			while(it.hasNext()) {
				Auto pro = it.next();
				if(pro.getNombre().equals(id)) {
					System.out.println("id: " + pro.getId() + " nombre: " + pro.getNombre() + " marca: " + pro.getModelo() + " precio: " + pro.getPrecio());
				}
			}
		}else if(opcion==6) {
			lt = false;
		}else {
			System.out.println("Escoge una opcion!!");
		}
		}while(lt);
	}

}
