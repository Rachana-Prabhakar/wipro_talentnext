package oopsAndInheritance;

interface Playable {
    void play();
}

class Veena implements Playable {
    public void play() {
        System.out.println("Playing the Veena");
    }
}

class Saxophone implements Playable {
    public void play() {
        System.out.println("Playing the Saxophone");
    }
}

public class Question13{
    public static void main(String[] args) {
        Veena veena = new Veena();
        Saxophone saxophone = new Saxophone();

        veena.play();

        saxophone.play();

        Playable p1 = veena;
        Playable p2 = saxophone;

        p1.play();
        p2.play();
    }
}