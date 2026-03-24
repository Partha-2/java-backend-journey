class Student{
    public String studentDetails(String sName,int age1,String job1)
    {
        System.out.println(sName);
        System.out.println(age1);
        System.out.println(job1);

        return "Thank you!!";
    }
}

public class Oops{
    public static void main(String[] args){

        String studentName="Partha Sarathy";
        int age=23;
        String job="java Deveoper";

        Student s1=new Student();

        String result=s1.studentDetails(studentName,age,job);

        System.out.println(result);

    }
}