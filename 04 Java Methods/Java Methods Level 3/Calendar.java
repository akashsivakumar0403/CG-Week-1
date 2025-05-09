import java.util.Scanner;

class Calendar{
    public String getMonth(int number){
        String[] months={"January","February","March","April","May","June","July","August","September","October","November","December"};
        return months[number-1];
    }
    public int getDays(int month,boolean leap){
        int[] days={31,0,31,30,31,30,31,31,30,31,30,31};
        if(leap){
            days[1]=29;
        }else{
            days[1]=28;
        }
        return days[month-1];
    }
    public boolean isLeap(int year){
        if((year>=1852)&&((year%4==0 && year%100!=0) || (year%4==0 && (year%100==0 && year%400==0)))){
            return true;
        }else{
            return false;
        }
    }
    public int getFirstDay(int m,int y){
        int d=1;
        int y0 = y - (14 - m) / 12;
        int x = y0 + y0 / 4 - y0 / 100 + y0 / 400;
        int m0 = m + 12 * ((14 - m) / 12) - 2;
        int d0 = (d + x + (31 * m0) / 12) % 7;
        /*String[] days = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
        System.out.println("Day of the week: " + days[d0]);*/
        return d0;
    }
    public void printCalendar(int month,int year,int days,int firstDay){
        int day = 1;
        int count = 0;
        System.out.println("Sun Mon Tue Wed Thu Fri Sat");
        for (int i = 0; i < firstDay; i++) {
            System.out.print("    ");
            count++;
        }
        while (day <= days) {
            System.out.printf("%3d ", day);
            count++;
            day++;
            if (count % 7 == 0) {
                System.out.println();
            }
        }
        if (count % 7 != 0) {
            System.out.println();
        }
    }
    public static void main(String[] args){
        Scanner scn=new Scanner(System.in);
        System.out.println("Enter month and year");
        int month=scn.nextInt(),year=scn.nextInt();
        Calendar obj=new Calendar();
        int days = obj.getDays(month,obj.isLeap(year));
        int firstDay=obj.getFirstDay(month,year);
        System.out.println(obj.getMonth(month)+" "+year);
        obj.printCalendar(month,year,days,firstDay);
    }
}