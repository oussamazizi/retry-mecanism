package com.oussama;

/**
 * Executes an action with retry logic
 */
public class RetryExecution {
    private final int maxAttemps;

    public RetryExecution(int maxAttemps) {
        if(maxAttemps <= 0) {
            throw new IllegalArgumentException("maxAttemps must be > 0");
        }
        this.maxAttemps = maxAttemps;
    }

    public void run(Retryable action) throws Exception {
        Exception lastException = null;
        for (int attempt = 1; attempt <= maxAttemps; attempt++) {
            try {
                System.out.println("Attempt "+ attempt);
                action.run();
                return;
            } catch (Exception e) {
                lastException = e;
                System.out.println("Failed: "+ e.getMessage());
            }
            Thread.sleep(700);
        }

        // All attempts failed
        throw lastException;
    }
}
