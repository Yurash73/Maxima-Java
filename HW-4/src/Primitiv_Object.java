public class Primitiv_Object {

    public static void main(String[] args) {

        System.out.println("Инициализация:");
        int n = 250;
        Author unknown = new Author("Иван","Иванов");
        System.out.println("int n=" + n);
        System.out.println("Имя Автора =" + unknown);
        test(n, unknown);
        System.out.println("После вызова метода изменения значений получаем:");
        System.out.println("int n=" + n);
        System.out.println(unknown);

    }

    public static void test(int n, Author author) {

        System.out.println("Увеличиваем на 10 число, теперь оно равно:");
        n += 10;
        System.out.println("int n=" + n);
        System.out.println("Меняем имя и фамилию автора и теперь они:");
        author.setNameAuthor("Петр");
        author.setSurnameAuthor("Петров");
        System.out.println(author);

    }
}
