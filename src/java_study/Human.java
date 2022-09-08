package java_study;

import java.util.Scanner;

public class Human {
    private String name;
    private int age;
    private String sex;


    public Human() {
    }

    public Human(String name) {
        this.name = name;
    }

    public Human(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Human(String name, int age, String sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getSex() {
        return sex;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }


    public static void main(String[] args) {
        Human 호준 = new Human("염호준",27,"남자");
        Human 영진 = new Human("이영진");
        Human 경하 = new Human("김경하", 27);

        System.out.println(호준.getName());
        System.out.println(호준.getAge());
        System.out.println(호준.getSex());
    }
}
