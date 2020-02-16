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
 * @author abeeradnan
 */
public class PR3_Questions {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException {
        // TODO code application logic here
        Student s1 = new ItStudent(1, "Abeer", "cs", 88 , 30, 50);
        Student s2 = new ItStudent(2, "Alaa", "cs",  77, 20, 40);
        Student s3 = new ItStudent(3, "Reema", "cs",  55, 10, 49);
        Student s4 = new ArtStudent(4, "Sara", "art",  71, 22, 30);
        Student s5 = new ArtStudent(5, "Maram", "art",  60, 25, 50);
        Student s6 = new ArtStudent(6, "Rawan", "art",  10, 29, 20);
        System.out.println("The grade before storted ");
        Student s[] = {s1, s2, s3, s4, s5, s6};
        for (Student Student : s) {
            System.out.println(Student);
        }
        System.out.println("*************************************");
        System.out.println("The grade storted in descending order ");
       Student x[]= Student.sort(s);
        for (int i = 0; i < x.length; i++) {
            System.out.println(x[i]);

        }
        System.out.println("***********************************");
        
        File file = new File("src/PR3_Questions/student.txt");
        PrintWriter output = new PrintWriter(file);
        for(Student student : s)
            output.println(student);
      
          output.close();
        
        
        
        
    }
    
}
    

