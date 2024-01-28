public class Triangolo implements Forma {
    private int base;
    private int altezza;
    @Override
    public int calcolaArea() {
        return base * altezza / 2;
    }

    public Triangolo(int base, int altezza) {
        this.base = base;
        this.altezza = altezza;
    }
}
