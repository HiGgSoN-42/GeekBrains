package Java.Level3.Lesson1.Exercise1_2;

import java.util.ArrayList;
import java.util.Arrays;

public class App {

    public static void main(String[] args) {

        Object[] objArray = new Object[2];
        swapArray(objArray[0], objArray[1]); // меняет местами 1 и 2 элементы массива
        ArrayList<Object> objList = new ArrayList<>(Arrays.asList(objArray));
        // А зачем описывать метод, преобразующий массив в ArrayList, если он уже есть?
    }

    static <T> void swapArray(T x, T y) {
        T z = x;
        x = y;
        y = z;
    }
}