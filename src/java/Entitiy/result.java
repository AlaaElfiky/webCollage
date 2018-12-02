/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Entitiy;

/**
 *
 * @author m7md
 */
//id, student_id, material_name, applied, final, year
public class result {
    private String material_name ;
    private int material_applied;
    private int material_final;
    private int material_total;
    private int id_student;
    private int id;
    private int year;

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getId() {
        return id;
    }
    public int getMaterial_total() {
        return material_final+material_applied;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId_student() {
        return id_student;
    }

    public void setId_student(int id_student) {
        this.id_student = id_student;
    }

    public String getMaterial_name() {
        return material_name;
    }

    public void setMaterial_name(String material_name) {
        this.material_name = material_name;
    }

    public int getMaterial_applied() {
        return material_applied;
    }

    public void setMaterial_applied(int material_applied) {
        this.material_applied = material_applied;
    }

    public int getMaterial_final() {
        return material_final;
    }

    public void setMaterial_final(int material_final) {
        this.material_final = material_final;
    }

  

    public void setMaterial_total(int material_total) {
        this.material_total = material_total;
    }
    
    
    
}
