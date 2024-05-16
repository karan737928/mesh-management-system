import java.util.HashMap;
import java.util.HashSet;
import java.util.*;
import java.util.HashMap;

public class StudentService {
    HashSet<Student> studset = new HashSet<Student>();
    // constructor ko pass karne ke liye apko student.java ke under ek class
   // banana padega jisme id,name,age,department,month,fees
    // ki data type decleared karna hoga aur ek toString name ka function
   // declear karna hoga jisme sare data types ko concarent
    // karna hoga:
    Student stud1 = new Student(101 ,"sarvesh kumar",21,"CSE","one month",2450);
            Student stud2 = new Student(102,"karan sharma",22,"CSE","one month",2450);
            Student stud3 = new Student(103,"arun shingh",24,"CSE","one month",2450);
            Student stud4 = new Student(104,"gaurag bhardwaj",23,"CE","one month",2450);
            Scanner sc = new Scanner(System.in);
    boolean found = false;
    int id;
    String name;
    int age;
    String department;
    String months;
    double fees;
    public StudentService() {
        studset.add(stud1);
        studset.add(stud2);
        studset.add(stud3);
        studset.add(stud4);
    }
    // Display all student
    public void DisplayAllStudents() {
        for (Student s : studset) {
            System.out.println(s);
        }
    }
    // Display students based on there id
    public void DisplayStudent(){
        System.out.println("Enter id: ");
        id=sc.nextInt();
        for(Student stud:studset){
            if(stud.getId()==id){
                System.out.println(stud);
                found = true;
            }
        }
        if(!found){
            System.out.println("Student with this id is not present");
        }
    }
    // update Students
    public void updateStudent(){
        System.out.println("Enter id: ");
        id=sc.nextInt();
        boolean found = false;
        for(Student stud:studset){
            if(stud.getId()==id){
                System.out.println("Enter name: ");
                name = sc.next();
                stud.setName(name);
                System.out.println("Enter new fees: ");
                fees = sc.nextDouble();
                System.out.println("Enter age: ");
                age = sc.nextInt();
                stud.setFees(fees);
                stud.setAge(age);
                System.out.println("Updated Details of Students are: ");
                System.out.println(stud);
                found = true;
            }
            if(!found){
                System.out.println("Student is not present: ");
                return;
            } else {
                System.out.println("Student details update is successfully !!:");
            }
        }
    }
    // Delete student
    public void DeleteStudent(){
        System.out.println("Enter id: ");
        id = sc.nextInt();
        boolean found = false;
        Student stud_delete = null;
        for(Student stud:studset){
            if(stud.getId()==id){
                stud_delete=stud;
                found = true;
            }
        }
        if(!found){
            System.out.println("Student is not present:");
        } else {
            studset.remove(stud_delete);
            System.out.println("Student deleted successfully !!");
        }
    }
    // Add students
    public void AddStudent(){
        System.out.println("Enter id: ");
        id = sc.nextInt();
        System.out.println("Enter name: ");
        name = sc.next();
        System.out.println("Enter age: ");
        age = sc.nextInt();
        System.out.println("Enter department: ");
        department = sc.next();
        System.out.println("Enter Howmany months: ");
        months = sc.next();
        System.out.println("Enter fees: ");
        fees = sc.nextDouble();
        Student stud = new Student(id, name, age, department, months,
                fees);
        studset.add(stud);
        System.out.println(stud);
        System.out.println("Student added successfully !!");
    }
}
