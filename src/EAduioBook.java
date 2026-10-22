public class EAduioBook extends NetTitle implements IAduioBook{
    private int durationInMinutes;

    public EAduioBook(String title, String literatureType, int availability, int reach, int use, int durationInMinutes) {
        super(title, literatureType, availability, reach, use);
        this.durationInMinutes = durationInMinutes;
    }

    @Override
    protected double calculatePoints() {
        return (durationInMinutes / 2) * convertLiteratureType() * getPseudoCopies();
    }

    @Override
    public int getDurationInMinutes() {
        return durationInMinutes;
    }
}
