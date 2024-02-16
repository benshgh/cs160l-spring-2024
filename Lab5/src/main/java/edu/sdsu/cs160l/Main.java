package edu.sdsu.cs160l;

import edu.sdsu.cs160l.university.course.CS340;
import edu.sdsu.cs160l.university.registrar.Registrar;
import edu.sdsu.cs160l.university.student.Student;
import edu.sdsu.cs160l.university.student.StudentLevel;
import edu.sdsu.cs160l.university.student.StudentMajor;
import edu.sdsu.cs160l.university.student.TransferStudent;

/**
 * Your code has 2 Todos locate them and fix/implement them :) worth 7 points
 *
 * Remember design principle 1.
 *
 * Program to and interface and not an Implementation
 */
public class Main {
    public static void main(String[] args) {
        //These are just sample code

        //Dont
        TransferStudent nonCompliant = new TransferStudent(1L,"Transfer", 2.9, StudentLevel.FRESHMAN, StudentMajor.math);
        //do
        Student compliant = new TransferStudent(1L,"Transfer", 2.9, StudentLevel.FRESHMAN, StudentMajor.math);

        //with the complaint student you can
        Registrar registrar = new Registrar();

        registrar.enrollStudentToClass(compliant, new CS340());

    }
}
