import java.util.Scanner;

public class TemperatureAverage {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of days: ");
        int numDays = scanner.nextInt();
        double[] temperatures = new double[numDays];
        double totalTemperature = 0;

        for (int i = 0; i < numDays; i++) {
            System.out.print("Enter temperature for day " + (i + 1) + ": ");
            temperatures[i] = scanner.nextDouble();
            totalTemperature += temperatures[i];
        }

        double averageTemperature = totalTemperature / numDays;
        System.out.println("\nAverage temperature: " + averageTemperature);

        int aboveAverageCount = 0;
        for (double temp : temperatures) {
            if (temp > averageTemperature) {
                aboveAverageCount++;
            }
        }

        System.out.println("Number of days with temperature above average: " + aboveAverageCount);

        scanner.close();
    }
}