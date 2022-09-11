package Dz6;

public class HomeWork6 {
    private static String string;
    private static Object replace;

    public static void main(String[] args) {
        String firstName = "Иван";
        String middleName = "Иванович";
        String lastName = "Иванов";
        String fullName = lastName + " " + firstName + " " + middleName;
        System.out.println("Ф.И.О СОТРУДНИКА-" + fullName);


        string = "Иванов Иван Иванович";
        string = string.replace("Иванов Иван Иванович", "ИВАНОВ ИВАН ИВАНОВИЧ");
        System.out.println("Данные ФИО сотрудника для заполнения отчёта-" + string);


        string = "Иванов Иван Иванович";
        string = string.replace("Иванов Иван Иванович", "Иванов; Иван; Иванович;");
        System.out.println("Данные ФИО сотрудника для административного отдела-" + string);


        string = "Иванов Семён Семёнович";
        string = string.replace("ё", "е");
        System.out.println("Данные ФИО сотрудника-" + string);


    }
}
