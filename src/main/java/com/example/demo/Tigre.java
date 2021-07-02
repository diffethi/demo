package com.example.demo;

public class Tigre {
    private String name;
    private String sex;
    private int age;
    private int weight;


    public Tigre(String name, String sex, int age, int weight) {
        super();
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.weight = weight;
    }

    public String getName() {
        return name;

    }
    public void setName(String name) {
        this.name = name;
    }
    public String getSex() {
        return sex;
    }
    public void setSex(String sex) {
        this.sex = sex;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public int getWeight() {
        return weight;
    }
    public void setWeight(int weight) {
        this.weight = weight;
    }
    @Override
    public String toString() {
        return "Tigre [name=" + name + ", sex=" + sex + ", age=" + age + ", weight=" + weight + "]";
    }


}
