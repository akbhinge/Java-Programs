package Student_Enrollment;

import java.util.InputMismatchException;
import java.util.Scanner;

// Student class containing Student information

public class Student {

    private String firstName;
    private String lastName;
    private int age;

    Student(){
        firstName = "";
        lastName = "";
        age = 0;
    }

    Student(String fname, String lname, int age){
        this.firstName = fname;
        this.lastName = lname;
        this.age = age;
    }

    public String getFirstName() {
        return firstName;
    }

    // to make sure first name consists of only alphabets
    public void setFirstName(String firstName) {
        this.firstName = firstName.replaceAll("[^a-zA-Z]","");
    }

    public String getLastName() {
        return lastName;
    }

    // to make sure first name consists of only alphabets
    public void setLastName(String lastName) {
        this.lastName = lastName.replaceAll("[^a-zA-Z]","");
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age <= 0){
            System.out.println("Age cannot be negative, check your input!");
        }else {
            this.age = age;
        }
    }

    // check if two student objects have similar properties
    public boolean isEqual(Student studObj){

        boolean status = false;
        if(this.getFirstName().equalsIgnoreCase(studObj.getFirstName())
                && this.getLastName().equalsIgnoreCase(studObj.getLastName())
                && this.getAge() == studObj.getAge()){
            status = true;
        }
        return status;
    }
}

    // Class to get course details and calculate common students enrolled in both courses
class CourseDetails {

    // get number of students enrolled in both the courses, course1 and course2

    int getCount(Student[] course1, Student[] course2){

        if(course1 == null || course2 == null){
            return 0;
        }

        //get count of students in both courses
        int count=0;

        // get smallest course size
        int smallestCourse;

        if(course1.length > course2.length){
            smallestCourse = course2.length;
        }
        else
            smallestCourse = course1.length;

        for (Student student1 : course1) {
            for (Student student2 : course2) {
                if (student1.isEqual(student2)){
                    count++;
                }
            }
        }

        // output cannot be greater than smallest course size
        if(count > smallestCourse){
            return -1;
        }
        return count;
    }

    public static void main(String[] args){

        CourseDetails c1 = new CourseDetails();

        Scanner input  = new Scanner(System.in);

        try {

            System.out.println("Enter number of students for 1st course: ");

            // get size of course 1
            int size1 = input.nextInt();

            Student[] course1 = new Student[size1];

            System.out.println("Provide Student details: ");

            for (int i = 0; i < size1; i++) {

                Student s = new Student();

                int studentNum = i + 1;
                System.out.println("Student: " + studentNum);

                System.out.println("Enter first name of student (only alphabets): ");
                s.setFirstName(input.next());

                System.out.println("Enter last name of student (only alphabets): ");
                s.setLastName(input.next());

                System.out.println("Enter age of the student: ");
                int age = input.nextInt();
                if (age > 0) {
                    s.setAge(age);
                } else {
                    s.setAge(age);
                    s.setAge(input.nextInt());
                }

                boolean flag=false;
                // check if student object already exists in the course1 array
                for(int j=0;j<i;j++){
                     if(s.isEqual(course1[j])){
                        flag=true;
                    }
                }
                if(!flag){
                    course1[i] = s;
                }
                else{
                    i=i-1;
                    System.out.println("Student already enrolled in course!");
                }
                System.out.println();
            }

            System.out.println("Student details for Course 1: ");

            for(int i=0; i< size1; i++){
                System.out.println("First Name: " + course1[i].getFirstName());
                System.out.println("Last Name: " + course1[i].getLastName());
                System.out.println("Age: " + course1[i].getAge());
                System.out.println();
            }

            System.out.println("Enter number of students for 2nd course: ");

            // get size of course 2
            int size2 = input.nextInt();

            Student[] course2 = new Student[size2];

            System.out.println("Provide student details: ");

            for(int i=0; i < size2; i++){

                Student s = new Student();

                int studentNum = i+1;
                System.out.println("Student: " + studentNum );

                System.out.println("Enter first name of student (only alphabets): ");
                s.setFirstName(input.next());

                System.out.println("Enter last name of student (only alphabets): ");
                s.setLastName(input.next());

                System.out.println("Enter age of the student: ");
                int age = input.nextInt();
                if (age > 0) {
                    s.setAge(age);
                } else {
                    s.setAge(age);
                    s.setAge(input.nextInt());
                }

                // check if student object already exists in the course1 array
                boolean flag=false;
                for(int j=0;j<i;j++){
                    if(s.isEqual(course2[j])){
                        flag=true;
                    }
                }
                if(!flag){
                    course2[i] = s;
                }
                else{
                    i=i-1;
                    System.out.println("Student already enrolled in course!");
                }
                System.out.println();
            }

            System.out.println("Student details for Course 2: ");

            for(int i=0; i< size2; i++){
                System.out.println("First Name: " + course2[i].getFirstName());
                System.out.println("Last Name: " + course2[i].getLastName());
                System.out.println("Age: " + course2[i].getAge());
                System.out.println();
            }

            // call the getCount method to get students enrolled in both the courses
            System.out.println("Students enrolled in both courses: " + c1.getCount(course1, course2));

        }
        catch (InputMismatchException inputException){
            System.out.println("Please check your input");
        }
    }
}