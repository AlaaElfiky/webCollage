/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Entitiy;

import java.sql.Date;

/**
 *
 * @author m7md
 */
public class Weekly {

    public int getWeek_number() {
        return week_number;
    }

    public void setWeek_number(int week_number) {
        this.week_number = week_number;
    }

    public int getMonth_number() {
        return month_number;
    }

    public void setMonth_number(int month_number) {
        this.month_number = month_number;
    }
    //id, name_material, task_lecture, task_sec, task_project, week_number, month_number
  private int id;
  private String name_material;
  private String task_lecture;
  private String task_sec;
  private String task_project;
  private int week_number ;
  private int  month_number;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName_material() {
        return name_material;
    }

    public void setName_material(String name_material) {
        this.name_material = name_material;
    }

    public String getTask_lecture() {
        return task_lecture;
    }

    public void setTask_lecture(String task_lecture) {
        this.task_lecture = task_lecture;
    }

    public String getTask_sec() {
        return task_sec;
    }

    public void setTask_sec(String task_sec) {
        this.task_sec = task_sec;
    }

    public String getTask_project() {
        return task_project;
    }

    public void setTask_project(String task_project) {
        this.task_project = task_project;
    }

  
    
}
