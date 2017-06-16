package com.ocp.chapter4;

@FunctionalInterface
interface Gorilla {
    String move();
}

public class GorillaFamily {
    String walk = "walk";

    void everyonePlay(boolean baby) {
        String approach = "amble";
//         approach = "run";

        play(() -> walk);
        play(() -> baby? "hitch a ride" : "run");
        play(() -> approach);
    }

    private void play(Gorilla g) {
        System.out.println(g.move());
    }

    public static void main(String[] args) {
        GorillaFamily gorillaFamily = new GorillaFamily();
        gorillaFamily.everyonePlay(true);
    }
}
