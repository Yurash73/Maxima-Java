package Task2;

public class Main {
    public static void main(String[] args) {

        Storage<String> library = new Storage<>();
        library.add("First");
        library.add("Second");
        library.add("Third");
        try {
            System.out.println("Element with index = 2: " + library.get(4));
        } catch (IndexOutOfBoundsException ioobe) {
            System.out.println(ioobe.getMessage());
        }
        System.out.println("Размер списка String - " + library.size());


        Storage<Integer> numbers = new Storage<>();
        numbers.add(15);
        numbers.add(208);
        numbers.add(66);
        numbers.add(91);
        numbers.add(7);
        try {
            System.out.println("Element with index = 4: " + numbers.get(3));
        } catch (IndexOutOfBoundsException e) {
            e.printStackTrace();
        }
        System.out.println("Размер списка Integer - " + numbers.size());

    }
}
