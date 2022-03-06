package Task_2;

public class String_Spaces_Consonants_vowels {
//Given String : Check vowels,consonants,No:Of Spaces,Compare 2 string which one is greator




public static void main(String[] args) {
	
	System.out.println("<<<<<Spaces Logic :>>>>>");
	String str = "Hello This Is Java Class";
	int space = 0;
	
	for(int i=0;i<=str.length()-1;i++) {
		char ch = str.charAt(i);
		if(ch == ' ') {
			space++;
		}
		
	}
	System.out.println("Spaces in given string are "+space);
	System.out.println("");
	
	System.out.println("<<<<<Vowels Logic , Consonants Logic>>>>>");
	int vowels = 0;
	int consonants = 0;
	str = str.toLowerCase();
	for(int i=0;i<=str.length()-1;i++) {
		char ch = str.charAt(i);
		
		if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
			++vowels;
		}
		else {
			consonants++;
		}
		
	}
	System.out.println("Vowels in given string are :"+vowels);
	System.out.println("Consonants in given string are :"+consonants);
	
	System.out.println("");
	System.out.println("<<<<Compare 2 String which one is greator>>>>");
	
	String str5 = "afaq";
	String str6 = "zoopant";
	
	int a = str5.compareToIgnoreCase(str6);
	int b = str6.compareToIgnoreCase(str5);
	//System.out.println(a);
	//System.out.println(b);
	if(b>a) {
		System.out.println(str5+" is Greator than "+str6);
	}
	else if(a>b) {
		System.out.println(str6+" is Greator than "+str5);
	}
	else {
		System.out.println("Both are equal");
	}
	
	
	
	}
}

