package ex_14072024;

public class Lab074 {
    public static void main(String[] args) {
        String name = "Testing Academy"; // SCP
        String name1 = "Testing Academy"; // SCP

        String name2 = new String("Testing Academy"); // Heap area (OA)

//        System.out.println(name == name1); // Check for the Ref
//        System.out.println(name.equals(name1)); // Check for the Content


        System.out.println(name1 == name2); // Check for the Ref
        System.out.println(name.equals(name1)); // Check for the Content

    }
}
