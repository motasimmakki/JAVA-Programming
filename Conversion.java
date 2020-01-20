import java.util.*;

class Conversion{

	public int getPriority(char token){
		if(token=='+'||token=='-')
			return 1;
		if(token=='*'||token=='/'||token=='%')
			return 2;
		
		return 3;
	}

	public boolean isOperator(char token){
		if(token=='+'||token=='-'||token=='*'||token=='/'||token=='%'||token=='^'||token=='$'||token=='('||token==')')
			return true;
		
		return false;
	}

	public void getPostfix(String infix){
		Stack<Character> stack=new Stack<Character>();
		ArrayList<Character> arrayList=new ArrayList<Character>();

		stack.push('(');

		infix=infix+')';	

		for(int i=0;i<infix.length();i++){

			if(isOperator(infix.charAt(i))){
				if((stack.isEmpty()||infix.charAt(i)=='('||(getPriority(stack.peek())<getPriority(infix.charAt(i))))&&(infix.charAt(i)!=')')){
					stack.push(infix.charAt(i));
				}
				else{
					if(infix.charAt(i)!=')'){
						while((!(getPriority(stack.peek())<getPriority(infix.charAt(i))))&&((stack.peek()!='('))){
								arrayList.add(stack.pop());
						}
						stack.push(infix.charAt(i));
					}
				}
				if(infix.charAt(i)==')'){
					while((!stack.isEmpty())&&stack.peek()!='('){
						arrayList.add(stack.pop());
					}
					if(stack.peek()=='(')
						stack.pop();
				}
			}
			else{
				arrayList.add(infix.charAt(i));
			}

		}

		while(!stack.isEmpty()&&stack.peek()!='('){
			arrayList.add(stack.pop());
		}

		System.out.println("The Conversion of entered Infix notation into Postfix is : "+arrayList);

	}

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);	
		Conversion conversion=new Conversion();

		System.out.println("Enter The Infix To Convert It Into Postfix : ");

		conversion.getPostfix(scanner.nextLine());

	}
}