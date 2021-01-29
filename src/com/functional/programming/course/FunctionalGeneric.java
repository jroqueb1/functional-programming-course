package com.functional.programming.course;

@FunctionalInterface
public interface FunctionalGeneric<T, R> {
	R execute(T arg);
}
