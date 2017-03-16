package com.ocp.assessment;

public class Compiles {
    class RainException extends Exception {}

    public static void main(String[] args) {
        /*
        // 3 compile errors
        try (Scanner s = new Scanner("rain"); String line = "";) {
            if (s.nextLine().equals("rain"))
                throw new RainException();
        }
        finally {
            s.close();
        }
        */
    }
}
