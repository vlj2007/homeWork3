public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
    }

    public static void task1(){
        System.out.println("Задача 1");
        int peopleInHere = 30;
        byte inPut = 100;
        short  stepCounter = 458;
        long speedLight = 299792458;
        float saltBag = 7.6F;
        double moneyInBudget = 1000000678543.34;

        System.out.println("Значение переменной peopleInHere с типом int равно " + peopleInHere);
        System.out.println("Значение переменной inPut с типом byte равно " + inPut);
        System.out.println("Значение переменной stepCounter с типом short равно " + stepCounter);
        System.out.println("Значение переменной speedLight с типом long равно "+ speedLight);
        System.out.println("Значение переменной saltBag с типом float равно " + saltBag);
        System.out.println("Значение переменной moneyInBudget с типом double равно " + moneyInBudget);

    }

    public static void task2(){
        System.out.println("Задача 2");
        float a = 27.12F;
        long b = 987678965549L;
        float c = 2.786F;
        short d = 569;
        short e = -159;
        short f = 27897;
        byte g = 67;

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
        System.out.println(f);
        System.out.println(g);
    }


    public static void task3(){
        System.out.println("Задача 3");
        int teacherLP = 23;
        int teacherAS = 27;
        int teacherEA = 30;
        int allPaper = 480;
        int pupils = teacherLP + teacherAS + teacherEA;
        int sheetsForEachPupils = allPaper / pupils;
        System.out.println("У Людмилы Павловны — " + teacherLP + " ученика ");
        System.out.println("У Анны Сергеевны — " + teacherAS + " ученика ");
        System.out.println("У Екатерины Андреевны — " + teacherEA + " ученика ");
        System.out.println("На каждого ученика рассчитано " + sheetsForEachPupils + " листов бумаги");

    }

    public static void task4(){
        System.out.println("Задача 4");
        byte machinePerformance = 16;
        byte timeWork = 2;
        int runningTimePerMinute = machinePerformance / timeWork;

        int twentyMinutes = 20;
        int forTwentyMinutes = twentyMinutes * runningTimePerMinute;

        byte minHour = 60;
        byte hour = 24;
        byte day = 1;
        int oneDay = hour * minHour;
        int forDay = oneDay * runningTimePerMinute;

        byte dayThree = 3;
        int hoursThree = hour * dayThree;
        int threeDays = hoursThree * minHour;
        int forThreeDays = threeDays * runningTimePerMinute;

        byte month = 1;
        byte thirtyDays = 30;
        int thirtyPerDays = thirtyDays * hour;
        int oneMonth = thirtyPerDays * minHour;
        int forOneMonth = oneMonth * runningTimePerMinute;

        System.out.println("За " + twentyMinutes + " минут машина произвела " + forTwentyMinutes + " штук бутылок");
        System.out.println("За " + day + " день машина произвела " + forDay + " штук бутылок");
        System.out.println("За " + dayThree + " дня машина произвела " + forThreeDays + " штук бутылок");
        System.out.println("За " + month + " месяц машина произвела " + forOneMonth + " штук бутылок");
    }





}