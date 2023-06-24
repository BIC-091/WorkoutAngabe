import java.time.LocalDate;

public class BasicWorkout{

    LocalDate date;
    protected int duration;
    protected int energy;
    protected int intensity;
    protected String description;

    public BasicWorkout(BasicWorkout bw){
    }
    public BasicWorkout(LocalDate date, int duration){
        this.date = date;
        this.duration = duration;    
    }

    public BasicWorkout(LocalDate date, int duration, int intensity){
        this.date = date;
        this.duration = duration;
        this.intensity = intensity;
    }
    public BasicWorkout(LocalDate date, int duration, int intensity, int energy){
        this.date = date;
        this.duration = duration;
        this.energy = energy;
        this.intensity = intensity;
    }
    public BasicWorkout(LocalDate date, int duration, int intensity, int energy, String description) {
        this.date = date;
        this.duration = duration;
        this.energy = energy;
        this.intensity = intensity;
        this.description = (description == null) ? null : String.format("%.100s", description);
    }

    public String getDescription(){
        return description;
    }
    public int getEnergy(){
        return energy;
    }
    public int getIntensity(){
        return intensity;

    }
    public final String getIntensityString(){
        return String.valueOf(intensity);
    }

    @Override
    public String toString() {
        return String.format("%s: %s \"%s\" %.1fh, %dkcal ",
            date, getIntensityString(), getDescription(), duration/3600., getEnergy());
        }
}