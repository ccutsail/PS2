
public class TestMyInteger {

	public static void main(String[] args) {
		char[] array = {1,2,3};
		MyInteger MyInt = new MyInteger(123);
		System.out.println(MyInt.isEven());
		System.out.println(MyInt.isOdd());
		System.out.println(MyInt.isPrime());
		MyInteger UrInt = new MyInteger(2);
		System.out.println(UrInt.isEven());
		System.out.println(UrInt.isOdd());
		System.out.println(UrInt.isPrime());		
		System.out.println(MyInt.equals(12));
		System.out.println(UrInt.equals(2));
		System.out.print(MyInteger.parseInt(array));

		
	}

}
