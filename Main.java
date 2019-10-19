import java.util.Scanner;
public class Main {
   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      
     String calcMode = "";
     
     String startOver = "";
     
     String operationType;
      
     String restartVariable = "Y";
     
      int addAmount;
      int subAmount;
      int timesAmount;
      int divideAmount;
      
      int firstSubNum = 0;
      int firstDivideNum = 0;
      int firstTimesNum = 0;
      int firstAddNum = 0;
      
      int i = 2;
      
      int addNum = 0;
      int subNum = 0;
      int timesNum = 0;
      int divideNum = 0;
     
      String subB = "";
      String divideB = "";
      String multB = "";
      String addB = "";
      
      while (restartVariable.equals("Y") || restartVariable.equals("y")) {
      
      System.out.println("Enter the calculator mode: Standard/Scientific?");
      calcMode = input.next();
    
      ////////STANDARD///START/////////
    
      while ((calcMode.equals("Standard"))) {
          	  
       System.out.println("Enter '+' for addition, '-' for subtractions, '*' for multiplication, '/' for division:");  
       		operationType = input.next();
       		if (operationType.equals("+")) {
       			System.out.println("How many numbers do you want do add?");
       			addAmount = input.nextInt();
       			System.out.println("Enter " + addAmount + " numbers:");
       			for (i = 2; i <= addAmount + 1; ++i) {
       			String addA = "";
       			addNum = input.nextInt();
       			if (i == 1)
       				firstAddNum = addNum;
       			if (i > 1)
       				firstAddNum = firstAddNum + addNum;
       			addA = Integer.toString(addNum);
       			addB += addA;
       			if (i != addAmount)
       				addB += " - ";
       				
       			}System.out.println(addNum);
       		}
       		else if (operationType.equals("-")) {
       			System.out.println("How many numbers do you want do substract?");
       			subAmount = input.nextInt();
       			System.out.println("Enter " + subAmount + " numbers:");
       			  //do {
       				  //firstSubNum = input.nextInt();
       				  //subNum = input.nextInt();
       				  //i++;
       				  //firstSubNum = firstSubNum - subNum;
       				  //if (i <= subAmount + 1) {
       					 // subNum = input.nextInt();
       					  //firstSubNum = firstSubNum - subNum;
       				  //}       				
       			 // }while (i <= subAmount - 1);
       			  for (i = 1; i <= subAmount; ++i) {
       				 String subA = "";
       				 
       				 subNum = input.nextInt();
       				 if (i == 1)
       					 firstSubNum = subNum;
       				 if (i > 1)
       					 firstSubNum = firstSubNum - subNum;
       				 subA = Integer.toString(subNum);
       				 subB += subA;
       				 if ( i != subAmount)
       					 subB += " - ";
       				
       			  } System.out.println(firstSubNum);     			 
       		}  
       		multB = "";
       		if (operationType.equals("*")) {
       			System.out.println("How many numbers do you want do multiply?");
       			timesAmount = input.nextInt();
       			System.out.println("Enter " + timesAmount + " numbers:");
       			for (i = 1; i <= timesAmount; ++i) {
       				String multA = "";
       				timesNum = input.nextInt();
       				if (i == 1)
       					firstTimesNum = timesNum;
       				if (i > 1)
       					firstTimesNum = firstTimesNum * timesNum;
       				multA = Integer.toString(timesNum);
       				multB += multA;
       				if (i != timesAmount)
       					multB += " - ";
       				
       			}System.out.println(firstTimesNum);
       		}
       		
       		
       		else if (operationType.equals("/")) {
       			System.out.println("How many numbers do you want do divide?");
       			divideAmount = input.nextInt();
       			System.out.println("Enter " + divideAmount + " numbers:");       		
       			for (i = 1; i <= divideAmount; ++i) {
      				 String divideA = "";      				 
      				 divideNum = input.nextInt();
      				 if (i == 1)
      					 firstDivideNum = divideNum;
      				 if (i > 1)
      					 firstDivideNum = firstDivideNum / divideNum;
      				 divideA = Integer.toString(divideNum);
      				 divideB += divideA;
      				 if ( i != divideAmount)
      					 divideB += " - ";
      				
      			  }   System.out.println(firstDivideNum);   			 
      		}  
       	} 
     
     
      
      ////////STANDARD///OVER/////////
      
     
      
      
       
     
      double numRadian = 0;
      double result = 0;
      while (calcMode.equals("Scientific")) {
    	  System.out.println("Enter '+' for addition, '-' for subtractions, '*' for multiplication, '/' for division, 'sin' for sin x, 'cos' for cos x, 'tan' for tan x:");
    	  	operationType = input.next();
    	  	
    	  	if (operationType.equals("+")) {
       			System.out.println("How many numbers do you want do add?");
       			addAmount = input.nextInt();
       			System.out.println("Enter " + addAmount + " numbers:");
       			String addA = "";
       			addNum = input.nextInt();
       			if (i == 1)
       				firstAddNum = addNum;
       			if (i > 1)
       				firstAddNum = firstAddNum + addNum;
       			addA = Integer.toString(addNum);
       			addB += addA;
       			if (i != addAmount)
       				addB += " - ";
       				
       			}System.out.println(addNum);
       		
       		if (operationType.equals("-")) {
       			System.out.println("How many numbers do you want do substract?");
       			subAmount = input.nextInt();
       			System.out.println("Enter " + subAmount + " numbers:");
       			  //do {
       				  //firstSubNum = input.nextInt();
       				  //subNum = input.nextInt();
       				  //i++;
       				  //firstSubNum = firstSubNum - subNum;
       				  //if (i <= subAmount + 1) {
       					 // subNum = input.nextInt();
       					  //firstSubNum = firstSubNum - subNum;
       				  //}       				
       			 // }while (i <= subAmount - 1);
       			  for (i = 1; i <= subAmount; ++i) {
       				 String subA = "";
       				 
       				 subNum = input.nextInt();
       				 if (i == 1)
       					 firstSubNum = subNum;
       				 if (i > 1)
       					 firstSubNum = firstSubNum - subNum;
       				 subA = Integer.toString(subNum);
       				 subB += subA;
       				 if ( i != subAmount)
       					 subB += " - ";
       				
       			  } System.out.println(firstSubNum);     			 
       		}  
       		multB = "";
       		if (operationType.equals("*")) {
       			System.out.println("How many numbers do you want do multiply?");
       			timesAmount = input.nextInt();
       			System.out.println("Enter " + timesAmount + " numbers:");
       			for (i = 1; i <= timesAmount; ++i) {
       				String multA = "";
       				timesNum = input.nextInt();
       				if (i == 1)
       					firstTimesNum = timesNum;
       				if (i > 1)
       					firstTimesNum = firstTimesNum * timesNum;
       				multA = Integer.toString(timesNum);
       				multB += multA;
       				if (i != timesAmount)
       					multB += " - ";
       				
       			}System.out.println(firstTimesNum);
       		}
       		
       		
       		else if (operationType.equals("/")) {
       			System.out.println("How many numbers do you want do divide?");
       			divideAmount = input.nextInt();
       			System.out.println("Enter " + divideAmount + " numbers:");       		
       			for (i = 1; i <= divideAmount; ++i) {
      				 String divideA = "";      				 
      				 divideNum = input.nextInt();
      				 if (i == 1)
      					 firstDivideNum = divideNum;
      				 if (i > 1)
      					 firstDivideNum = firstDivideNum / divideNum;
      				 divideA = Integer.toString(divideNum);
      				 divideB += divideA;
      				 if ( i != divideAmount)
      					 divideB += " - ";
      				
      			  }   System.out.println(firstDivideNum);   			 
      		}
    	  	if (operationType.equals("cos")) {
    	  		System.out.println("Enter number in radians to find cos:");
    	  		numRadian = input.nextDouble();   	  			
    	  		result = Math.cos(numRadian);   	  		
    	  			System.out.println("Result: " + result);
    	  	}
    	  	else if (operationType.equals("sin")) {
    	  		System.out.println("Enter number in radians to find sin:");
    	  		numRadian = input.nextDouble();
    	  			result = Math.sin(numRadian);
    	  			System.out.println("Result: " + result);
    	  	}
    	  	else if (operationType.equals("tan")) {
    	  		System.out.println("Enter number in radians to find tan:");
    	  		numRadian = input.nextDouble();
    	  			result = Math.tan(numRadian);
	  			System.out.println("Result: " + result);
    	  	}   	  
      }
      
      
   
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      if (calcMode != ("Standard") || (calcMode != ("Scientific"))) {
	  System.out.println("Invalid operation entered");
	  return;
      		}    
      	}
      }
}

