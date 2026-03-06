package Question;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentService {

    ArrayList<Student> list = new ArrayList<>();
    Scanner sc = new Scanner(System.in);

    // CREATE
    public void addStudent() {
        System.out.print("Enter ID: ");
        int id = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Marks: ");
        double marks = sc.nextDouble();

        Student s = new Student(id, name, marks);
        list.add(s);

        System.out.println("Student Added Successfully");
    }

    // READ
    public void displayStudents() {
        if(list.isEmpty()) {
            System.out.println("No Student Records Found");
            return;
        }

        for(Student s : list) {
            s.display();
        }
    }

    // UPDATE
    public void updateStudent() {
        System.out.print("Enter Student ID to Update: ");
        int id = sc.nextInt();

        for(Student s : list) {
            if(s.id == id) {

                System.out.print("Enter New Name: ");
                sc.nextLine();
                s.name = sc.nextLine();

                System.out.print("Enter New Marks: ");
                s.marks = sc.nextDouble();

                System.out.println("Student Updated Successfully");
                return;
            }
        }

        System.out.println("Student Not Found");
    }

    // DELETE
    public void deleteStudent() {
        System.out.print("Enter Student ID to Delete: ");
        int id = sc.nextInt();

        for(Student s : list) {
            if(s.id == id) {
                list.remove(s);
                System.out.println("Student Deleted Successfully");
                return;
            }
        }

        System.out.println("Student Not Found");
    }
}