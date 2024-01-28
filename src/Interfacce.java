public class Interfacce {
    public static void main(String[] args) {
        Rettangolo rettangolo = new Rettangolo(5, 9);
        Triangolo triangolo = new Triangolo(14, 19);

        System.out.println(rettangolo.calcolaArea());
        System.out.println(triangolo.calcolaArea());

    }
}
