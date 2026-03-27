class Student{
    String name;
    int age;
    static String college="MIT";

    static{
        System.out.println("Run First");
    }
    Student(String name,int age)
    {
        this.name=name;
        this.age=age;
    } 

    public static void studentCollege(){
        System.out.println(college);
    }

    public void studentDetails(){
        System.out.println(name+" "+age+" "+college);
    }

}


public class Day3StaticVsNonStatic {
    public static void main(String[] args)
    {
        Student.studentCollege();
       // String name1="Partha";
       // String name2="Sarathy";
        //int age1=21;
        //int age2=23;
        Student s1=new Student("Partha",21);
        Student s2=new Student("Sarathy",23);

        s1.studentDetails();
        s2.studentDetails();
    }
}
