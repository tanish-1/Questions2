package rev.generices;

import java.util.Arrays;

public class CustomArrayList<T extends Number> {
     private Object[] data;
     private static int DEFAULT_SIZE = 10;
     private int size = 0;
   public CustomArrayList(){
         this.data = new Object[DEFAULT_SIZE];
     }
     public void add(T num){
       if(this.isFull()){
           resize();
       }
       data[size++] = num;
     }
     private void resize(){
       Object[] temp = new Object[data.length*2];
       for(int i = 0 ; i< data.length ; i++){
           temp[i] = data[i];
       }
       data = temp;
     }
     private boolean isFull(){
       return size == data.length;
     }
  public T remove(){
       T removed = (T)(data[--size]);
       return removed;
  }
  public T get(int index){
       return (T)data[index];
  }
  public int size(){
       return size;
  }
  public void set(int index , T value){
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
//   CustomArrayList list = new CustomArrayList();
//    list.add(34);
//        System.out.println(list);
        CustomArrayList<Integer> li = new CustomArrayList<>();
        li.add(34);
        System.out.println(li);
    }
}
