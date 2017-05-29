class stringCompareEmp {

	String str = "Wei Huang";
	String anotherString = "Eun Park";
	String objStr = str;

	public void display() {
		System.out.println(" ");
		System.out.println("===-------=== Java String Example ===----------===");
		System.out.println("\n======== Compare the string Between \"" +str+ "\" and \"" +anotherString+ "\" =======");
		System.out.println("comparisonTo:\t\t\t\t\t"+str.compareTo(anotherString));
		System.out.println("compareToIgnoreCase:\t\t\t\t" +str.compareToIgnoreCase(anotherString));
		System.out.println("comparisonTo(obStr.toString):\t\t\t" +str.compareTo(objStr.toString()));
	}
}

class searchLastString {
	String strOrig = "Hello World, Hello Reader";
	int lastIndex = strOrig.lastIndexOf("Hello");

	void display() {
		System.out.println(" ");
		System.out.println("====== Get Index for all =======");
		for(int i = 0; i <= strOrig.length() - 1; i++)
		{
			System.out.println("Index["+(i+1)+"] = " +strOrig.indexOf[i]);
		}
		System.out.println("====== Search the string =======");
		if (lastIndex == -1) {
			System.out.println("Hello not found");
		} else {
			System.out.println("Last occurrence of Hello is at index " + lastIndex);
		}
	}

	void display1() {
		String strOrig = "Hello readers";
		int intIndex = strOrig.indexOf("Hello");
		if (intIndex == -1) {
			System.out.println("Hello not found");
		} else {
			System.out.println("Found Hello at index " + intIndex);
		}
	}
}

class deleteCharacter {
	String str = "this is Java";

	void display() {
		System.out.println(" ");
		System.out.println("====== Delete the string =======");
		System.out.println(removeCharAt(str, 3));
	}

	public static String removeCharAt(String s, int pos) {
		return s.substring(0, pos) + s.substring(pos + 1);
	}
}

class replaceCharacter {
	String str = "hello world";

	void display() {
		System.out.println(" ");
		System.out.println("======= Replace the string =======");
		System.out.println(str.replace('h', 'W'));
		System.out.println(str.replaceFirst("he", "Wa"));
		System.out.println(str.replaceAll("he", "Ha"));
	}
}

class reverseCharacter {
	String string = "abcdef";
	String reverse = new StringBuffer(string).reverse().toString();

	void display() {
		System.out.println(" ");
		System.out.println("======== Reverse the string =======");
		System.out.println("String before reverse: " + string);
		System.out.println("String after reverse: " + reverse);
	}
}

class splitString {
	String str = "jan-feb-march";
	String delimeter = "-";
	String[] temp;

	void display() {
		System.out.println("\n====== Split String =======");
		temp = str.split(delimeter);
		for (int i = 0; i < temp.length; i++) {
			System.out.println(temp[i]);
			System.out.println("");
			str = "jan.feb.march";
			delimeter = "\\.";
			temp = str.split(delimeter);
		}
		for (int i = 0; i < temp.length; i++) {
			System.out.println(temp[i]);
			System.out.println("");
			temp = str.split(delimeter, 2);
			for (int j = 0; j < temp.length; j++) {
				System.out.println(temp[j]);
			}
		}
	}
}

public class HelloWorld {

	public static void main(String args[]) {

		stringCompareEmp sce = new stringCompareEmp();
		sce.display();
		searchLastString sls = new searchLastString();
		sls.display();
		sls.display1();
		deleteCharacter dc = new deleteCharacter();
		dc.display();
		replaceCharacter rc = new replaceCharacter();
		rc.display();
		reverseCharacter rvc = new reverseCharacter();
		rvc.display();
		splitString ss = new splitString();
		ss.display();
	}
}
