package _00_intro_to_array_lists;

import java.util.ArrayList;

public class IntroToArrayLists {
	public static void main(String[] args) {
		//1. Create an array list of Strings
		//   Don't forget to import the ArrayList (java.util) class
		ArrayList<String> strings = new ArrayList<String>();
		//2. Add five Strings to your list
		strings.add("fred");
		strings.add("bob");
		strings.add("joe");
		strings.add("Random words");
		strings.add("stuff");
		//3. Print all the Strings using a standard for-loop
		System.out.println("-------");
		for (int i = 0; i < strings.size(); i++) {
			String s = strings.get(i);
			System.out.println(s);
		}
		System.out.println("-------");
		//4. Print all the Strings using a for-each loop
		for (String st : strings) {
			System.out.println(st);
		}
		System.out.println("-------");
		//5. Print only the even numbered elements in the list.
		for (int i = 0; i < strings.size(); i++) {
			if (i % 2 == 0) {
				String s = strings.get(i);
				System.out.println(s);
			}
		}
		System.out.println("-------");
		//6. Print all the Strings in reverse order.
		for (int i = strings.size(); i > 0; i--) {
				String s = strings.get(i);
				System.out.println(s);
		}
		System.out.println("-------");
		//7. Print only the Strings that have the letter 'e' in them.
			for (String str : strings) {
				if (str.contains("e")) {
					System.out.println(str);
				}
			}
	}
}
