class A1 {
	int z;
	A1 (int x)
	{
		z=x;
	}

}
class B extends A1 {
	B()
	{
		super(10);
		System.out.println(z);
	}
	public static void main(String[] args) {
	new B();

	}

}
