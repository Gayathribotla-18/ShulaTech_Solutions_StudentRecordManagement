import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StudentDAO studentDAO = new StudentDAO();
	while (true) {
            System.out.println("\n📚 Student Record Management System");
            System.out.println("1. Add Student");
            System.out.println("2. View All Students");
            System.out.println("3. Delete Student");
            System.out.println("4. Search Student by ID");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline
			switch (choice) {
                case 1:
                    System.out.print("Enter Name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter Course: ");
                    String course = scanner.nextLine();
                    System.out.print("Enter Email: ");
                    String email = scanner.nextLine();
                    System.out.print("Enter Phone: ");
                    String phone = scanner.nextLine();
                    studentDAO.addStudent(new Student(0, name, course, email, phone));
                    break;

                case 2:
                    List<Student> students = studentDAO.getAllStudents();
                    System.out.println("\nStudent List:");
                    for (Student s : students) {
                        System.out.println(s.getId() + " | " + s.getName() + " | " + s.getCourse() + " | " + s.getEmail() + " | " + s.getPhone());
                    }
                    break;

                case 3:
                    System.out.print("Enter Student ID to delete: ");
                    int idToDelete = scanner.nextInt();
                    studentDAO.deleteStudent(idToDelete);
                    break;

                case 4:
                    System.out.print("Enter Student ID to search: ");
                    int idToSearch = scanner.nextInt();
                    Student student = studentDAO.searchStudentById(idToSearch);
                    if (student != null) {
                        System.out.println("\nStudent Found: " + student.getId() + " | " + student.getName() + " | " + student.getCourse() + " | " + student.getEmail() + " | " + student.getPhone());
                    } else {
                        System.out.println("Student not found.");
                    }
                    break;

                case 5:
                    System.out.println("Exiting");
                    scanner.close();
                    System.exit(0);

                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        }
    }
}
