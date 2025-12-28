package com.oussama;

@FunctionalInterface
public interface Retryable {
    void run() throws Exception;
}
