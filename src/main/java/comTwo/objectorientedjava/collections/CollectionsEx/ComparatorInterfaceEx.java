package comTwo.objectorientedjava.collections.CollectionsEx;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorInterfaceEx {

    private String name;
    private int age;

    public ComparatorInterfaceEx(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "ComparatorInterfaceEx{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public static void main(String[] args) {
        List<ComparatorInterfaceEx> ComparatorInterfaceExList = new ArrayList<>();
        ComparatorInterfaceExList.add(new ComparatorInterfaceEx("Alice", 20));
        ComparatorInterfaceExList.add(new ComparatorInterfaceEx("Bob", 18));
        ComparatorInterfaceExList.add(new ComparatorInterfaceEx("Charlie", 22));

        // Sort ComparatorInterfaceExs by age using a Comparator

        Collections.sort(ComparatorInterfaceExList, new Comparator<ComparatorInterfaceEx>() {

            @Override
            public int compare(ComparatorInterfaceEx s1, ComparatorInterfaceEx s2) {
                return Integer.compare(s1.getAge(), s2.getAge());
            }
        });

        System.out.println("ComparatorInterfaceExs sorted by age:");
        for (ComparatorInterfaceEx ComparatorInterfaceEx : ComparatorInterfaceExList) {
            System.out.println(ComparatorInterfaceEx);
        }
    }
}
