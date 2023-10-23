package lesson_6.lecture.part2;

import java.util.Objects;

public class Worker {
    int id;
    int salary;
    String firstName;
    String lastName;

    @Override
    public String toString() {
        return String.format("%d %s %s %d", id, firstName, lastName, salary);
    }

    @Override
    public boolean equals(Object o) {
        var t = (Worker) o;
        return id == t.id && Objects.equals(firstName, t.firstName);
    }
    @Override
    public int hashCode() {
        return id;
    }
}
