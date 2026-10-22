public class EBook extends NetTitle{
    private int character;
    private boolean illustrated;

    public EBook(String title, String literatureType, int availability, int reach, int use, int character, boolean illustrated) {
        super(title, literatureType, availability, reach, use);
        this.character = character;
        this.illustrated = illustrated;
    }

    private double calculatedPages() {
        double pages = character / 1800 + 20;
        if(illustrated){
            return pages * 1.10;
        }
        return pages;
    }

    protected double calculatePoints() {
        return calculatedPages() * convertLiteratureType() * getPseudoCopies();
    }
}
