package Dz7;

public class HomeWork7 {
    private static String string;

    public static void main(String[] args) {
        typeYear();
        int typeYear = 2022;
        if (typeYear % 4 == 0) {
            if (typeYear % 100 != 0 || typeYear % 400 == 0) ;
            System.out.println(typeYear + " год является високосным!");
        } else {
            System.out.println(typeYear + " год не является високосным!");

        }
        typeYear();


        clientOS();
        int Android = 1;
        int iOS = 0;
        int clientDeviceYear = 2012;

        if (iOS == 0 && clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для iOS по ссылке.");
        } else if (iOS == 0 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке.");
        }
        if (Android == 1 && clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для Android по ссылке.");
        } else if (Android == 1 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке.");
        }

        clientOS();

        abc();
        int deliveryDistance = 95;
        if (deliveryDistance <= 20) {
            System.out.println("Срок доставки один день");
        } else if (deliveryDistance <= 60) {
            System.out.println("Срок доставки два дня ");
        } else if (deliveryDistance <= 100) {
            System.out.println("Срок доставки три дня ");
        }
        abc();

        abcdf();
        string = "aabccddefgghiijjkk.";
        for (int i = 0; i < string.length() - 1; i++) {
            if (string.charAt(i) == string.charAt(i + 1)) {
                System.out.println("обнаружен дубль: " + string.charAt(i) + " !");
                abcdf();
                return;
            }
        }
        System.out.println("Дублей не обнаруженно!");
        abcdf();

    }

    public static void typeYear() {
        System.out.println("+++++++++++++++++++++++++++++");
    }

    public static void clientOS() {
        System.out.println("-----------------------------");
    }

    public static void abc() {
        System.out.println("*****************************");
    }

    public static void abcdf() {
        System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
    }




















}






