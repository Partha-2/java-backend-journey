public class Day3String {
    public static void main(String[]args){
        // String - immutable
String s = "Hello";
s = s + " Java";  // creates new object
System.out.println(s);

// StringBuffer - mutable + thread safe
StringBuffer sb = new StringBuffer("Hello");
sb.append(" Java");
sb.insert(0, "Say: ");
sb.reverse();
System.out.println(sb);

// StringBuilder - mutable + fast
StringBuilder sbl = new StringBuilder("Hello");
sbl.append(" Java");
sbl.delete(0, 5);
System.out.println(sbl);



StringBuilder s2=new StringBuilder("Hello world");
s2.reverse();
System.out.println(s2);

    }
}
