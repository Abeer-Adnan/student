/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pr3_questions;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 *
 * @author rant
 */
public class PR3_Questions {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException {
        // TODO code application logic here
        Student s1 = new ItStudent( 1, "Abeer", "",  5, 2, 2);
        Student s2 = new ItStudent(2, "Alaa", "",  5, 2, 2);
        Student s3 = new ItStudent(3, "Reema", "",  5, 2, 2);
        Student s4 = new ArtStudent(4, "Sara", "",  5, 22, 2);
        Student s5 = new ArtStudent(5, "Maram", "",  5, 25, 2);
        Student s6 = new ArtStudent(6, "Rawan", "",  5, 29, 2);

        Student s[] = {s1, s2, s3, s4, s5, s6};
        for (Student Student : s) {
            System.out.println(Student);
        }
        /*
        Student temp;
        for (int j = 0; j < s.length; j++) {
            for (int i = 0; i < s.length - 1; i++) {

                if (s[i].getGrade() < s[i + 1].getGrade()) {
                    temp = s[i];
                    s[i] = s[i + 1];
                    s[i + 1] = temp;
                }

            }
        }*/

        System.out.println("The grade storted in descending order ");
        //System.out.println("*************************************");
      Student x[]= Student.sort(s);
        for (int i = 0; i < x.length; i++) {
            System.out.println(x[i]);
         //   System.out.println("grade " + (i + 1) + " : " + s[i].getGrade());

        }
        System.out.println("***********************************");
        
        File file = new File("src/PR3_Questions/student.txt");
        PrintWriter output = new PrintWriter(file);
        for(Student student : s)
            output.println(student);
      
          output.close();
        
        
        
        
    }
    
}
    

