import java.util.ArrayList;

public class Author {
    public String name;

    private ArrayList<Title> titles;

    public Author(String name) {
        this.name = name;
        this.titles = new ArrayList<>();
    }

    public void addTitle(Title title) {
        titles.add(title);
    }

    public double calculateRoyalties() {
        double royalties = 0;
        for (Title title : titles) {
            royalties += title.calculateRoyalty();
        }
        return Math.round(royalties * 100.0 ) / 100.0;
    }

    String getName() {
        return name;
    }
}
