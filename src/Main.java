public class Main {
    public static void main(String[] args) {
        Book deadSouls = new Book("Мертвые души", "Н.В.Гоголь");
        Magazine time = new Magazine("Time");
        Book theMasterAndMargarita = new Book("Мастер и Маргарита", "М.А.Булгаков");
        Magazine pravda = new Magazine("Правда");
        Printable[] printables = new Printable[]{deadSouls, time, theMasterAndMargarita, pravda};
        for (Printable a: printables) {
            a.print();
        }
        System.out.println("-----------Названия журналов-----------");
        Magazine.printMagazines(printables);
        System.out.println("-------------Названия книг-------------");
        Book.printBook(printables);
    }
}