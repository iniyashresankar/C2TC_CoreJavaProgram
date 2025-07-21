package DayTwo;

public class NestedIfElseDemo {

	public static void main(String[] args) {
		
		int a = 2, b = 20, c = 30;
		if (a>b)
		{
			if (a>c)
			{
				System.out.println(a);
			}
			else
			{
				System.out.println(c);
			}
		}
		
		else
		{
			if(c>b)
			{
				System.out.println(c);
			}
			else
			{
				System.out.println(b);
			}
		}

	}

}
