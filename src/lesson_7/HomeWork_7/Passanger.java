package lesson_7.HomeWork_7;

public class Passanger {
    private String name;
    private boolean isPriority;


    public Passanger(String name, boolean isPriority) {
        this.name = name;
        this.isPriority = isPriority;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isPriority() {
        return isPriority;
    }

    public void setPriority(boolean priority) {
        isPriority = priority;
    }

    @Override
    public String toString() {
        return name + (isPriority ? " (PRIORITY)" : "");
    }
}
