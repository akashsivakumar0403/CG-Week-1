import java.util.Scanner;
class TravelComputation { 
   public static void main(String[] args) {
	  Scanner scn=new Scanner(System.in);
      String name = scn.nextLine();
      String fromCity = scn.nextLine(), viaCity = scn.nextLine(), toCity = scn.nextLine();
      double distanceFromToVia = scn.nextDouble();
      int timeFromToVia = 60 * (scn.nextInt());
      double distanceViaToFinalCity = scn.nextDouble();
      int timeViaToFinalCity = 60 * (scn.nextInt());
      double totalDistance = distanceFromToVia + distanceViaToFinalCity;
      int totalTime = timeFromToVia + timeViaToFinalCity;
      System.out.println("The Total Distance travelled by " + name + " from " + 
                         fromCity + " to " + toCity + " via " + viaCity +
                         " is " + totalDistance + " km and " +
                         "the Total Time taken is " + totalTime + " minutes");
   }
}
