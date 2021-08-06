import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("\033[0;96m" + "введите число" + "\u001b[0m");
        int i = in.nextInt();
        System.out.println("\033[0;96m" +"введите знак" + "\u001b[0m");
        String s = in.next();
        System.out.println("\033[0;96m" +"введите число" + "\u001b[0m");
        int j = in.nextInt();
        int rsl = 0;
        switch (s){
            case("+"):
                rsl = i + j;
                System.out.println("\033[0;95m" + "Ответ: " + rsl + "\u001b[0m");
                break;
            case("-"):
                rsl = i - j;
                System.out.println("\033[0;95m" + "Ответ: " + rsl + "\u001b[0m");
                break;
            case("*"):
                rsl = i * j;
                System.out.println("\033[0;95m" + "Ответ: " + rsl + "\u001b[0m");
                break;
            case("/"):
                rsl = i / j;
                System.out.println("\033[0;95m" + "Ответ: " + rsl + "\u001b[0m");
                break;
            default:
                System.out.println("\033[0;91m" +"Неправильный ввод" + "\u001b[0m");
                break;

        }

    }
}
