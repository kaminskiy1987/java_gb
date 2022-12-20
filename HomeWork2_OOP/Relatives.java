package HomeWork2_OOP;

public class Relatives {
    private final Human first;
    private final Human second;
    private final Relations relations;

    public Relatives(Human first, Human second, Relations relations) {
        this.first = first;
        this.second = second;
        this.relations = relations;
    }

    public Human getFirst() {
        return first;
    }

    public Human getSecond() {
        return second;
    }

    public Relations getRelations() {
        return relations;
    }

    @Override
    public String toString() {
        return String.format("%s и %s супруги", first, second);
    }
}