class ModifyCharacter{
	public static void main(String[] args) {
		 StringBuffer string=new StringBuffer("Apple");  
          System.out.println("String Is : "+string); 
          string.setCharAt(3,'x');  
          System.out.println("String After Modification Is : " +string); 
	}
}