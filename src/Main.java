public class Main {
    public static void main(String[] args) {

        System.out.println("Задача 1");
        byte mouse = 100;
        System.out.println("Значение переменной mouse с типом byte равно " + mouse);
        short dog = 10000;
        System.out.println("Значение переменной dog с типом short равно " + dog);
        int bull = 1000000000;
        System.out.println("Значение переменной bull с типом int равно " + bull);
        long elephant = 1000000000000000000L;
        System.out.println("Значение переменной elephant с типом long равно " + elephant);
        float dolphin = 0.000001f;
        System.out.println("Значение переменной dolphin с типом float равно " + dolphin);
        double whale = 0.0000000000000001;
        System.out.println("Значение переменной whale с типом double равно " + whale);


        System.out.println("Задача 2");
        float alfa = 27.12f;
        System.out.println("Значение переменной alfa равно " + alfa + " - тип переменной float");
        long bravo = 987678965549L;
        System.out.println("Значение переменной bravo равно " + bravo + " - тип переменной long");
        float charlie = 2.786f;
        System.out.println("Значение переменной charlie равно " + charlie + " - тип переменной float");
        short delta = 569;
        System.out.println("Значение переменной delta равно " + delta + " - тип переменной short");
        short echo = -159;
        System.out.println("Значение переменной echo равно " + echo + " - тип переменной short");
        short foxtrot = 27897;
        System.out.println("Значение переменной foxtrot равно " + foxtrot + " - тип переменной short");
        byte kilo = 67;
        System.out.println("Значение переменной kilo равно " + kilo + " - тип переменной byte");


        System.out.println("Задача 3");
        byte studentsLP = 23;
        byte studentsAS = 27;
        byte studentsEA = 30;
        short classesPaper = 480;
        System.out.println("На каждого ученика рассчитано " + classesPaper / (studentsEA+studentsAS+studentsLP) + " листов бумаги");

        System.out.println("Задача 4");
        byte oneMinuteProductivity = 16 / 2;
        short twentyMinutesProductivity = (short) (oneMinuteProductivity * 20);
        System.out.println("Производительность машины за 20 минут — " + twentyMinutesProductivity + " бутылок");
        short oneDayProductivity = (short) (oneMinuteProductivity * 60 * 24);
        System.out.println("Производительность машины в сутки — " + oneDayProductivity + " бутылок");
        int threeDayProductivity = oneDayProductivity * 3;
        System.out.println("Производительность машины за 3 дня — " + threeDayProductivity + " бутылок");
        int oneMonthProductivity = oneDayProductivity * 30;
        System.out.println("Производительность машины за месяц — " + oneMonthProductivity + " бутылок");

        System.out.println("Задача 5");
        byte allClasses = 120 / (2+4);
        byte whitePaint = (byte) (allClasses * 2);
        byte brownPaint = (byte) (allClasses * 4);
        System.out.println("В школе, где " + allClasses + " классов, нужно " + whitePaint + " банок белой краски и " + brownPaint + " банок коричневой краски");

        System.out.println("Задача 6");
        short bananasWeight = 5 * 80;
        short milkWeight = 2 * 105;
        short iceCreamWeight = 2 *100;
        short eggsWeight = 4 * 70;
        System.out.println("Вес спортзавтрака " + (bananasWeight + milkWeight + iceCreamWeight + eggsWeight) + " грамм");
        float productWeightKg =((bananasWeight + milkWeight + iceCreamWeight + eggsWeight) / 1000f);
        System.out.println("Вес спортзавтрака " + productWeightKg + " кг.");

        System.out.println("Задача 7");
        short lightWeightLoss =(short) (7*1000) / 250;
        System.out.println("Достижение результата за " + lightWeightLoss + " дней");
        short hardWeightLoss =(short) (7*1000) / 500;
        System.out.println("Достижение результата за " + hardWeightLoss + " дней");

        System.out.println("Задача 8");
        int salaryM = 67760;
        float indexingSalaryM = (float) (salaryM * 1.1);
        System.out.println("Маша теперь получает " + indexingSalaryM + " рублей.");
        int annualSalaryM = salaryM * 12;
        int indexingAnnualSalaryM = (int) (indexingSalaryM * 12);
        System.out.println("Годовой доход вырос на " + (indexingAnnualSalaryM - annualSalaryM) + " рублей");
        int salaryD = 83690;
        float indexingSalaryD = (float) (salaryD * 1.1);
        System.out.println("Денис теперь получает " + indexingSalaryD + " рублей.");
        int annualSalaryD = salaryD * 12;
        int indexingAnnualSalaryD = (int) (indexingSalaryD * 12);
        System.out.println("Годовой доход вырос на " + (indexingAnnualSalaryD - annualSalaryD) + " рублей");
        int salaryK = 76230;
        float indexingSalaryK = (float) (salaryK * 1.1);
        System.out.println("Кристина теперь получает " + indexingSalaryK + " рублей.");
        int annualSalaryK = salaryK * 12;
        int indexingAnnualSalaryK = (int) (indexingSalaryK * 12);
        System.out.println("Годовой доход вырос на " + (indexingAnnualSalaryK - annualSalaryK) + " рублей");










    }
}