public class UserInput {
    

    public static class TextInput 
    {
   		StringBuilder myString=new StringBuilder();

    	public void add(char c){
    		myString.append(c);
    	}

    	public String getValue(){
    		String finalString=myString.toString();

    		return finalString;
    	}
    }

    public static class NumericInput extends TextInput 
    {	
    	@Override
    	public void add(char c)
    	{
    		if(Character.isDigit(c)){
	    		myString.append(c);
    		}
    	} 
    }

    public static void main(String[] args) {
        NumericInput input=new NumericInput();
        input.add('1');
        input.add('a');
        input.add('0');
        System.out.println(input.getValue());
    }
}