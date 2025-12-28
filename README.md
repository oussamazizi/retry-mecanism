# Retry Mechanism

A simple Java implementation of a retry mechanism designed to handle transient failures in a clean and reusable way.

## Features

- **Functional Interface**: Uses a `@FunctionalInterface` (`Retryable`) to wrap any action that might throw an exception.
- **Configurable Attempts**: Easily set the maximum number of retry attempts.
- **Fixed Delay**: Includes a built-in delay between attempts to allow transient issues to resolve.
- **Exception Handling**: Re-throws the last encountered exception if all attempts fail.

## Project Structure

- `Retryable.java`: A functional interface for actions to be retried.
- `RetryExecution.java`: The core logic that manages the retry loop and delays.
- `UnstableApi.java`: A mock API class used to demonstrate transient failures.
- `Main.java`: A demo class showing how to use the retry mechanism.

