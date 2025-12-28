package com.oussama;

public class Main {
    public static void main(String[] args) {

        UnstableApi api = new UnstableApi();
        RetryExecution retry = new RetryExecution(5);

        try {
            retry.run(api::call);
        } catch (Exception e) {
            System.out.println("Operation failed after retries");
        }
    }
}