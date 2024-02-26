
public class Main {
    public static void main(String[] args) {

        Author ernestHemingway = new Author("Эрнест", "Хемингуэй");
        Author nikolayNosov = new Author("Николай", "Носов");

        Book oldManAndSea = new Book("Старик и море", ernestHemingway, 1985);
        Book dunnoOnTheMoon = new Book("Незнайка на Луне",nikolayNosov, 2005);

        oldManAndSea.setYearOfPrinting(2015);

        System.out.println(ernestHemingway);
        System.out.println(oldManAndSea);
        System.out.println(dunnoOnTheMoon);
    }
}