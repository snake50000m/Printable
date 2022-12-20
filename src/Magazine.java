public class Magazine implements Printable{
    private String name;

    public Magazine() {
    }

    public Magazine(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void print() {
        System.out.println(getName());
    }

    public static void printMagazines(Printable[] printable){
        for (Printable a: printable) {
            if(a instanceof Magazine){
                System.out.println(((Magazine) a).getName());
            }
        }
    }
}
