package Java.Level3.Lesson1.Exercise3;

import java.util.ArrayList;

public class Box<T extends Fruit> {

    final float PRECISION_LEVEL = 0.0001f;

    private float weight;
    private ArrayList<T> boxList = new ArrayList();

    Box() {
        weight =0f;
    }

    public float getWeight() {
        if (boxList.size() > 0) return weight = boxList.size() * (boxList.get(0)).getWeight();
        else return 0f;
    }

    public void add(T x) {
        boxList.add(x);
    }

    public boolean compare(Box compareBox) {
        return Math.abs(this.getWeight() - compareBox.getWeight()) < PRECISION_LEVEL;
    }

    public Box<T> drop() {
        Box<T> dropBox = new Box<>();
        for(T x: this.boxList) dropBox.add(x);
        this.boxList.clear();
        return dropBox;
    }
}
