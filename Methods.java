import java.util.Scanner;

public class Methods extends StudentMang {

    Scanner scanner = new Scanner(System.in);
    public Methods(){}
    
    public Methods(String first , String last  ,String deg , String maj){
        super(first , last , deg , maj);
        System.out.println("info updated");
    }
    public void updateFirstName(String name){
        String []arr = name.split(" ");
        setFirstName(arr[0]);
        setLastName(arr[1]);
    }

    public void showDetails(){
        System.out.println("First Name: " + getFirstName() + " Last Name :" + getLastName());
    }
    
    public int selectOption(){
         int option;
            showMenu();
            System.out.println("Enter the option you want to select");
            option = scanner.nextInt();
            return option;
    }

    public void addStudent(){
       
        System.out.print("Enter the Student's First Name: ");
        String first = scanner.next();
        System.out.print("Enter the Student's Last Name: " );
        String last = scanner.next();
      
        System.out.println("Enter the Student's  Degree: ");
        String degree = scanner.next();
        
        System.out.println("Enter the Student's Major: " );
        String maj = scanner.next();
        StudentMang newStudent = new Methods(first , last , degree , maj);
        System.out.println("Student Added");
    }
    public void deleteStudent(){}
}
