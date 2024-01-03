package oop2.generics;

import java.util.Arrays;
import java.util.ArrayList;


public class CustomArrayList2<T extends Number> {
    private Object[] data;
    private static int DEFAULT_SIZE = 10;
    private int size= 0;
    public CustomArrayList2(){
        this.data = new Object[DEFAULT_SIZE];
    }

    public void add(T num){
        if(this.isFull()){
            resize();
        }
        data[size++] = num;
    }

    private void resize() {
        Object[] temp = new Object[data.length*2];
        for (int i = 0; i < data.length; i++) {
            temp[i] = data[i];
        }
        data = temp;
    }
    public T remove(){
        T removed = (T)(data[--size]);
        return removed;
    }
    private boolean isFull() {
        return size == data.length;
    }
    public T get(int index){
        return (T)data[index];
    }
    public void set(int index, T value){
        data[index] = value;
    }

    @Override
    public String toString() {
        return "CustomArrayList{" +
                "data=" + Arrays.toString(data) +
                ", size=" + size +
                '}';
    }

    public static void main(String[] args) {
//        ArrayList list = new ArrayList<>();
//        CustomArrayList2 list = new CustomArrayList2();
//        list.add(3);
//        list.add(9);
//        System.out.println(list);

        CustomArrayList2<Number> list3 = new CustomArrayList2<>();
        list3.add(4.6f);
    }
}
