package Assingment1Oct;

import java.util.Scanner;

class Student {
    String name;
    int age;
    String address;

    public Student() {
        this.name = "unknown";
        this.age = 0;
        this.address = "not available";
    }

    public void setInfo(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void setInfo(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public void displayInfo() {
        System.out.println("Name: " + name + ", Age: " + age + ", Address: " + address);
    }
}

public class StudentClass {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Student[] students = new Student[10];

        for (int i = 0; i < students.length; i++) {
            students[i] = new Student();

            System.out.print("Enter name of student " + (i + 1) + ": ");
            String name = scanner.nextLine();
            System.out.print("Enter age of student " + (i + 1) + ": ");
            int age = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            System.out.print("Enter address of student " + (i + 1) + ": ");
            String address = scanner.nextLine();
            students[i].setInfo(name, age, address);
        }

        System.out.println("\nStudent Information:");
        for (Student student : students) {
            student.displayInfo();
        }

        scanner.close();
    }
}
