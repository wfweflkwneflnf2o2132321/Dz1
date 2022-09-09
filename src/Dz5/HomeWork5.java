package Dz5;

public class HomeWork5 {
    static int[] arr = generateRandomArray();

    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }

    public static void main(String[] args) {
        int sum = 0;
        for (int element : arr) {
            sum += element;
        }
        System.out.println("Сумма трат за месяц составила " + sum + " рублей.");



        int min = 100_000;
        int max = 200_000;

        for (int i : arr) {
            if (i > min) {
                min = i;
            }
            if (i < max) {
                max = i;
            }

        }
        System.out.println("Минимальная сумма трат за день составила" + max + "рублей.");
        System.out.println("Максимальная сумма трат за день составила" + min + "рублей.");


        int days = 30;
        float abc = sum / days;
        System.out.println("Средняя сумма трат за месяц составила" + abc + " рублей");




        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int a = 0; a < reverseFullName.length / 2; a++) {
            char t = reverseFullName[a];
            reverseFullName[a] = reverseFullName[reverseFullName.length - 1 - a];
            reverseFullName[reverseFullName.length - 1 - a] = t;

        }
        for (char result : reverseFullName) {
            System.out.printf(String.valueOf(result));
        }
    }
}












