import java.time.LocalDate;

public class Running extends BasicWorkout {
    private int distance;

    public Running(LocalDate date, int duration, int distance, String description){
        super(date, 0);
        this.duration = duration;
        this.distance = distance;
        this.description = (description == null) ? null : String.format("%.100s", description);
    }
    public int getDuration(){
        return duration;
    }

    @Override
    public int getEnergy(){
        return getIntensity() * 100 * (getDuration() / 3600);
    }   
    @Override
    public int getIntensity() {
        double pace = (double) duration / ((double) distance / 1000); // Convert distance to kilometers

        if (pace < 3 * 60) {
            return 10;
        } else if (pace < 4 * 60) {
            return 9;
        } else if (pace < 5 * 60) {
            return 8;
        } else if (pace < 6 * 60) {
            return 7;
        } else if (pace < 7 * 60) {
            return 6;
        } else if (pace < 8 * 60) {
            return 5;
        } else if (pace < 9 * 60) {
            return 4;
        } else if (pace < 10 * 60) {
            return 3;
        } else if (pace < 11 * 60) {
            return 2;
        } else {
            return 1;
        }
    }

    @Override
    public String toString() {
        return super.toString() + " Distance: " + distance / 1000 + "km";
    }
}