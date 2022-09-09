package Dz3;

public class HomeWork3 {
    public static void main(String[] args) {

        int clientOS = 0;

        if (clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке.");
        }
        if (clientOS  == 1) {
            System.out.println("Установите версию приложения для Android по ссылке.");
        }

        int clientDeviceYear = 2015;
        if (clientDeviceYear > 2014) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке.");
            System.out.println("Установите облегченную версию приложения для iOS по ссылке.");
        } else {
            System.out.println("Установите версию приложения для iOS по ссылке.");
            System.out.println("Установите версию приложения для Android по ссылке.");
        }


        int year = 2021;
        boolean YEAR = ((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0));

        if (YEAR) {
            System.out.println("Высокосный.");
        } else {
            System.out.println("Обычный");
        }
        if (year % 4 == 0 && year % 100 != 0) {
            if (year % 400 == 0) ;
            System.out.println(year + " год является високостным!");
        } else {
            if (year % 4 != 0 && year % 100 == 0)
                if (year % 400 != 0) ;
            System.out.println(year + " год не является високостным!");
        }


        int deliveryDistance = 95;
        if (deliveryDistance <= 20) {
            System.out.println("Срок доставки один день");
        } else if (deliveryDistance <= 60) {
            System.out.println("Срок доставки два дня ");
        } else if (deliveryDistance <= 100) {
            System.out.println("Срок доставки три дня ");
        }


        int monthNumber = 12;
        switch (monthNumber) {
            case 1:
                System.out.println("Зимний сезон");
                break;
            case 2:
                System.out.println("Зимний сезон");
                break;
            case 3:
                System.out.println("Весенний сезон");
                break;
            case 4:
                System.out.println("Весенний сезон");
                break;
            case 5:
                System.out.println("Весенний сезон");
                break;
            case 6:
                System.out.println("Летний сезон");
                break;
            case 7:
                System.out.println("Летний сезон");
                break;
            case 8:
                System.out.println("Летний сезон");
                break;
            case 9:
                System.out.println("Осенний сезон");
                break;
            case 10:
                System.out.println("Осенний сезон");
                break;
            case 11:
                System.out.println("Осенний сезон");
                break;
            case 12:
                System.out.println("Зимний сезон");
                break;
            default:
                System.out.println("Такого месяца нет");
        }
    }
}
