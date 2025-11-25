package lesson_6.Anonymous;

public class Practice {
    public static void main(String[] args) {
        Projector projector = new Projector();
        Tv tv = new Tv();

        projector.display();
        tv.display();

       DisplayService displayService = new DisplayService(){

            @Override
            public void display() {
                System.out.println("Display anonymous");
            }
        };

        displayService.display();

       AnonymousAbstractClass anonymousAbstractClass = new AnonymousAbstractClass(){

            @Override
            void displayAbstract() {
                System.out.println("Display abstract class");
            }
        };

       anonymousAbstractClass.displayAbstract();
    }
}
