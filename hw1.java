public class Homework {

public static void main(String[] args) {
    System.out.println(isSumBetween10And20(5, 15)); // true
    System.out.println(isSumBetween10And20(7, 15)); // false

    System.out.println(isPositive(5)); // true
    System.out.println(isPositive(-3)); // false

    printString("abcd", 5); // abcdabcdabcdabcdabcd

    int[][] array = new int[4][4]; // [[1, 0, 0, 0], [0, 1, 0, 0], [0, 0, 1, x], [0, 0, 0, 1]]
    int x = array[2][3]; 

// 1. Написать метод, принимающий на вход два целых числа и проверяющий,
    // * что их сумма лежит в пределах от 10 до 20 (включительно), если да – вернуть
    // true, в противном случае – false.
    private static boolean isSumBetween10And20(int a, int b) {
        int sum = a + b;
        System.out.println(sum);
        if (sum >= 10 && sum <= 20) {
            return true;
        } else
            return false;
    }

    // 2. проверить, что x положительное
    private static boolean isPositive(int x) {
        if (x >= 0) {
            return true;
        } else
            return false;

    }

    // // 3. напечатать строку source repeat раз
    private static void printString(String source, int repeat) {
        for (int i = 0; i < repeat; i++) {
            System.out.println(source);
        }

    }

    // 4. // проверить, является ли год високосным. если да - return true
    private static boolean isLeapYear(int year) {
        if ((year % 4) == 0) {
            return true;
        }
        return false;
    }

    // 5. // должен вернуть массив длины len, каждое значение которого равно
    // initialValue
    private static int[] createArray(int len, int initalValue) {
        int[] arr = new int[len];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = initalValue;

        }
        return arr;
    }


    
    
