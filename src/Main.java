public class Main{
    public static void main(String[] args) {
        Author Alan = new Author("Alan Milne");
        Alan.addTitle(new PrintedBook("Peter Plys", "BI",140,30));

        Author JK = new Author("J.K Rowling");
        JK.addTitle(new AudioBook("Harry Potter","SKØN", 500, 200));
        JK.addTitle(new EBook("Harry Potter", "SKØN", 333, 167, 500, 42, true));
        JK.addTitle(new EAduioBook("Harry Potter", "SKØN", 333, 167, 500, 243));

        System.out.println(Alan.getName() + ": " + Alan.calculateRoyalties() + "kr");
        System.out.println(JK.getName() + ": " + JK.calculateRoyalties() + "kr");
    }
}