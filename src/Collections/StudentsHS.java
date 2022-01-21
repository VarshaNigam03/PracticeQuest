package Collections;

import java.util.Objects;

public class StudentsHS implements Comparable<StudentsHS> {
    String name;
    int rollNo;

    public StudentsHS(String name, int rollNo){
        this.name=name;
        this.rollNo=rollNo;
    }

    @Override
    public String toString() {
        return "StudentsHS{" +
                "name='" + name + '\'' +
                ", rollNo=" + rollNo +
                '}';
    }

//    StudentsHS s1= new StudentsHS("Rashmi", 8);
//    StudentsHS s2 = new StudentsHS("Kirti", 19);

    //to help hashset diff between name and rollNo (or any condition we want) in case of same objects
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        StudentsHS that = (StudentsHS) o;
        return rollNo == that.rollNo;
    }

    @Override
    public int hashCode() {
        return Objects.hash(rollNo);
    }

    public static void main(String []args){

    }
    //we can compare one property at a time wen we r using comparable
    //if we use comparator, we can compare diff properties
    @Override
    public int compareTo(StudentsHS that) {
        return this.rollNo - that.rollNo;
    }
}
