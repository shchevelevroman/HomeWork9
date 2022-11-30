public class Main {
    public static void main(String[] args) {

        //Task#9
        System.out.println("Task#9");
        int[] numbers;
        numbers = new int[3];
        numbers[0] = -1;
        numbers[1] = 2;
        numbers[2] = 3;
        for (int i = 0; i < numbers.length; i++) {
            if (i == numbers.length - 1) {
                System.out.println(numbers[i]);
            }
                else {
                System.out.print(numbers[i] + ", ");
            }
    }

        double [] numbers2;
        numbers2 = new double[3];
        numbers2  [0] = -1.57;
        numbers2  [1] = 7.654;
        numbers2  [2] = 9.986;
        for (int i = 0; i < numbers2.length; i++) {
            if (i == numbers2.length - 1) {
                System.out.println(numbers2[i]);
            } else {
                System.out.print(numbers2[i] + ", ");
            }
        }

        int [] numbers3 = {1,2,4};
        for (int i = 0; i < 3; i++) {
            if (i == numbers3.length - 1){
                System.out.println(numbers3[i]);
            } else {
                System.out.print(numbers3[i] + ", ");
            }
        }
    }
}