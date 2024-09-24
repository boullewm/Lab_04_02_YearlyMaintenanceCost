public class Main {
    public static void main(String[] args)
    {
        int springCost = 3000;
        int summerCost = 5000;
        int fallCost = 2000;
        int winterCost = 7000;
        int yearlyCost;
        System.out.println("The maintenance cost in Spring was " + springCost);
        System.out.println("The maintenance cost in Summer was " + summerCost);
        System.out.println("The maintenance cost in Fall was " + fallCost);
        System.out.println("The maintenance cost in Winter was " + winterCost);
        yearlyCost = springCost + summerCost + fallCost + winterCost;
        System.out.println("The yearly maintenance cost is " + yearlyCost);
    }
}