package com.java8.base;

@FunctionalInterface
public interface Predicado<T> {
   boolean test(T t);
}