import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        BasicWorkout[] demoData = getDemoData();
        
        for (BasicWorkout workout : demoData) {
            System.out.println(workout.toString());
        }
        
        int totalEnergy = totalEnergy(demoData);
        System.out.println("Total Energy: " + totalEnergy);
        
        double meanIntensity = meanIntensity(demoData);
        System.out.println("Mean Intensity: " + meanIntensity);
    }
    
    public static BasicWorkout[] getDemoData() {
        return new BasicWorkout[] {
            new BasicWorkout(LocalDate.of(2018, 4, 1), 8200, 7, 1200, "Bike trip to Krems"),
            new BasicWorkout(LocalDate.of(2018, 5, 8), 1200, 5, 500, "Digging a hole"),
            new Running(LocalDate.of(2018, 5, 7), 3600, 12000, "Evening run from work to home")
        }; 
    }

    public static int totalEnergy(BasicWorkout[] data) {
        int totalEnergy = 0;
        
        for (BasicWorkout workout : data) {
            totalEnergy += workout.getEnergy();
        }
        
        return totalEnergy;
    }

    public static double meanIntensity(BasicWorkout[] data) {
        double totalIntensity = 0;
        
        for (BasicWorkout workout : data) {
            totalIntensity += workout.getIntensity();
        }
        
        return totalIntensity / data.length;
    }
}
