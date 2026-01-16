package CoreProgramming.JavaStrings.level1;

public class NullPointerDemo {

    static void generate() {
        String text = null;
        text.length();
    }

    static void handle() {

        String text = null;

        try {
            text.length();
        } catch (NullPointerException e) {
            System.out.println("NullPointerException handled");
        }
    }

    public static void main(String[] args) {

        try {
            generate();
        } catch (Exception e) {
        }

        handle();
    }
}