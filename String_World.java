package Task_1;

import java.util.Arrays;

//String arr is given now check every element : Is palindrom , Is Anagram..... 

public class String_World {

	public static void main(String[] args) {
		
	//Array :
		String [] Arr =  {"Manzar","Bab","cbc"};
		System.out.println("Palindrom Logic :");
		//sir question aaahe ikro: agr parn wat Arr me jaam string hujan ta poe parn 		cha harr string khe  alag alag varaible me store kandasein ???
		//kyei kandasein in ji ka logic hundi ????
		String str = Arr[0];
		String strRev = "";
		String str1 = Arr[1];
		String str1Rev = "";
		String str2 = Arr[2];
		String str2Rev = "";
		str = str.toLowerCase();
		str1 = str1.toLowerCase();
		str2 = str2.toLowerCase();
		//Reverse of Str :
		for(int i=str.length()-1;i>=0;i--) {
			strRev = strRev+str.charAt(i);
		}
		
		//Reverse of Str1 :
		for(int i=str1.length()-1;i>=0;i--) {
		str1Rev = str1Rev+str1.charAt(i);
		}
		//Reverse of Str2 :
		for(int i=str2.length()-1;i>=0;i--) {
		str2Rev = str2Rev+str2.charAt(i);
		}
		if(str.equals(strRev)) {
			System.out.println(str+" Is Palidrom ");
		}
		else {
			System.out.println(str +" Is Not Palindrom");
		}
		if(str1.equals(str1Rev)) {
			System.out.println(str1+" Is  Palidrom ");
		}
		else {
			System.out.println(str1 +" Is Not Palindrom");
		}
		if(str2.equals(str2Rev)) {
			System.out.println(str2+" Is  Palidrom ");
		}
		else {
			System.out.println(str2 +" Is Not Palindrom");
		}
		
		System.out.println("");
		System.out.println("");
		System.out.println("Anagram Logic :");
		
		String str3 = "keep";
		String str4 = "peek";
		char[] Arrstr3 = str3.toLowerCase().toCharArray();  
        char[] Arrstr4 = str4.toLowerCase().toCharArray();  
        Arrays.sort(Arrstr3);
        Arrays.sort(Arrstr4);
        boolean check = true;
        check = Arrays.equals(Arrstr3, Arrstr4); 
		if(check) {
			System.out.println(str3+" "+str4+" Are anagrams");
		}
		else {
			System.out.println(str3+" "+str4+" Are not anagrams");
		}
	
	}

}
