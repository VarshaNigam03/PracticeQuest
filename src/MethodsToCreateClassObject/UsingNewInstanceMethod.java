package MethodsToCreateClassObject;

//create one variable only

public class UsingNewInstanceMethod {

    String name = "varsha";

    public static void main(String[] args){
        try {
            Class cls = Class.forName("UsingNewInstanceMethod");
            UsingCloneMethod obj = (UsingCloneMethod)cls.newInstance();
            System.out.println(obj.name);
        }
        catch (ClassNotFoundException | InstantiationException | IllegalAccessException e) {
            e.printStackTrace();
        }
    }
}
