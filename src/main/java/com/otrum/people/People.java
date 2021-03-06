package com.otrum.people;

public class People {
    
    private final int id;
    private final String name;
    private final int age;

    public Person(int id, String name, int age) {
        this.id=id;
        this.name=name;
        this.age=age;
    }
    public long getId(){
        return id;
    }
    public String getName(){
        return name;
    }
    public String getAge(){
        return age;
    }
}
