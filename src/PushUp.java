import java.time.LocalDate;

public class PushUp extends BasicWorkout{
    private int	repetitions;

    public PushUp(LocalDate date, int repetitions) {
        super(date, 0);
        this.repetitions = repetitions;
    }

    @Override
    public int getEnergy() {
        return 5 * repetitions;
    }
    @Override
    public int getIntensity() {
        return repetitions > 10 ? 10 : repetitions;
    }
}

