public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
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
        byte teacherLP = 23;
        byte teacherAS = 27;
        byte teacherEA = 30;
        short allPaper = 480;
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

        byte twentyMinutes = 20;
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

    public static void task5(){
        System.out.println("Задача 5");
        byte numberCansOfTwoColors = 120;
        byte whiteCans = 2;
        byte brownCans = 4;
        int oneClass = whiteCans + brownCans;
        int totalClasses = numberCansOfTwoColors / oneClass;
        int allWhiteCans = totalClasses * whiteCans;
        int allBrownCans = totalClasses * brownCans;
        System.out.println("В школе, где " + totalClasses + " классов, нужно " + allWhiteCans + " банок белой краски и " + allBrownCans + " банок коричневой краски.");
    }

    public static void task6(){
        System.out.println("Задача 6");
        byte bananasWidget = 5;
        byte bananasGrams = 80;
        byte milkMilliliters = 105;
        byte milkWidget = 2;
        byte iceCream = 100;
        byte iceCreamBriquette = 2;
        byte rawEggsWidget = 4;
        byte rawEggsGrams = 70;
        int resultBananas = bananasGrams * bananasWidget;
        int resultMilk = milkMilliliters * milkWidget;
        int resultIceCream = iceCream * iceCreamBriquette;
        int resultRawEggs = rawEggsGrams * rawEggsWidget;
        int resultBlender = resultBananas + resultMilk + resultIceCream + resultRawEggs;
        double result = resultBlender * 0.001;
        System.out.println("Результат: " + resultBlender + " грамм - " + result + " кг");

    }

    public static void task7(){
        System.out.println("Задача 7");
        byte overWeightKilo = 7;
        int overWeightGram = overWeightKilo * 1000;
        int loseWeightMinimumGram = 250;
        int loseWeightMaximumGram = 500;
        int minimumDays = overWeightGram / loseWeightMinimumGram;
        int maximumDays = overWeightGram / loseWeightMaximumGram;
        int loseWeightMediumGram = (loseWeightMinimumGram + loseWeightMaximumGram ) / 2;
        int mediumDays = overWeightGram / loseWeightMediumGram;
        System.out.println("На похудение уйдет " + minimumDays + " дней , если спортсмен будет терять каждый день по " + loseWeightMinimumGram + " грамм." );
        System.out.println("На похудение уйдет " + mediumDays + " дней , если спортсмен будет терять каждый день по " + loseWeightMediumGram + " грамм." );
        System.out.println("На похудение уйдет " + maximumDays + " дней , если спортсмен будет терять каждый день по " + loseWeightMaximumGram + " грамм." );

    }
    public static void task8(){
        System.out.println("Задача 8");
        int employeeMashaRublesMonth = 67760;
        int employeeDenisRublesMonth = 83690;
        int employeeChristinaRublesMonth = 76230;
        byte year = 12;

        int beforeIncreaseMashaRublesYear = employeeMashaRublesMonth * year;
        int afterIncreaseMashaRublesYear = ((employeeMashaRublesMonth * 110 /100) * year);
        int differenceMashaRublesYear = afterIncreaseMashaRublesYear - beforeIncreaseMashaRublesYear;

        int beforeIncreaseDenisRublesYear = employeeDenisRublesMonth * year;
        int afterIncreaseDenisRublesYear = ((employeeDenisRublesMonth * 110 /100) * year);
        int differenceDenisRublesYear = afterIncreaseDenisRublesYear - beforeIncreaseDenisRublesYear;

        int beforeIncreaseChristinaRublesYear = employeeChristinaRublesMonth * year;
        int afterIncreaseChristinaRublesYear = ((employeeChristinaRublesMonth * 110 /100) * year);
        int differenceChristinaRublesYear = afterIncreaseChristinaRublesYear - beforeIncreaseChristinaRublesYear;

        System.out.println("Маша теперь получает " + afterIncreaseMashaRublesYear + " рублей. Годовой доход вырос на " + differenceMashaRublesYear + " рублей.");
        System.out.println("Денис теперь получает " + afterIncreaseDenisRublesYear + " рублей. Годовой доход вырос на " + differenceDenisRublesYear + " рублей.");
        System.out.println("Кристина теперь получает " + afterIncreaseChristinaRublesYear + " рублей. Годовой доход вырос на " + differenceChristinaRublesYear + " рублей.");
    }



}