import java.util.ArrayList;

public class ArrayListEx {

    public static void main(String[] args) {

        ArrayList<String> list1 = new ArrayList<String>();

        list1.add(0, "zero");
        list1.add(1, "one");
        list1.add(2, "two");
        list1.add(3, "three");
        printAL(a);

        if (list1.contains("three")) {
            list1.add("four");
        }
        list1.remove(2);
        printAL(list1);

        if (list1.indexOf("four") != 4) {
            list1.add(4, "4.2");
        }
        printAL(a);

        if (list1.contains("two")) {
            list1.add("2.2");
        }
        printAL(list1);
    }

    public static void printAL(ArrayList<String> al) {
        for (String element : al) {
            System.out.print(element + " ");
        }
        System.out.println(" ");
    }
}
