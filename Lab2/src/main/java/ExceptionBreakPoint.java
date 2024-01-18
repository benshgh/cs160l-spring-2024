public class ExceptionBreakPoint  {
    
	public void breakOnException(){
        String[] a = {"mz" , "mx", "mz","my","my"};
        System.out.println(a[1]);
        System.out.println(a[6]);
    }
	
    public static void main(String[] args) {
    	ExceptionBreakPoint test = new ExceptionBreakPoint();
        test.breakOnException();
    }

}
