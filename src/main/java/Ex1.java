import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Ex1 {

    // 1-1
    public static String compareTo10 (int value) {
        if(value < 10){
            return "less than 10";
        }else if(value >=10){
            return "over or equal to 10";
        }else{
            return "error!";
        }
       
    }

    // 1-2
    public static List<Integer> assign1toN (int N) {
        var list = new ArrayList<Integer>();
        for(int i=0;i<N;i++){
            list.add(i+1);
        }
        return list;
    }

    // 1-3
    public static List<Integer> assign1toNofEven (int N) {
        var list = new ArrayList<Integer>();
        for(int i=2;i<=N;i+=2){
            list.add(i);
        }
        return list;
    }

    // 1-4
    public static String num2str (int n) {
        switch (n) {
            case 0:
                return "zero";
            case 1:
                return "one";
            case 2:
                return "two";
            case 3:
                return "three";
            case 4:
                return "four";
            case 5:
                return "five";
            case 6:
                return "six";
            case 7:
                return "seven";
            case 8:
                return "eight";
            case 9:
                return "nine";
            case 10:
                return "ten";
            default:
                return "error"; 
        }
    }

    // 1-5
    public static int str2num (String str) {
        switch (str) {
            case "zero":
                return 0;
            case "one":
                return 1;
            case "two":
                return 2;
            case "three":
                return 3;
            case "four":
                return 4;
            case "five":
                return 5;
            case  "six":
                return 6;
            case "seven":
                return 7;
            case "eight":
                return 8;
            case "nine":
                return 9;
            case "ten":
                return 10;
            default:
                return -1; 
            }
    }

    // 1-6
    public static int total (List<Integer> list) {
        int sum = 0;
        for(int i:list){
            sum += i;
        }
        return sum;
    }

    // 1-7
    public static double average (List<Integer> list) {
        int ave = 0;
        for(int i:list){
            ave += i;
        }
        return (double)ave/list.size();
    }

    // 1-8
    public static List<Integer> table9x9() {
        var list = new ArrayList<Integer>();
        for(int i=1;i<=9;i++){
            for(int j=1;j<=9;j++){
                list.add(i*j);
            }
        }
        return list;
    }

    // 1-9
    public static int dayOfWeek (int year, int month, int day) {
        if(month<3){
            month +=12;
            year -=1;
        }
        return (year+year/4-year/100+year/400+(13*month+8)/5+day)%7;
    }

    // 1-10
    public static boolean isLeapYear (int year) {
        if (year % 4 == 0) {
            if (year % 100 == 0) {
              if (year % 400 == 0) return true;
                else return false;
            } else return true;
          } else return false;

    }

    // 1-11
    public static int daysOfMonth (int year, int month) {
        if(month == 4 || month == 6 || month == 9 || month == 11) return 30;
        else if(month == 2 && isLeapYear(year))return 29;
        else if(month == 2)return 28;
        else return 31;
    }

    // 1-12
    public static List<Integer> perpetualCalendar (int year, int month) {
        var list = new ArrayList<Integer>();
        int days = daysOfMonth(year,month),day = 1,week =0;
        while (days>0){
            for(week = 0;week<7;week++){
                if(dayOfWeek(year,month,day) == week){
                    list.add(day);
                    day++;
                    days--;
                } 
                else list.add(0);
            }   
        }
        return list;
    }

    // 1-o1
    public static void histogramOf0to9 () {
        Random rand = new Random();
        int[] p = new int[10];
        int n =0,i;
        for(i=0;i<100;i++){
        n = rand.nextInt(10); // you can get a random number between 0 to 9
        p[n]++;
        }
        for(i=0;i<p.length;i++){
            System.out.format("%d:%d\n",i,p[i]);
        }
    }    

    // 1-o2
    public static void numberToComplete () {
        Random rand = new Random();
        int n =0,i=0,ave=0;
        for(i=0;i<100;i++){
            int[] p = new int[10];
            while((p[0]*p[1]*p[2]*p[3]*p[4]*p[5]*p[6]*p[7]*p[8]*p[9])==0){
                n = rand.nextInt(10); // you can get a random number between 0 to 9
                p[n]++;
                ave++;
            }
        }
        System.out.format("average:%d\n",ave/100);
    }

    public static void main (String[] args) {
        // 1-1
        System.out.println("Ex1-1 ============");
        System.out.println(compareTo10(11));
        System.out.println(compareTo10(10));
        System.out.println(compareTo10(9));

        // 1-2
        System.out.println("\nEx1-2 ============");
        int N = 10;
        System.out.println(assign1toN(N));
        System.out.println();

        // 1-3
        System.out.println("\nEx1-3 ============");
        System.out.println(assign1toNofEven(N));
        System.out.println();

        // 1-4
        System.out.println("\nEx1-4 ============");
        for (int i=0 ; i<=10 ; i++) {
            System.out.println(num2str(i));
        }

        // 1-5
        System.out.println("\nEx1-5 ============");
        System.out.println(str2num("zero"));
        System.out.println(str2num("one"));
        System.out.println(str2num("two"));
        System.out.println(str2num("three"));
        System.out.println(str2num("four"));
        System.out.println(str2num("five"));
        System.out.println(str2num("six"));
        System.out.println(str2num("seven"));
        System.out.println(str2num("eight"));
        System.out.println(str2num("nine"));
        System.out.println(str2num("ten"));

        // 1-6
        System.out.println("\nEx1-6 ============");
        System.out.println(total(List.of(1,2)));
        System.out.println(total(List.of(1,2,3,4,5)));
        System.out.println(total(List.of(1,2,3,4,5,6,7,8,9,10)));

        // 1-7
        System.out.println("\nEx1-7 ============");
        System.out.println(average(List.of(1,2)));
        System.out.println(average(List.of(1,2,3,4,5)));
        System.out.println(average(List.of(1,2,3,4,5,6,7,8,9,10)));

        // 1-8
        System.out.println("\nEx1-8 ============");
        {
            var l = table9x9();
            for (int i=0 ; i<81 ; i++) {
                System.out.format("%2d ", l.get(i));
                if ((i+1) % 9 == 0) {
                    System.out.println();
                }
            }
        }

        // 1-9
        System.out.println("\nEx1-9 ============");
        System.out.println(dayOfWeek(2021, 4, 25));

        // 1-10
        System.out.println("\nEx1-10 ============");
        System.out.println(isLeapYear(2000));
        System.out.println(isLeapYear(2004));
        System.out.println(isLeapYear(1900));

        // 1-11
        System.out.println("\nEx1-11 ============");
        System.out.println(daysOfMonth(2021, 4));
        System.out.println(daysOfMonth(2021, 5));
        System.out.println(daysOfMonth(2021, 2));
        System.out.println(daysOfMonth(2020, 2));

        // 1-12
        System.out.println("\nEx1-12 ============");
        {
            var l = perpetualCalendar(2020, 2);
            System.out.println("Su Mo Tu We Th Fr Sa");
            for (int i=0 ; i<l.size() ; i++) {
                if (l.get(i) == 0) {
                    System.out.format("   ");
                }else{
                    System.out.format("%2d ", l.get(i));
                }
                if ((i+1) % 7 == 0) {
                    System.out.println();
                }
            }
        }
        // 1-o1
        System.out.println("\nEx1-o1 ============");
        histogramOf0to9();
        // 1-o2
        System.out.println("\nEx1-o2 ============");
        numberToComplete();
    }
}
