package enums;

public enum Priority {
    HIGH("Alto"), MEDIUM("Médio"), LOW("Baixo");

    private final String priority;

    Priority(final String priority) {
        this.priority = priority;
    }

    public String getPriority() {
        return priority;
    }
}