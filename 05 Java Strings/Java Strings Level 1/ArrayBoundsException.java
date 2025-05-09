import java.util.Scanner;

public class ArrayBoundsException {
    public static void generateException(String[] names) {
        System.out.println(names[names.length+1]);
    }
    public static void handleException(String[] names) {
        try {
            System.out.println(names[names.length+1]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Caught ArrayIndexOutOfBoundsException\n" + e.getMessage());
        } catch (RuntimeException e) {
            System.out.println("Caught a RuntimeException\n"+ e.getMessage());
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] names = {"akash","rishi","shivain"};
        //generateException(names);
        handleException(names);

    }
}
