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
//id, email, name, subject, message, tooo,message_date
public class Message {
    private int id;
    private String email;
    private String name;
    private String subject;
    private String message;
    private String tooo;
    private String message_date;

    public String getMessage_date() {
        return message_date;
    }

    public void setMessage_date(String message_date) {
        this.message_date = message_date;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getTooo() {
        return tooo;
    }

    public void setTooo(String tooo) {
        this.tooo = tooo;
    }
    
    
}
