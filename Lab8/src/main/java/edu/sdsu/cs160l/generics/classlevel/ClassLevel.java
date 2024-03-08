package edu.sdsu.cs160l.generics.classlevel;

public interface ClassLevel<T,R,U> {
     R process(T t);
     U processAgain(T t);
}
