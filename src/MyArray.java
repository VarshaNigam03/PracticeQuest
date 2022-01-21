//get(index), insert(Object item), delete(int index), pop()

import java.util.Arrays;

public class MyArray {

   static int capacity;
   static int length;
   static Object data[];

   MyArray(){
       capacity=100;
       length=0;
       data =new Object[100];
   }

   static Object getItem(int index){
       return data[index];
   }

   static void insert(Object item){
       if (capacity==length) {
           Arrays.copyOf(data, capacity * 2);
           capacity *= 2;
       }
       data[length]=item;
       length++;
   }

   static void pop(){
       Object lastItem=data[length-1];
       data[length-1]=null;
       length--;
   }

    Object delete(int index){
       Object item=data[index];
       shiftItems(index);
       return item;
   }

   static void shiftItems(int index){
      for(int i=index; i<length-1; i++) {
          data[i] = data[i+1];
      }
      data[length-1]=null;
      length--;
   }

   void replaceItem(int index,Object now){
       Object old=data[index];
       data[index]=now;
   }

   public static void main(String []args){
       MyArray ma= new MyArray();
       ma.insert(4);
       ma.insert(6);
       ma.insert(1);
       ma.insert(9);
       ma.insert(5);
       ma.insert(8);
       ma.delete(1);
       ma.replaceItem(1,10);
       ma.replaceItem(2,2);
       //ma.pop();
       for(int i=0; i<ma.length; i++)
       System.out.println(ma.getItem(i));

   }


}
