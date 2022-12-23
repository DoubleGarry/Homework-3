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


    }
}