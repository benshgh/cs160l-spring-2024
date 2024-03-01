package edu.sdsu.cs160l.university.lab7.exceptions.badpractices;

public class TryCatchFinally {
  private static final int[] DATA = new int[]{1,2,3};
  public static int get(int index){
    try{
      return DATA[index];
    }catch (Exception e){
      return 0;
    }finally {
      return 1;
    }
  }

  public static void main(String[] args) {
    System.out.println(get(0));
    System.out.println(get(1));
    System.out.println(get(3));
  }
}
