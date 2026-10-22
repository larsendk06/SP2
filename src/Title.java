public abstract class Title{
    String title;
    String literatureType;
    protected double rate;


    public Title(String title, String literatureType) {
        this.title = title;
        this.literatureType = literatureType;
        this.rate = 0.067574;
    }

    double calculateRoyalty() {
        return calculatePoints() * rate;

    }
    protected abstract double calculatePoints();

    protected double convertLiteratureType() {
        return switch (literatureType) {
            case "BI", "TE" -> 3;
            case "LYRIK" -> 6;
            case "SKØN" -> 1.7;
            case "FAG" -> 1;
            default -> 0;
        };
    }
}
