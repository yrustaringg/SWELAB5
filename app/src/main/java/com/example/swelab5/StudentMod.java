package com.example.swelab5;

public class StudentMod {

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "StudentMod{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    private int id ;
    private String name ;
    private int age ;

    public StudentMod(int id, String s, int i) {
        this.id = id;
    }

    public String getName() {
        return null;
    }

    public String getAge() {
        return null;
    }
}
