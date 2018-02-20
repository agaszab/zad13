public enum Sortowanie {
    NAZWA ("po nazwie", 0),
    KATEGORIA ("po kategorii", 1),
    KWOTAAZ ("po kwocie rosnąco", 2),
    KWOTAZA ("po kwocie malejąco", 3),;

private int index;
private String name;

    Sortowanie(String name, int index ) {
        this.index = index;
        this.name = name;
    }

    public int getIndex() {
        return index;
    }

    public String getName() {
        return name;
    }

}
