package ex_20072024;

public class Lab098 {
    public static void main(String[] args) {
        int itemcode=004;
        switch (itemcode){
            case 001,002,003-> System.out.println("It is Electronic Gadget");
            case 004,005,006-> System.out.println("It is Mecanical Gadget");
            default -> System.out.println("None");
        }
    }
}
