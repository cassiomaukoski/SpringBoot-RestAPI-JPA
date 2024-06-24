package br.com.maukoski.cassio.springbootrestapijpa.model;

import jakarta.persistence.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

@Entity
public class Person {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    @Column(name = "birth_date")
    @Temporal(TemporalType.DATE)
    private Date birthDate;
    private int height;


    public Person(){
        this.id = 0;
        this.name = "";
        this.birthDate = new Date();
        this.height = 0;
    }

    public Person(int id, String name, Date birthDate, int height){
        this.id = id;
        this.name = name;
        this.birthDate = birthDate;
        this.height = height;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getBirthDate() {
        return new SimpleDateFormat("yyyy-MM-dd").format(birthDate);
    }

    public int getHeight() {
        return height;
    }

    public void setBirthDate(String birthDate) throws ParseException {
        this.birthDate = new SimpleDateFormat("yyyy-MM-dd").parse(birthDate);
    }

}
