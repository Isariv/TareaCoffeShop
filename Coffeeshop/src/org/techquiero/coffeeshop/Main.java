/**
 * 
 */
package org.techquiero.coffeeshop;

import java.util.Scanner;

import org.techquiero.model.Beverage;
import org.techquiero.model.Coffee;
import org.techquiero.model.Frappe;
import org.techquiero.model.Tea;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		System.out.println( "    (  )   (   )  )\r\n" + 
				"     ) (   )  (  (\r\n" + 
				"     ( )  (    ) )\r\n" + 
				"     _____________\r\n" + 
				"    <_____________> ___\r\n" + 
				"    |             |/ _ \\\r\n" + 
				"    |               | | |\r\n" + 
				"    |               |_| |\r\n" + 
				" ___|             |\\___/\r\n" + 
				"/    \\___________/    \\\r\n" + 
				"\\_____________________/" );
		
		System.out.println("      Bienvenid(a) ");
		System.out.println("Estás en la Bodeguita de Chabe");
		
		System.out.println("¿Cúantas bebidas va a llevar?");
		Scanner scanner = new Scanner(System.in);
		
		int beverageQuantity = scanner.nextInt();
		
		if ((beverageQuantity  <=0)||(beverageQuantity >=10)) {
				System.out.println("Favor de pedir un número de bebidas adecuado");
			}else {
				
				Beverage beverage ;
				Beverage []arrayBeverage = new Beverage[beverageQuantity];
				
				
				for(int i=0; i<arrayBeverage.length; i++) {
					System.out.print("¿Seleccione el número de bebida que quiere?"
							+ "\n\" 1.- Café"
							+ "\n\" 2.- Frappe"
							+ "\n\" 3.- Té");
					Scanner bebida = new Scanner(System.in);
					
					int kindBeverage = scanner.nextInt();
							
					switch(kindBeverage) {
						case 1: 
							System.out.println("Cafe");
							Coffee coffe = new Coffee();
							
							System.out.println("Nombre del café: ");
							Scanner name = new Scanner(System.in);
							coffe.setName(name.next());
							
							System.out.println("¿Con leche?");
							
							Scanner withMilk = new Scanner(System.in);
							
							if( withMilk.nextLine() == "Si" ){
								coffe.setWithMilk(true);
							}else {
								coffe.setWithMilk(false);
							}
				
							System.out.println("Tamaño del café 1.- Chico,\r\n" + 
									"		2.- Mediano,\r\n" + 
									"		3.- Grande   ");	
							Scanner size = new Scanner(System.in);
							if(coffe.isWithMilk()) {
								switch(size.nextInt()) {
								case 1: 
									coffe.setSize(1);
									coffe.setPrice(28.00);
								break;
								case 2:
									coffe.setSize(2);
									coffe.setPrice(33.00);
								break;
								case 3: 
									coffe.setSize(3);
									coffe.setPrice(38.00);
								break;
								default: System.out.println("Favor de ingresar el número corresponsiente al tamano");
								break;
								}
								
							}else{
							
								switch(size.nextInt()) {
									case 1: 
										coffe.setSize(1);
										coffe.setPrice(20.00);
									break;
									case 2:
										coffe.setSize(2);
										coffe.setPrice(30.00);
									break;
									case 3: 
										coffe.setSize(3);
										coffe.setPrice(35.00);
									break;
									default: System.out.println("Favor de ingresar el número corresponsiente al tamano");
									break;
								}
							}
							
							System.out.println("¿Qué tipo de grano le gustaría?");
							Scanner grain = new Scanner(System.in);
							coffe.setGrain(grain.next());
				
							System.out.println(coffe);

						
						break;
						case 2: 
						System.out.println("Frappe");
						Frappe frappe = new Frappe();
						
						System.out.println("Nombre del frapeé: ");
						Scanner name1 = new Scanner(System.in);
						frappe.setName(name1.next());
						
						System.out.println("¿Con leche?");
						
						Scanner withMilk1 = new Scanner(System.in);
						
						if( withMilk1.nextLine() == "Si" ){
							frappe.setWithMilk(true);
						}else {
							frappe.setWithMilk(false);
						}
			
						System.out.println("Tamaño del frapé 1.- Chico,\r\n" + 
								"		2.- Mediano,\r\n" + 
								"		3.- Grande   ");	
						Scanner size1 = new Scanner(System.in);
						if(frappe.isWithMilk()) {
							switch(size1.nextInt()) {
							case 1: 
								frappe.setSize(1);
								frappe.setPrice(28.00);
							break;
							case 2:
								frappe.setSize(2);
								frappe.setPrice(33.00);
							break;
							case 3: 
								frappe.setSize(3);
								frappe.setPrice(38.00);
							break;
							default: System.out.println("Favor de ingresar el número corresponsiente al tamano");
							break;
							}
							
						}else{
						
							switch(size1.nextInt()) {
								case 1: 
									frappe.setSize(1);
									frappe.setPrice(20.00);
								break;
								case 2:
									frappe.setSize(2);
									frappe.setPrice(30.00);
								
									break;
								case 3: 
									frappe.setSize(3);
									frappe.setPrice(35.00);
								break;
								default: System.out.println("Favor de ingresar el número corresponsiente al tamano");
								break;
							}
						}
						
						System.out.println("¿Qué tipo de crema le gustaría?");
						Scanner cream = new Scanner(System.in);
						frappe.setCream(cream.next());
			
						System.out.println(frappe);
						
						break;
						case 3: System.out.println("Té");
						Tea tea = new Tea();

						
						System.out.println("Nombre del té: ");
						Scanner name11 = new Scanner(System.in);
						tea.setName(name11.next());
						
						System.out.println("¿Con leche?");
						
						Scanner withMilk11 = new Scanner(System.in);
						
						if( withMilk11.nextLine() == "Si" ){
							tea.setWithMilk(true);
						}else {
							tea.setWithMilk(false);
						}
			
						System.out.println("Tamaño del frapé 1.- Chico,\r\n" + 
								"		2.- Mediano,\r\n" + 
								"		3.- Grande   ");	
						Scanner size11 = new Scanner(System.in);
						if(tea.isWithMilk()) {
							switch(size11.nextInt()) {
							case 1: 
								tea.setSize(1);
								tea.setPrice(28.00);
							break;
							case 2:
								tea.setSize(2);
								tea.setPrice(33.00);
							break;
							case 3: 
								tea.setSize(3);
								tea.setPrice(38.00);
							break;
							default: System.out.println("Favor de ingresar el número corresponsiente al tamano");
							break;
							}
							
						}else{
						
							switch(size11.nextInt()) {
								case 1: 
									tea.setSize(1);
									tea.setPrice(20.00);
								break;
								case 2:
									tea.setSize(2);
									tea.setPrice(30.00);
								
									break;
								case 3: 
									tea.setSize(3);
									tea.setPrice(35.00);
								break;
								default: System.out.println("Favor de ingresar el número corresponsiente al tamano");
								break;
							}
						}
						
						System.out.println("¿Qué tipo de hoja le gustaría?");
						Scanner leave = new Scanner(System.in);
						tea.setLeave(leave.next());
			
						System.out.println(tea);
						
						
						
						break;
						default: System.out.println("Favor de ingresar un número correcto");
						i =--i;
						break;
					
					}
				}

			}

		}

	}



