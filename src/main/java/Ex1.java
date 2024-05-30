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
        return 0;
    }

    // 1-8
    public static List<Integer> table9x9() {
        var list = new ArrayList<Integer>();
        // add here
        return list;
    }

    // 1-9
    public static int dayOfWeek (int year, int month, int day) {
        return 0;
    }

    // 1-10
    public static boolean isLeapYear (int year) {
        return false;
    }

    // 1-11
    public static int daysOfMonth (int year, int month) {
        return 31;
    }

    // 1-12
    public static List<Integer> perpetualCalendar (int year, int month) {
        var list = new ArrayList<Integer>();
        // add here
        return list;
    }

    // 1-o1
    public static void histogramOf0to9 () {
        Random rand = new Random();

        rand.nextInt(10); // you can get a random number between 0 to 9
    }

    // 1-o2
    public static void numberToComplete () {
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
    }
}
