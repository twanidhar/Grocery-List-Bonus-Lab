package collectionsLab;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

public class ShoppingListApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scnr = new Scanner(System.in);
		HashMap < String, Double > menuItem =  new HashMap < String, Double >();

		menuItem.put("Apple ", 0.60);
		menuItem.put("Bananas ", 0.59);
		menuItem.put("Cherries ", 2.99);
		menuItem.put("Pear ", 3.99);
		menuItem.put("Pineapple ", 7.99);
		menuItem.put("Bread", 1.99);
		menuItem.put("Turkey", 2.50);
		menuItem.put("Lettuce", 0.99);
		
		Set<String> keySet = menuItem.keySet();
		
		ArrayList<String>menuItems = new ArrayList<String>(keySet);
		System.out.println("menuItem: ");
		for (String menu:keySet)
		{
			System.out.println(menu);	
		}
		Collection<Double> prices = menuItem.values();
		ArrayList<Double>menuPrices = new ArrayList<Double>(prices);
		System.out.println("menuPrices:");
		for (Double price: prices)
		{
			System.out.println(price);
		}			
		   
        Set<Entry<String, Double>> entrySet = menuItem.entrySet();
         
        //entry objects
         
        ArrayList<Entry<String, Double>> listOfEntry = new ArrayList<Entry<String,Double>>(entrySet);
         
        System.out.println("Menu items with prices:");
         
        for (Entry<String, Double> entry : listOfEntry) 
        {
            System.out.println(entry.getKey()+":"+entry.getValue());
        }
		
        List<String> menuList = new ArrayList<>();
		Set<String> priceSet = new HashSet<>();
		
		boolean isContinue; 
		do {
			System.out.println("What would like to add? Choose an item from the menu.");
			String thing = scnr.nextLine();
			menuList.add(thing);
			priceSet.add(thing);
			
			System.out.println("Do you want to add another (y/n)?");
			isContinue = scnr.nextLine().toLowerCase().startsWith("y");
		}while (isContinue);
		
		
		System.out.println("List: " + menuList);
		System.out.println("set: " + priceSet);
		scnr.close();
	}

		
		}
