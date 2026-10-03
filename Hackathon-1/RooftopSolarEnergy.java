import java.util.Scanner;
public class RooftopSolarEnergy {
    public static double calculateTotalEnergy(double morningEnergy, double eveningEnergy){
        return morningEnergy + eveningEnergy;
    }
    public static void main(String[] args){
        Scanner ad=new Scanner(System.in);
        int P_id=12344;
        double energyGenerated= 15.0;
        int numberOfPanels= 10;
        char panelType='A';
        System.out.println("ID: " + P_id);
        System.out.println("Energy generated: " + energyGenerated + " kWh");
        System.out.println("The number of panels: " + numberOfPanels);
        System.out.println("Type of panels: " + panelType);
        if(energyGenerated>10){
            System.out.println("Good Energy Generation.");
        } else {
            System.out.println("Low Energy Generation.");
        }
        System.out.println("Enter morning energy:");
        double morningEnergy=ad.nextInt();
        System.out.println("Enter evening energy:");
        double eveningEnergy=ad.nextInt();
        double totalEnergy=calculateTotalEnergy(morningEnergy, eveningEnergy);
        System.out.println("Total energy generated: " + totalEnergy + " kWh");
    }
}
