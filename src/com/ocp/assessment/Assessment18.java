package com.ocp.assessment;

public class Assessment18 {
    public static void main(String[] args) {
        // Bad!
//        Set<? extends RuntimeException> set = new HashSet<? extends RuntimeException>();
//        Set<? extends RuntimeException> set = new HashSet<Exception>();

        // Good!
//        Set<? extends RuntimeException> set = new TreeSet<RuntimeException>();
//        Set<? extends RuntimeException> set = new TreeSet<NullPointerException>();
    }
}
