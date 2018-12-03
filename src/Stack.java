import java.util.ArrayList;

public class Stack {
	
	
	   private ArrayList<Character> stack;
	   private int topPointer;
	   
	   //Constructor
	   public Stack() {
		   this.stack = new ArrayList<>();
		   this.topPointer = -1;
	   }
	   
	   //adds object to stack and increments toppointer by 1
	   public void push(char character) {
	     this.stack.add(character);
	     this.topPointer++;
	   }
	   
	   //removes top object from stack and reduces topPointer by 1
	   public char pop() {
	      if(!this.isEmpty()) {
	    	  
	    	  //top beinhaltet den wert vom stack an der position toppointer
	    	  char top = this.stack.get(this.topPointer);
	    	  //entfernt das oberste element im stack
	    	  this.stack.remove(this.topPointer);
	    	  //reduziert den topPointer um 1
	    	  this.topPointer--;
	    	  
	    	  return top;
	      }else {
	    	  //Casting to char null
	    	  return (Character) null;
	      }
		   
	   }
	   
	   //returns topObject from Stack
	   public char peek() {
		  if(!isEmpty()) {
			  return this.stack.get(this.topPointer);
		  }else {
			  return (Character) null;
		  }
	      
	   }
	   
	   //checks if Stack is empty
	   public boolean isEmpty() {
	      return this.stack.isEmpty();
	   }

}
