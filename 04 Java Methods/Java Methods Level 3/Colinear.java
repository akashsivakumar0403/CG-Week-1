import java.util.Scanner;
public class Colinear{
    public boolean isCollinearBySlope(int x1, int y1, int x2, int y2, int x3, int y3) {
        int slopeAB_num = y2 - y1;
        int slopeAB_den = x2 - x1;
        int slopeBC_num = y3 - y2;
        int slopeBC_den = x3 - x2;
        int slopeAC_num = y3 - y1;
        int slopeAC_den = x3 - x1;
        return (slopeAB_num * slopeBC_den == slopeBC_num * slopeAB_den) &&
                (slopeBC_num * slopeAC_den == slopeAC_num * slopeBC_den);
    }
    public boolean isCollinearByArea(int x1, int y1, int x2, int y2, int x3, int y3) {
        double area = 0.5 * (
                x1 * (y2 - y3) +
                        x2 * (y3 - y1) +
                        x3 * (y1 - y2)
        );
        return area == 0;
    }
    public static void main(String[] args){
        Scanner scn=new Scanner(System.in);
        Colinear obj=new Colinear();
        System.out.println("Enter points x1,y1,x2,y2,x3,y3");
        int x1 = scn.nextInt(), y1 = scn.nextInt(),x2 = scn.nextInt(), y2 = scn.nextInt(), x3 = scn.nextInt(), y3 = scn.nextInt();
        boolean slopeCollinear = obj.isCollinearBySlope(x1, y1, x2, y2, x3, y3);
        boolean areaCollinear = obj.isCollinearByArea(x1, y1, x2, y2, x3, y3);
        System.out.println("Collinear by Slope Method: " + slopeCollinear);
        System.out.println("Collinear by Area Method: " + areaCollinear);
        if (slopeCollinear && areaCollinear) {
            System.out.println("The points are collinear.");
        } else {
            System.out.println("The points are not collinear.");
        }
    }
}
