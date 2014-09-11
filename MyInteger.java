public class MyInteger {
	private int value;

    public MyInteger()
    {
    	
    }

    public MyInteger(int value)
    {
    	this.value = value;
    }

    public void SetValue(int value){
    	this.value = value;
    }
    
    public int GetValue()
    {
    	return this.value;
    }
    
    
    
    public Boolean isEven() {

		if ((this.value % 2) == 0) {
			System.out.println(value + " Is even.");
			return true;
		} else {
			System.out.println(value + " is odd.");
			return false;
		}
	}

	public Boolean isOdd() {

		if ((this.value % 2) != 0) {
			System.out.println(value + " Is odd.");
			return true;
		} else {
			System.out.println(value + "is even.");
			return false;
		}
	}

	public Boolean isPrime() {
		int i = 2;

		while (i <= this.value) {
			if (((this.value % i) == 0) && (i < this.value)) {
				System.out.println(value + " is not prime." + i +" is a factor");
				return false;
			}

			else if (i == this.value) {
				System.out.println(value + " is prime");
				return true;
			} else {
				i += 1;

			}
		}
		System.out.println("One is not a prime number");
		return null;
	}


    public Boolean isEven(int value) {

		if ((value % 2) == 0) {
			System.out.println(value + " Is even.");
			return true;
		} else {
			System.out.println(value + " is odd.");
			return false;
		}
	}

	public static Boolean isOdd(int value) {

		if ((value % 2) != 0) {
			System.out.println(value + " Is odd.");
			return true;
		} else {
			System.out.println(value + "is even.");
			return false;
		}
	}

	public static Boolean isPrime(int value) {
		int i = 2;

		while (i <= value) {
			if (((value % i) == 0) && (i < value)) {
				System.out.println(value + " is not prime." + i +" is a factor");
				return false;
			}

			else if (i == value) {
				System.out.println(value + " is prime");
				return true;
			} else {
				i += 1;

			}
		}
		System.out.println("One is not a prime number");
		return null;
	}
	
	public Boolean equals(int value) {
		
		if (this.value == value){
			System.out.println("The values are equal.");
			return true;}
		
		else {
			return false;}}
		

	public static int parseInt(char[] array) {
		int total = 0;
		for(int n = 0; n < array.length; n++){
			int r = array[n];
			total = total + r;	}	

		return total;

			}
		
    
       
        

	
	public static int parseInt(String str) {
		int ascii_value = 0;
		for (int n = 0; n <= str.length(); n++){
			char k = str.charAt(n);
			int m = k;
			ascii_value = ascii_value + m;
					
		}
		return ascii_value;
		
	}


}	
