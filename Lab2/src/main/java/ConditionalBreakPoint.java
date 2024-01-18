/**
 * Strings in Java by definition are immutable
 * String are inherently array of characters, but unlike array you can manipulate one character of string in place.
 * 
 * 
 * 1.) Add a breakpoint and take the screenshot of that line (must be highlighted in green)
 * 2.) debug layout: open any object details
 * 3.) Add Conditional breakpoint -- ss of conditional breakpoint pop up window and ss of the screen once you run it
 * 4.) Add Exception Breakpoint - you can add any exception here
 * 5.) Grab the ss of the breakpoint once you run the exception breakpoint code
 * 
 * 7 points for the above tasks and 3 points for Lab Report
 */
public class ConditionalBreakPoint  {
	
	public void breakOnConditionOnly(){
        String[] data1 = {"mz", "my", "my", "mx", "mz", "mx", "my", "mz", "mz", "my", "my", "mx", "mz", "mx", "my", "mz"};

        for(int i=0;i<data1.length;i++){
            String s = "Super : "+data1[i];
            System.out.println(s);
        }
    }
    
    public static void main(String[] args) {
    	ConditionalBreakPoint test = new ConditionalBreakPoint();
    	test.breakOnConditionOnly();
    }
    
}
