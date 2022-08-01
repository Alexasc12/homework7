public class Main {


    public static void main(String[] args) {
        int[] array = generateRandomArray();
        // задание 1
        int sum = 0;
        for (int i = 0; i < array.length; i++) {

            sum += array[i];
        }
        System.out.printf("Сумма трат за месяц составила %s " ,sum);
        System.out.println();

        // задание 2
        int max = array[0];
        for(int i = 1; i < array.length; i++) {
            if (max < array[i]) {
                max = array[i];
            }
        }System.out.printf("Максимальные  траты за день составила %s " ,max);
        System.out.println();

        int min = array[0];
        for(int i = 1; i < array.length; i++) {
            if (min > array[i]) {
                min = array[i];
            }
        }System.out.printf("Мминимальные  траты за день составила %s " ,min);
        System.out.println();
        // задание 3

        double average = (double) sum/array.length;
        System.out.println("Средние траты за день составили " + average);

        // задание 4
        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};

        for (int i = reverseFullName.length-1; i >=0; i--){

        System.out.print(reverseFullName[i]);}



    }
        public static int[] generateRandomArray () {
            java.util.Random random = new java.util.Random();
            int[] arr = new int[30];
            for (int i = 0; i < arr.length; i++) {
                arr[i] = random.nextInt(100_000) + 100_000;
                System.out.println(arr[i]);


            }

            return arr;
        }
    }
