class S_Method{ 
      
    static String myName = "";  
    static void printName(String name){ 
        myName = name; 
    } 
    public static void main (String[] args) { 
        S_Method.printName("Motasim");
        System.out.println(S_Method.myName);
        S_Method obj=new S_Method();
        obj.printName("Makki"); 
        System.out.println(obj.myName); 
    } 
} 