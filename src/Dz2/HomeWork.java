package Dz2;

public class HomeWork {
    public static void main(String[] args) {

        byte b = 1;
        System.out.println(b);
        short s = 2;
        System.out.println(s);
        int i = 3;
        System.out.println(i);
        long l = 4;
        System.out.println(l);
        float f = 5.5f;
        System.out.println(f);
        double d = 45.5;
        System.out.println(d);
        char c = 33;
        System.out.println(c);

        int age = 22;
        boolean isAdult = age>=18;
        System.out.println(isAdult);

        float boxer1 = 78.2f;
        float boxer2 = 82.7f;

        float massBoxer1 = boxer1+boxer2;
        System.out.println("Вес двух боксёров равен" + massBoxer1 +"кг");

        float massBoxer2 = boxer1-boxer2; // ХЗ
        System.out.println("Разница между двумя боксёрами" + massBoxer2 +"кг");



        //Бананы – 5 штук (1 банан - 80 грамм);
        //– Молоко – 200 мл (100 мл = 105 грамм);
        //– Мороженое пломбир – 2 брикета по 100 грамм;
        //– Яйца сырые – 4 яйца (1 яйцо - 70 грамм).


        int bananas = 5;
        bananas = bananas * 80;
        System.out.println("Вес бананов "+bananas+"грамм");
        int ice =2;
        ice = ice * 100;
        System.out.println("Вес брикетов  "+ice+"грамм");
        int eggs =4;
        eggs = eggs * 70;
        System.out.println("Вес яиц "+eggs+"грамм");
        int milk =200;
        milk = milk * 105;
        System.out.println("Вес молоко "+milk+"грамм");

        int breakfast = bananas+eggs+milk+ice;
        System.out.println("Вес завтрака "+breakfast+"граммах");

        breakfast = breakfast/1000;
        System.out.println("Вес завтрака"+breakfast+"кг");


        int sport=7;
        System.out.println("Надо сбросить"+sport+"кг");
        sport= sport *1000;
        System.out.println("Перевели в "+sport+"гр");
        int a1 = 250;
        System.out.println("Можно сбросить"+a1+"гр");
        int a2 =500;
        System.out.println("Можно сбросить"+a2+"гр");

        int abc = sport /a1;
        System.out.println(""+abc+" дней необходимо для похудения это если будем сбрасывать по 250 грамм");
        int abcd = sport /a2;
        System.out.println(""+abcd+" дней необходимо для похудения это если будем сбрасывать по 500 грамм");

        int ab = abc+abcd;
        System.out.println(""+ab+" общее количество дней");

        int  middle1 = a1+a2;
        System.out.println(""+middle1+" общее количество грамм которые можно сбросить");

        int middle2 = sport/middle1;
        System.out.println(""+middle2+" среднее количество дней");

        //Маша получает 67 760 рублей в месяц
        //Денис получает 83 690 рублей в месяц
        //Кристина получает 76 230 рублей в месяц

        int Masha= 67760;
        System.out.println(""+Masha+" руб Зарплата которую получает Маша");
        int Denis= 83690;
        System.out.println(""+Denis+" руб Зарплата которую получает Денис ");
        int Kristina= 76230;
        System.out.println(""+Kristina+" руб Зарплата которую получает Кристина");
        int x = 10;
        System.out.println(""+x+"% повышение каждый год после трёх лет работы");

        int m = Masha*x/100;
        System.out.println(""+m+"руб повысился годовой доход Маши");
        int M =Masha+m;
        System.out.println(""+M+"руб общий  доход Маши");

        int den = Denis*x/100;
        System.out.println(""+den+"руб повысился годовой доход Дениса");
        int D =Denis+den;
        System.out.println(""+D+"руб общий  доход Дениса");

        int k = Kristina*x/100;
        System.out.println(""+k+"руб повысился годовой доход Кристины");
        int K =Kristina+k;
        System.out.println(""+K+"руб общий  доход Кристины");

    }
}
