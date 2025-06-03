package JavaTraining;

import java.util.*;
// class Student implements Comparable <Student>{
//     int age;
//     String name;

// public Student(int age, String name){
//     this.age = age;
//     this.name = name;

// }
// public String toString(){
//     // return s.toString(s)
//     // System.out.println("heeelllooo");
//     return age +" " +name;
// }
// public int compareTo(Student s){
//     return this.age - s.age;
// }
// }

class Students{
    int rollN;
    String name;
    int age;

    public Students(int rollN,String name, int age){
          this.rollN=rollN;
          this.age=age;
          this.name=name;
    }
    public String toString(){
        return age + " " + rollN +" " +name;
    }
}
class sortByName implements Comparator<Students>{
    public int compare(Students s1, Students s2){
    return s1.name.compareTo(s2.name);
}
}
class sortByRollN implements Comparator<Students>{
    public int compare(Students s1, Students s2){
    return Integer.compare(s1.rollN, s2.rollN);
}
}
class sortByAge implements Comparator<Students>{
    public int compare(Students s1, Students s2){
    return Integer.compare(s1.age, s2.age);
}
}
public class ComparatorExample {
    public static void main(String[] args) {
        
        // ArrayList<Integer>list = new ArrayList<>();
        // list.add(1);
        // list.add(3);
        // list.add(0);
        // list.add(2);
        // Collections.sort(list);
        // System.out.println(list);

        // ArrayList<Student>list = new ArrayList<>();
        // list.add(new Student(12,"ahna"));
        // list.add(new Student(10,"parth"));
        // list.add(new Student(11,"pakhii"));
        // Collections.sort(list);
        // for(Student s : list){
        //     System.out.println(s.toString());
        // }

        ArrayList<Students>list = new ArrayList<>();
        list.add(new Students(456, "palak", 10));
        list.add(new Students(56, "reenaa", 25));
        Collections.sort(list,new sortByName());
        for(Students s : list){
            System.out.println(s.toString());
        }
        Collections.sort(list,new sortByRollN());
        for(Students s : list){
            System.out.println(s.toString());
        }
        Collections.sort(list,new sortByAge());
        for(Students s : list){
            System.out.println(s.toString());
        }
    }

}