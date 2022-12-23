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


    }
}