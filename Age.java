import java.util.Scanner;

public class Age {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int age = scanner.nextInt();
        String word = "";

        if (age >= 0 && age <= 2) {
            word = "baby";
        } else if (age > 2 && age <= 13){
            word = "child";
        } else if (age > 13 && age <= 19) {
            word = "teenager";
        } else if (age > 19 && age <= 65){
            word = "adult";
        } else if (age > 65){
            word = "elder";
        }
        System.out.println(word);
    }
}
