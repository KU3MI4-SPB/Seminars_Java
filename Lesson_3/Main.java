import java.util.*;
import java.util.stream.IntStream;

public class Seminar3 {
    public static void main(String[] args) {

        Object o = new Object();

        ArrayList<Integer> list = new ArrayList();

        list.add(1);    //Integer
//        list.add("1");  //String
//        list.add(new int[]{1, 2});  //Array

//        int n = list.get(0);
//
//        for (int i = 0; i < list.size(); i++) {
//            System.out.println(list.get(i));
//            list.remove(2);
//            i--;
//        }
//
//        for (int i: list) {
//            System.out.println(i);
//        }
//
//        ListIterator<Integer> iterator = list.listIterator(list.size()/2);
//        while (iterator.hasPrevious()) {
//            int i = iterator.previous();
//            list.set(iterator.nextIndex(), 4);
//            iterator.set(4);
//            if (i%2!=0) iterator.remove();
//            System.out.println(i);
//        }
//
//        list.forEach(n1 -> System.out.println(n1));

//        ArrayList<Integer> list1 = (ArrayList<Integer>) Arrays.asList(1, 2, 3, 4);
//        ArrayList<Integer> list2 = (ArrayList<Integer>) List.of(1, 2, 3, 4);

        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            list1.add(new Random().nextInt(10));
            list2.add(new Random().nextInt(10));
        }

        System.out.println(list1);
        System.out.println(list2);
        System.out.println("-".repeat(16));

//        list1.removeIf(n -> n%2!=0);
//        list2.addAll(12, list1);

//        1111
//        222222
//        2222111122
//        list1.retainAll(list2);
//        list1.removeAll(list2);

        list1.sort((o1, o2) -> {
            if (o1%3!=0) return 1;
            if (o2%2!=0) return -1;
            else return 0;
        });

        list2.removeIf(n -> n%2!=0);
        System.out.println(list1);

        ArrayList<String> strings = new ArrayList<>();

        list2.forEach(n -> strings.add(String.valueOf(n)));
        System.out.println(strings);

    }

}