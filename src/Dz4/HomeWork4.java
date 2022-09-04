package Dz4;

public class HomeWork4 {
    public static void main(String[] args) {

        int i = 0;
        while (i < 10) {
            i++;
            System.out.print(i + " ");
        }

        System.out.println();
        for (int a = 10; a > 0; a = a - 1) {
            System.out.print(a + " ");
        }
        System.out.println();


        for (int f = 5; f <= 31; f = f + 7) {
            System.out.println("Сегодня пятница," + f + "-е число. Необходимо подготовить отчет.");
        }


        int year = 2021;
        int past = year - 200;
        int future = year + 100;
        int abc = 0;
        while (true) {
            abc = abc + 79;
            if (abc < past) {
                continue;
            }
            if (abc > future) {
                break;
            }
            System.out.println(abc + "год летят кометы.");
        }


















    }
}
