package com.onetechone.design.designpattern.singleton;

public class SingletonWithNestedClass {

    private SingletonWithNestedClass() {
    }

    private static class SingletonHelper {
        private static final SingletonWithNestedClass INSTANCE = new SingletonWithNestedClass();
    }

    public static SingletonWithNestedClass getInstance() {
        return SingletonHelper.INSTANCE;
    }
}
