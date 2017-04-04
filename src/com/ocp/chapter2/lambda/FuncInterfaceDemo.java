package com.ocp.chapter2.lambda;

import java.util.List;

@FunctionalInterface
interface A {
    void method(List<Double> l);
}

@FunctionalInterface
interface B extends A {
    void method(List l);
}

interface C {
    int m(int i);
    long m(long i);
}

class FuncInterfaceDemo {
}
