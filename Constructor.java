class Constructor{

	Constructor(){
		System.out.println("Default Constructor !");
	}

	void Constructor(){
		System.out.println("Inside Method !");
	}

	public static void main(String[] args) {
		
		Constructor obj=new Constructor();

		obj.Constructor();

	}

}