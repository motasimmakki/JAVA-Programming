class I_Method{ 
      
    String name = "";  
    public void printName(String name){ 
        this.name = name; 
    } 
    public static void main (String[] args) { 
        I_Method ob = new I_Method(); 
        ob.printName("Motasim"); 
        System.out.println(ob.name); 
    } 
} 