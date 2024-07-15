package ex_14072024;

public class Lab058 {
    public static void main(String[] args) {
        int course=100;
        float gst=18.5f;
        //int total_price = course+GST; // Implicti Narrowing - JVM

        int total=course+(int)gst;// Explit narrowing - REAL time - money loss
        System.out.println(total);
    }
}
