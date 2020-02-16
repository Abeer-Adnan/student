/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pr3_questions;

/**
 *
 * @author rant
 */
public abstract class Student{
  protected int id;
  protected String name;
  protected String major;
  protected double grade;

    public Student(int id, String name, String major) {
        this.id = id;
        this.name = name;
        this.major = major;
       
    }
  
  
    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getMajor() {
        return major;
    }

    public double getGrade() {
        return grade;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }
    
    public static Student[] sort(Student []s){ 
          Student temp;
        for (int j = 0; j < s.length; j++) {
            for (int i = 0; i < s.length - 1; i++) {

                if (s[i].getGrade() < s[i + 1].getGrade()) {
                    temp = s[i];
                    s[i] = s[i + 1];
                    s[i + 1] = temp;
                }

            }
        }
        return s;
    }
    @Override
    public String toString() {
        return "Student{" + "id=" + id + ", name=" + name + ", major=" + major + ", grade=" + grade + '}';
    }

   
    
  
  
  
  
  
}
