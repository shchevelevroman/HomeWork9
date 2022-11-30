public class Main {
    public static void main(String[] args) {

        //Task#1-2
        System.out.println("Task#1-2");
        int[] numbers;
        numbers = new int[3];
        numbers[0] = -1;
        numbers[1] = 2;
        numbers[2] = 3;
        for (int i = 0; i < numbers.length; i++) {
            if (i == numbers.length - 1) {
                System.out.println(numbers[i]);
            } else {
                System.out.print(numbers[i] + ", ");
            }
        }

        double[] numbers2;
        numbers2 = new double[3];
        numbers2[0] = -1.57;
        numbers2[1] = 7.654;
        numbers2[2] = 9.986;
        for (int i = 0; i < numbers2.length; i++) {
            if (i == numbers2.length - 1) {
                System.out.println(numbers2[i]);
            } else {
                System.out.print(numbers2[i] + ", ");
            }
        }

        int[] numbers3 = {1, 2, 4};
        for (int i = 0; i < 3; i++) {
            if (i == numbers3.length - 1) {
                System.out.println(numbers3[i]);
            } else {
                System.out.print(numbers3[i] + ", ");
            }
        }
        //Task#3
        System.out.println("Task#3");
        int[] number;
        number = new int[3];
        number[0] = -1;
        number[1] = 2;
        number[2] = 3;
        for (int i = number.length - 1; i >= 0; i--) {
            if (i != 0){
                System.out.print(number[i] + ", ");
            } else {
                System.out.println(number[i]);
            }
        }
        double[] number2;
        number2 = new double[3];
        number2[0] = -1.57;
        number2[1] = 7.654;
        number2[2] = 9.986;
        for (int i = number2.length -1; i >= 0; i--) {
            if (i != 0) {
                System.out.print(number2[i] + ", ");
            } else {
                System.out.println(number2[i]);
            }
        }

        int[] number3 = {1, 2, 4};
        for (int i = number3.length - 1; i >= 0; i--) {
            if (i != 0) {
                System.out.print(number3[i] + ", ");
            } else {
                System.out.println(number3[i]);
            }
        }
        //Task#4
        System.out.println("Task#4");
        int[] numbers4;
        numbers4 = new int[3];
        numbers4[0] = -1;
        numbers4[1] = 2;
        numbers4[2] = 3;
        for (int i = 0; i < numbers4.length; i++) {
            if ( numbers4[i] % 2 == 0) {
                if (i == numbers4.length - 1) {
                    System.out.println(numbers4[i]);
                } else {
                    System.out.print(numbers4[i] + ", ");
                }
            }
        }
    }
}