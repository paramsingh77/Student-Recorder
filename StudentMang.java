public class StudentMang {
    private String firstName;
    
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    private String lastName;

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getLastName() {
        return lastName;
    }

    private String Degree;
    private String major;

    public StudentMang(){
        System.out.println("this sis cimple consturctor");
    }

    public StudentMang(String first , String last , String deg , String major) {
        firstName = first;
        lastName =  last;
        Degree = deg;
        this.major = major; 
    }

    public void showMenu(){
        System.out.println("Main menu");
        System.out.println("1. Add a new Student");
        System.out.println("3. Update student details");
        System.out.println("4. Delete a student");
        System.out.println("5. Exit");
    }

}
