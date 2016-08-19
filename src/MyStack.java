import java.util.Scanner;
import java.util.Stack;

public class MyStack {

	public static void main(String[] args) {
      Scanner scan1 = new Scanner(System.in);
      Stack<Integer> st = new Stack<Integer>();
      String userInput = "";
      int result =0;
      int a =0;
      int b =0;
      System.out.println("Please enter String value: ");
      userInput = scan1.nextLine();
      for (int i = 0; i < userInput.length(); i++) {
    	Character c = userInput.charAt(i);
    	  if(c.isDigit(c)){
    		  //its a number so add to the stack
    		  int value = c.getNumericValue(c);
    		  st.push(value);
    	  }
    	  else
    	  {
    		  a = st.pop();
			  b = st.pop();
    		  result = calculateTotal(result, a, b, c);
    		  System.out.println("We will push "+result+ " to the stack.");
    		  st.push(result);
    	  }//end of if
    	  
		
      }//end of for loop
      
	}//end of main

	/**
	 * @param result
	 * @param a
	 * @param b
	 * @param c
	 * @return
	 */
	public static int calculateTotal(int result, int a, int b, char c) {
		result = 0;
		switch(c){
		  case '*':
			  result = a*b;
			  break;
		  case '/':
			  result = a/b;
			  break;
		  case '-':
			  result = b-a;
			  break;
		  case '+':
			  result = a+b;
			  break;
		  default:
			  break;
		  }//end of switch
		return result;
	}

}//end of class
