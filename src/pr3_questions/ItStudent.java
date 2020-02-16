/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pr3_questions;

/**
 *
 * @author abeeradnan
 */
public class ItStudent extends Student {
   
    
    public ItStudent(int id, String name, String major ,double mid,double project,double finall) {
        super(id, name, major);
        this.grade=  mid*0.30 +project*0.30 + finall*40;
    }

   

    




}
