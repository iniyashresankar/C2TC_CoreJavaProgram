package DayTwo;

public class BreakDemo {

	public static void main(String[] args) {
		
		for (int i = 5; i < 16; i++)
		{
			if (i % 4 == 0)
				break;
			System.out.println(i);
		}
	}

}
