package app;

import enums.Priority;

public class App {
    public static void main(String[] args) throws Exception {
        Priority p1 = Priority.HIGH;
        System.out.println(p1.getPriority());

        for (Priority p : Priority.values()) {
            System.out.println(String.format("Enum Name: %s - Enum Value: %s", p.name(), p.getPriority()));
        }
    }
}