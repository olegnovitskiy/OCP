package com.ocp.chapter1.olegnov.accessmodif.cat.species;

import com.ocp.chapter1.olegnov.accessmodif.cat.BigCat;

public class Lynx extends BigCat {

    public static void main(String[] args) {
        BigCat cat = new BigCat();
//        System.out.println(cat.hasFur); // Tricky

        Lynx cat1 = new Lynx();
        System.out.println(cat1.hasFur);
    }

}
