package com.hibernate.demo;
import javax.persistence.*;
import java.util.Date;

@Entity
public class Author {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    int id;
   // @Column(name="fname")
    String firstname;
    String lastname;
   // @Transient
    int age;


    Date date;

    public Date getdate() {
        return date;
    }

    public void setdate(Date date) {
        this.date = date;
    }


    public int getid() {
        return id;
    }

    public void setid(int id) {
        this.id = id;
    }

    public String getfirstname() {
        return firstname;
    }

    public void setfirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getlastname() {
        return lastname;
    }

    public void setlastname(String lastname) {
        this.lastname = lastname;
    }

    public int getage() {
        return age;
    }

    public void setage(int age) {
        this.age = age;
    }


    @Override
    public String toString() {
        return "Author{" +
                "id=" + id +
                ", firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", age=" + age +
                ", date=" + date +
                '}';
    }
}
