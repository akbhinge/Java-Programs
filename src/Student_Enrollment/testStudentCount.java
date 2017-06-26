package Student_Enrollment;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class testStudentCount {

    // test case to check Student object for first and last name
    // other than alphabets and age as negative input
    @Test
    public void test1(){

        Student s = new Student();

        String checkFirstName = "Akshay1234";
        s.setFirstName(checkFirstName);
        assertEquals("Akshay",s.getFirstName());

        String checkLastName = "       Jacobson&****#$";
        s.setLastName(checkLastName);
        assertEquals("Jacobson",s.getLastName());

        int ageCheck = -2;
        s.setAge(ageCheck);
        assertEquals(-2,ageCheck);
    }

    // test case to check if input provided to the Student
    // object matches the requirements
    @Test
    public void test2(){

        Student s = new Student();

        String checkFirstName = "James";
        s.setFirstName(checkFirstName);
        assertEquals("James",s.getFirstName());

        String checkLastName = "Anderson";
        s.setLastName(checkLastName);
        assertEquals("Anderson",s.getLastName());

        int ageCheck = 30;
        s.setAge(ageCheck);
        assertEquals(30,ageCheck);
    }

    // test case to check if matching students in courses
    @Test
    public void test3(){

        Student[] stud1 = new Student[3];

        stud1[0] = new Student("Amy","James",21);
        stud1[1] = new Student("Rahul","Anderson",11);
        stud1[2] = new Student("Luis","Hamilton",30);

        Student[] stud2 = new Student[2];

        stud2[0] = new Student("Amy","James",21);
        stud2[1] = new Student("Raj","Jacob",35);

        CourseDetails c1 = new CourseDetails();

        int count = c1.getCount(stud1,stud2);
        assertEquals(1,count);
    }

    // test case to check if both courses have all common students
    @Test
    public void test4(){

        Student[] stud1 = new Student[3];

        stud1[0] = new Student("Amy","James",21);
        stud1[1] = new Student("Harry","Barnes",18);
        stud1[2] = new Student("Luis","Hamilton",24);

        Student[] stud2 = new Student[3];

        stud2[0] = new Student("Amy","James",21);
        stud2[1] = new Student("Luis","Hamilton",24);
        stud2[2] = new Student("Harry","Barnes",18);

        CourseDetails c1 = new CourseDetails();

        int count = c1.getCount(stud1,stud2);
        assertEquals(3,count);
    }

    // test case to check if no matching students in two courses
    @Test
    public void test5(){

        Student[] stud1 = new Student[1];

        stud1[0] = new Student("Harry","Smith",20);

        Student[] stud2 = new Student[2];

        stud2[0] = new Student("Amy","James",21);
        stud2[1] = new Student("Raj","Jacob",35);

        CourseDetails c1 = new CourseDetails();

        int count = c1.getCount(stud1,stud2);
        assertEquals(0,count);
    }

    // test case to check if one input course array is null
    @Test
    public void test6(){

        Student[] stud2 = new Student[2];

        stud2[0] = new Student("James","Bond",1);
        stud2[1] = new Student("Robert","Kohl",21);

        CourseDetails c1 = new CourseDetails();

        int count = c1.getCount(null,stud2);
        assertEquals(0,count);
    }
}