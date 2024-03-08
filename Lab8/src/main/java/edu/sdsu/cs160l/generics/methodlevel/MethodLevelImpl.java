package edu.sdsu.cs160l.generics.methodlevel;

public class MethodLevelImpl implements MethodLevel{
    @Override
    public <T> void print(T t) {
        System.out.println(t);
    }
}
