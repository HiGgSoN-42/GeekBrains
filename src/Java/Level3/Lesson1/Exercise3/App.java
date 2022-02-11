package Java.Level3.Lesson1.Exercise3;

public class App {

    public static void main(String[] args) {

        Box box1 = new Box();
        Box box2 = new Box();
        Orange orange1 = new Orange();
        Orange orange2 = new Orange();
        Apple aplle1 = new Apple();
        Apple aplle2 = new Apple();
        //Apple aplle3 = new Apple();
        box1.add(orange1);
        box1.add(orange2);
        box2.add(aplle1);
        box2.add(aplle2);
        //box2.add(aplle3);
        System.out.println(box1.compare(box2));
    }
}