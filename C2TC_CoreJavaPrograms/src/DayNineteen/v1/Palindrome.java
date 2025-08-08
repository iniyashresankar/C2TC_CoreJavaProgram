//Program to define generic functional interface Palindrome

package DayNineteen.v1;

public interface Palindrome<T> {
	boolean checkPalindrome(T data);
}
