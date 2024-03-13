package Task1;

public class Main {
    public static void main(String[] args) {

        Book history1 = new Book("История Государства Российского",
                "Н.М. Карамзин", 1906);
        Book history2 = new Book("История Государства Российского",
                "Н.М. Карамзин", 2010);
        System.out.println("Имеем две книги одного автора, но разных годов выпуска:");
        System.out.println(history1);
        System.out.println(history2);
        System.out.println("Сравниваем две книги одного автора, но разных годов выпуска:");
        System.out.println(history1.equals(history2));

        Book horror1 = new Book("Ужастик","И.К. Безымянный",2010);
        Book horror2 = new Book("Ужастик","А.К. Безымянный",2010);
        System.out.println("Имеем две книги разных авторов, одного года выпуска:");
        System.out.println(horror1);
        System.out.println(horror2);
        System.out.println("Сравниваем две книги разных авторов, одного года выпуска:");
        System.out.println(horror1.equals(horror2));


    }
}
