/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package studentlist;

/**
 *
 * @author offret
 */
public class Student {
    
    private String stud_Name;

    public Student(String name){
        this.stud_Name = name;
    }
    /**
     * @return the stud_Name
     */
    public String getStud_Name() {
        return stud_Name;
    }

    /**
     * @param stud_Name the stud_Name to set
     */
    public void setStud_Name(String stud_Name) {
        this.stud_Name = stud_Name;
    }

}
