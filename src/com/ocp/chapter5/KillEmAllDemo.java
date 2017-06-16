package com.ocp.chapter5;

import java.util.*;

public class KillEmAllDemo {

    private static void killEmAll(Collection<String> expendables) {
        System.out.println(expendables.getClass());
        System.out.println(expendables);
        Iterator<String> heroes = expendables.iterator();
        heroes.forEachRemaining(e -> {
            if (heroes.hasNext()) {
                System.out.println("Element: " + heroes.next());
                heroes.remove();
                System.out.println(expendables);
            }
        });

        System.out.println(expendables);
        System.out.println();
    }

    public static void main(String[] args) {
        killEmAll(new ArrayList<>(Arrays.asList("N", "S", "W", "S", "L", "S", "L", "V")));
        killEmAll(new LinkedList<>(Arrays.asList("N", "S", "W", "S", "L", "S", "L", "V")));
        killEmAll(new ArrayDeque<>(Arrays.asList("N", "S", "W", "S", "L", "S", "L", "V")));
        killEmAll(new TreeSet<>(Arrays.asList("N", "S", "W", "S", "L", "S", "L", "V")));
    }
}
