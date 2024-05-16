import java.io.Serializable;
import java.util.*;
import java.util.HashSet;
import java.util.HashMap;


public class Main {
        StudentService service = new StudentService();
        static boolean ordering = true;
        public static void menu() {
            System.out.println("*******************Welcome To Mesh Student Management System********************"
                    + "\n1. Add Student"
                    + "\n2. Display Student"
                    + "\n3. Update Student"
                    + "\n4. Delete Student"
                    + "\n5. Display All Student"
                    + "\n6. Exit ");
        }
        public static void main(String args[]) {
            Scanner sc = new Scanner(System.in);
            StudentService service = new StudentService();
            do {
                menu();
                System.out.println("Enter the Choice:-");
                int choice = sc.nextInt();
                switch (choice) {
                    case 1:
                        System.out.println("Add Student");
                        service.AddStudent();
                        break;
                    case 2:
                        System.out.println("Display Student");
                        service.DisplayStudent();
                        break;
                    case 3:
                        System.out.println("Update Student");
                        service.updateStudent();
                        break;
                    case 4:
                        System.out.println("Delete Student");
                        service.DeleteStudent();
                        break;
                    case 5:
                        System.out.println("Display All Student");
                        service.DisplayAllStudents();
                        break;
                    case 6:
                        System.out.println("Thank you for using application!");
                        System.exit(0);
                    default:
                        System.out.println("Please enter the valid choice");
                }
            } while (ordering);
        }
    }

