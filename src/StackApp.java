import java.util.Scanner;

public class StackApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Please fill in a Line with Brackets");
		
		String userInput = sc.nextLine();
		
		if(checkSemantic(userInput)) {
			System.out.println("Bracket Semantic is CORRECT");
		}else {
			System.out.println("Bracket Semantic is INCORRECT");
		}
		
		 
	 }
		
	public static boolean checkSemantic(String userInput) {
		
		if (userInput.isEmpty()) {
		        return true;
		}

	    Stack stack = new Stack();
	    for (int i = 0; i < userInput.length(); i++)
	    {
	    	char current = userInput.charAt(i);
	        //checks if first brackets are Openbrackets
	    	if (current == '{' || current == '(' || current == '[')
	        {
	            stack.push(current);
	        }


	        if (current == '}' || current == ')' || current == ']')
	        {
	        	//If string is empty returns false
	            if (stack.isEmpty()) {
	            	return false;
	            }
	                
	            //gets peek for if statement	
	            char last = stack.peek();
	            if (current == '}' && last == '{' || current == ')' && last == '(' || current == ']' && last == '[') {
	                stack.pop();
	            } 
	            else { 
	                return false;
	            } 
	        }

	    }

		return stack.isEmpty();
		
	}

}
