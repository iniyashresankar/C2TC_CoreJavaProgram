package DayTwo;

public class ForEachLoopDemo {

	public static void main(String[] args) {
		
		int[] a = {10, 20 , 30 , 40 , 50};
		
		for(int i : a)
		{
			System.out.println(i);
		}
		System.out.println("\n");
		
		char[] word = {'s', 'd', 'f', 'g', 'h'};
		for(char ch:word)
		{
			System.out.println(ch);
		}
		System.out.println("\n");
		
		String[] s1 = {"Welcome", "to", "the", "of", "programming"};
		for(String str : s1)
		{
			System.out.println(str+" ");
		}
	}

}
