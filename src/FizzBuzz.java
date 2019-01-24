public class FizzBuzz {

	// Players generally sit in a circle. The player designated
	// to go first says the number "1", and each player thenceforth
	// counts one number in turn. However, any number divisible
	// by three is replaced by the word fizz and any divisible
	// by five by the word buzz. Numbers divisible by both become
	// fizz buzz.

	// For example, a typical round of fizz buzz would start as follows:

	// 1, 2, Fizz, 4, Buzz, Fizz, 7, 8, Fizz, Buzz, 11, Fizz, 13,
	// 14, Fizz Buzz, 16, 17, Fizz, 19, Buzz, Fizz, 22, 23, Fizz, ...

	// Print a fizz buzz game from 1 to 100.

	public static void main(String[] args) {
		
		for (int i = 1; i < 101; i++) {
			if ((i%3 == 0) && (i %5 == 0)) {
				System.out.println("Fizz Buzz");
			} else if(i % 3 == 0) {
				System.out.println("Fizz");
			} else if (i % 5 == 0) {
				System.out.println("Buzz");
			} else {
				System.out.println(i);
			}
		}
	}
}


