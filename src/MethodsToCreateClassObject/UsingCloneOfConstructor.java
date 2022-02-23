package MethodsToCreateClassObject;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

//create one variable , default constructor and setter for variable

public class UsingCloneOfConstructor {

    private String name = "varsha";

    UsingCloneOfConstructor(){}

    public String setName(String name){
        return name;
    }

    public static void main(String[] args){
        Constructor<UsingCloneOfConstructor> cons = null;
        try {
            cons = UsingCloneOfConstructor.class.getDeclaredConstructor();
            UsingCloneOfConstructor obj = cons.newInstance();
            obj.setName("varsha");
            System.out.println(obj.name);
        }
        catch (NoSuchMethodException | InstantiationException | IllegalAccessException | InvocationTargetException e) {
            e.printStackTrace();
        }
    }

}
