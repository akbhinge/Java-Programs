package exceptionHandling;

public class exception1 {


    public static void main(String[] args){


        try{
            for(int i=5; i>=0; i--){
                System.out.println(10/i);
            }
        }
        catch(Exception e){
            System.out.println("Exception message: "+ e.getMessage());
            e.printStackTrace();
        }
    }
}


/*

 @Override
    public int compareTo(Student object) {
        int result = 1;
        if ((this.getFirstName().compareToIgnoreCase(object.getFirstName()) < 0) || (this.getLastName().compareTo(object.getLastName()) < 0)   || (this.getAge() == object.getAge())) {
            result = -1;
        } else if ((this.getFirstName().compareToIgnoreCase(object.getFirstName()) == 0) && (this.getLastName().compareTo(object.getLastName()) == 0) && (this.getAge() == object.getAge())) {
            result = 0;
        }
        return result;
    }



 */
