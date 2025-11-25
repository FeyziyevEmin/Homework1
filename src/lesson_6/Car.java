package lesson_6;

public class Car {
    private int wheels;
    private String color;
    private String name;

    public Car(int wheels, String color, String name){
        this.wheels=wheels;
        this.color=color;
        this.name=name;
    }

    public void drive(){
        System.out.println("Driving");
    }

    class Engine{
        private int horsePower;

        public Engine(int horsePower){
            this.horsePower=horsePower;
        }

        public void start(){
            System.out.println("Start inner class");
        }
    }

    static class EngineNested{
        private int nestedHorsePower;

        EngineNested(int nestedHorsePower){
            this.nestedHorsePower=nestedHorsePower;
        }

        public void nestedStart(){
            System.out.println("Start nested class");
        }
    }


}
