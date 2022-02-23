package MethodsToCreateClassObject;

import java.io.*;

//create a variable, a parametrize constructor

public class UsingDeserialization implements Serializable {

    private String name = "name";

    UsingDeserialization(String name){
        this.name = name;
    }

    public static void main(String[] args){
        UsingDeserialization obj1 = new UsingDeserialization("varsha");
        try {
        FileOutputStream f = new FileOutputStream("file.txt");
        ObjectOutputStream o = new ObjectOutputStream(f);
        o.writeObject(obj1);
        o.close();
        f.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
