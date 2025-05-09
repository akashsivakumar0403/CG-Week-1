import java.util.Scanner;

class YoungestTallest{
    public static int findYoungest(int[] ages) {
        int minAge = ages[0];
        for (int i = 1; i < ages.length; i++) {
            if (ages[i] < minAge) {
                minAge = ages[i];
            }
        }
        return minAge;
    }
    public static int findTallest(int[] heights) {
        int maxHeight = heights[0];
        for (int i = 1; i < heights.length; i++) {
            if (heights[i] > maxHeight) {
                maxHeight = heights[i];
            }
        }
        return maxHeight;
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int[] ages = new int[3];
        int[] heights = new int[3];
        System.out.println("Enter ages and heights");
        for (int i = 0; i < 3; i++) {
            ages[i] = scn.nextInt();
            heights[i] = scn.nextInt();
        }
        int youngest = findYoungest(ages),tallest = findTallest(heights);
        System.out.println("Youngest age: " + youngest);
        System.out.println("Tallest height: " + tallest);
        scn.close();
    }
}
