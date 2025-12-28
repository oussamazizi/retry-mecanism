package com.oussama;

public class UnstableApi {

    private int calls = 0;

    public void call() throws Exception {
        calls++;
        if (calls < 3) {
            throw new Exception("API temporary error");
        }
        System.out.println("API call succeeded");
    }
}
