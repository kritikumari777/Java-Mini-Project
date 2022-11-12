package demo1;

import java.util.HashMap;
import java.util.Scanner;

public class MostOccuranceWordLatter { //error
	
	public static void findOccerance(String str) {  // for latter
		String[] s = str.split("");   //String[] s = str.split(" "); ----> for word
		String visited="-1";
		int index=0;
		int count=0;
		for(int i=0; i<s.length; i++) {
			int tempcount=1;
			for(int j=i+1; j<s.length; j++) {
				if(s[j].compareTo(s[i])==0) {
					tempcount++;
					s[j]=visited;
					if(tempcount>count && s[i].compareTo(" ")!=0) {
						count=tempcount;
						index=i;
					}
				}
			}
			if(s[i]!=visited && s[i].compareTo(" ")!=0) {
				System.out.println(s[i]+"-------="+tempcount);
			}
		}
		System.out.println("Most repated word is "+s[index]+" --> "+count);
	}
	
	//----------or---------------------------------------------------

	public static void findMostOccureanc(String s, HashMap<String, Integer> hm) {  // for word
		String[] str = s.split(" ");  //String[] str = s.split("");----> for letter
		int[] arr = new int[str.length];
		String visited = "-1";
		for (int i = 0; i < str.length; i++) {
			int count = 1;
			for (int j = i + 1; j < str.length; j++) {
				if (str[i].compareTo(str[j]) == 0) {
					count += 1;
					str[j] = visited;
				}
			}
			if (str[i] != visited && str[i].compareTo(" ")!=0) {
				hm.put(str[i], count);
			}
		}
		System.out.println(hm);
		String K = "";
		int maxValue = 0;
		for(String i : hm.keySet())
		{
			System.out.println(hm.get(i));
		    if(hm.get(i) > maxValue)
		    {
		        K = i;
		        maxValue = hm.get(i);
		    }
		}
		System.out.println(K+"-----"+maxValue);
		
		//OR--------------------------------------------------
		//int maxVM = (Collections.max(hm.values()));
		//for (Entry<String, Integer> i : hm.entrySet()) {
		//	if (i.getValue() == maxVM) {
		//		System.out.println(i.getKey() + "----" + maxVM);
		//	}
		//}

	}

	public static void main(String[] args) {
		System.out.println("enter the sentance");
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		
		findOccerance(str);  //or
		
		HashMap<String, Integer> hm = new HashMap<String, Integer>();
		//findMostOccureanc(str, hm);

	}

}
