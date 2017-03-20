package com.ocp.chapter1.olegnov.abstractclasses;

public class AbstractDemo {
}

abstract class Cat {
    //abstract void clean();
    void clean(){}
}

class Lion extends Cat {
    @Override
    void clean() {}

    void clean(int a) {}
}