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
public class Material {
//    name_material, year, specialization, doctor_id, source_material
    private String name_material;
    private int year;
    private String specialization;
    private int doctor_id;
    private String source_material;

    public String getName_material() {
        return name_material;
    }

    public void setName_material(String name_material) {
        this.name_material = name_material;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    public int getDoctor_id() {
        return doctor_id;
    }

    public void setDoctor_id(int doctor_id) {
        this.doctor_id = doctor_id;
    }

    public String getSource_material() {
        return source_material;
    }

    public void setSource_material(String source_material) {
        this.source_material = source_material;
    }
    
    
    
    
}
