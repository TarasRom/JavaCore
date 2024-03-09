package lab6;

import java.util.*;

class ListDemo {
    public static void main(String[] args) {
        List<Student> list = new ArrayList<>();
        list.add(new Student("Alex", 20));
        list.add(new Student("Alex", 20));
        list.add(new Student("Dilan", 20));
        list.add(new Student("Bob", 19));
        list.add(new Student("Alex", 18));

        System.out.println(list);
        Collections.sort(list);
        System.out.println(list);


//        List<String> list = new ArrayList<>(100);
//        list.add("Alice");
//        list.add("Bob");
//        list.add("Claire");
//        list.add("Dilan");
//        list.add("Etan");
//        list.add(2, "Bryan");
//
//        list.set(1, "Bobic");
//        //System.out.println(list);
//
//        List<String> list1 = list.subList(2, 4);
//        //System.out.println(list1);
//
//        List<Integer> list2 = List.of(19, 17, 12, 18, 14, 15);
//        System.out.println(list2);
//        List<Integer> list3 = new ArrayList<>(list2);
//        list3.add(20);
//        list3.add(23);
//        System.out.println(list3);
//        Collections.sort(list3);
//        System.out.println(list3);


    }
}