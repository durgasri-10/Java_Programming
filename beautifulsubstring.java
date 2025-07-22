import java.util.Scanner;
public class beautifulsubstring {
		public static String findBeautifulSubstring(String word) {
			String max = "0";
			for (int i = 0; i < word.length(); i++) {
			if (word.charAt(i) == 'a') {
			int j = i, a = 0, e = 0, iCount = 0, o = 0, u = 0;
			while (j < word.length() && "aeiou".indexOf(word.charAt(j)) != -1) {
			char c = word.charAt(j);
			if (c == 'a' && e+iCount+o+u == 0) a++;
			else if (c == 'e' && a > 0 && iCount+o+u == 0) e++;
			else if (c == 'i' && a+e > 0 && o+u == 0) iCount++;
			else if (c == 'o' && a+e+iCount > 0 && u == 0) o++;
			else if (c == 'u' && a+e+iCount+o > 0) u++;
			else break;
			if (a > 0 && e > 0 && iCount > 0 && o > 0 && u > 0) {
			if (j-i+1 > max.length()) 
			max = word.substring(i, j+1);
			}
			j++;
			}
			}
			}
			return max.equals("0") ? "0" : max;
			}

			public static void main(String[] args) {
				Scanner sc=new Scanner(System.in);
				String word=sc.nextLine();
				
			System.out.println(findBeautifulSubstring(word));
			}
			


	}