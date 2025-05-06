import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {

        Scanner scanner =new Scanner(System.in);
        String str = calc(scanner.nextLine());
        System.out.println(str);

    }

    public static String calc(String input) throws Exception {

        String[] str = input.split(" ");

        String symbol = str[1];
        int a = 0;
        int b = 0;
        try {
            a = Integer.parseInt(str[0]);
            b = Integer.parseInt(str[2]);
            int res = 0;
        } catch (ArrayIndexOutOfBoundsException e) {
            throw new ArrayIndexOutOfBoundsException("throws Exception //т.к. строка не является математической операцией");
        }

        if(a < 0 || a > 10 || b < 0 || b > 10){
            throw new ArrayIndexOutOfBoundsException("throws Exception //т.к. числа должны быть в диапазоне от 0 до 10 включительно");
        }


        switch (symbol){
            case "+": return Integer.toString(a + b);
            case "-": return Integer.toString(a - b);
            case "*": return Integer.toString(a * b);
            case "/": if (b == 0){
                throw new Exception("throws Exception //т.к. на 0 делить нельзя");
            }
                return Integer.toString(a / b);
            default: throw new Exception("throws Exception //т.к. формат математической операции не удовлетворяет заданию - два операнда и один оператор (+, -, /, *)");
        }

    }
}