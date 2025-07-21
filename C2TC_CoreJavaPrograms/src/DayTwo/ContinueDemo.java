package DayTwo;

public class ContinueDemo {

	public static void main(String[] args) {
		
		for (int i = 30; i < 100; i++ )
		{
			if (i % 2 == 0)
				continue;
			System.out.println("Print odd number (even skipped) "+i+"\n");
		}
	}

}
