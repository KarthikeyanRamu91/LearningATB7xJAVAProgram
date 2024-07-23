package ex_21072024;

public class Lab110 {
    public static void main(String[] args) {
        for (int i=0; i<=10;i++){
            System.out.println(i);
            if (i==5){
                continue;// after will not print once it reaches i=5
            }
            System.out.println("After");
        }
    }
}
