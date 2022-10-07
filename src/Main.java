public class Main {
    public static void main(String[] args) {

        // hw1
        // task1
        int total=0;
        int part=15_000;
        int month=0;
        while (total<=2_459_000) {
            month++;
            total = (total + part);
            total = total + total / 100;
            System.out.println("Месяц " + month + ", сумма накоплений равна " + total + " рублей");
        }


        //task2

        int i=0;
        while (i<10) {
            i++;
            System.out.print(i+" ");
        }
        System.out.println();


        for (;i>=1;i--) {
            System.out.print(i+" ");
        }

        //task3

        int birthYear=17;  //рождаемость 17 человек на 1000
        int mortalityYear=7;  //смертность 7 человек на 1000
        int countryAllPeople=12_000_000;
        for (int k=0;k<=10;k++) {
            countryAllPeople=countryAllPeople+(countryAllPeople*birthYear/1000)-(countryAllPeople*mortalityYear/1000);
            System.out.println("Год " + k + ", численность населения составляет " + countryAllPeople);
        }

//hw2
        //task1

        double contribution=15_000;
        double percent=0.07;
        i=0;
        while (contribution<12_000_000) {
            i++;
            contribution=contribution*(1+percent);
            System.out.printf("\nМесяц %d, численность накоплений составляет %.2f",i,contribution);
        }

        //task2
        contribution=15_000;
        percent=0.07;
        i=0;
        while (contribution<12_000_000) {
            i++;
            contribution = contribution * (1 + percent);
            if (i % 6 == 0) {
                System.out.printf("\nМесяц %d, численность накоплений составляет %.2f", i, contribution);
            }
        } System.out.printf("\nМесяц %d, численность накоплений составляет %.2f", i, contribution);

        //task3

        contribution=15_000;
        percent=0.07;
        int year=9;
        month=0;
        for (month=1;month<(year*12);month++) {
            contribution = contribution * (1 + percent);
            if (month % 6 == 0) {
                System.out.printf("\nМесяц %d, численность накоплений составляет %.2f", month, contribution);
            }
        } System.out.printf("\nМесяц %d, численность накоплений составляет %.2f", month, contribution);

        //task4

        int friday=4;
        for (int day=1;day<=31;day++) {
            if (day==friday) {
                System.out.printf("\nСегодня пятница, %d-е число. Необходимо подготовить отчет.",day);
                friday=friday+7;
            }
        }

        //hw3
        //task1

        System.out.println();
        year=2022;
        int periodStart=year-200;
        int periodAfter=year+100;

        for (year=periodStart;year<=periodAfter;year++) {
            if (year%79==0) {
                System.out.println(year);
            }
        }

        //task2


        int result=2;
        for (int k=1;k<=10;k++) {
            result=2*k;
            System.out.printf("\n2*%d=%d",k,result);
        }
    }
}