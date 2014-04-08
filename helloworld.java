/*
	multi line comment
*/

class Hello {

	// single line comment
	public Hello(int i)
	{
		switch(i) {
		case 2:
			System.out.println("hello, world!");
		default:
			break;
		}
	}

	public static void main(String[] args)
	{
		for(int i = 0; i<10; i++)
			new Hello(i);
	}
}