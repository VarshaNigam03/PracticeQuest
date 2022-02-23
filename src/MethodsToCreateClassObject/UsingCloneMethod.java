package MethodsToCreateClassObject;

//create one variable and a clone method(automatically overridden)

public class UsingCloneMethod implements Cloneable{

    String name= "varsha";

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public static void main(String[] args){
        UsingCloneMethod obj1 = new UsingCloneMethod();
        try {
            UsingCloneMethod obj2 = (UsingCloneMethod)obj1.clone();
            System.out.println(obj2.name);
        }
        catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}
