package app;

public enum  Options {

    NEWEXPENSE ("Dodaj nowy wydatek", 0),
    INFO ("Wyświetlenie informacji o wydatkach", 1),
    SAVE ("Zapis informacji do pliku", 2),
    EXIT ("Wyjście z programu", 3);

   private String name;
   private int index;

    Options(String name, int index) {
        this.name = name;
        this.index = index;
    }

    public String getName() {
        return name;
    }

    public int getIndex() {
        return index;
    }

}
