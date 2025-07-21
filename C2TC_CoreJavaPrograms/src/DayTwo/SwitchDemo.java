package DayTwo;

public class SwitchDemo {

	public static void main(String[] args) {
		
		char x = 'd';
		
		switch(x)
		{
			case 'l':
			case 'L':
				System.out.println(x+" is a letter");
				break;
			case 'd':
			case 'D':
				System.out.println(x+" is a digit");
				break;
			case 'w':
			case 'W':
				System.out.println(x+" is a whitespace");
				break;
			case 's':
			case 'S':
				System.out.println(x+" is a special character");
				break;
			default:
				System.out.println(x+" is other than letter, digit, special character, whitespace");
				break;
		}
	}
}
