package lab7;

public interface AnimalMove {

    default void move() {
        System.out.println("Animal move");
    }
}
