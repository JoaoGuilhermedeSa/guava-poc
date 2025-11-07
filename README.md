# Guava PoC Application

This is a Proof of Concept (PoC) application demonstrating various features of the Google Guava library.

## Features Demonstrated:

- **Immutable Collections:** `ImmutableList` for creating unmodifiable and thread-safe lists.
- **New Collection Types:**
    - `Multiset`: A collection that counts the occurrences of elements.
    - `Multimap`: A map that can store multiple values for a single key.
    - `BiMap`: A map that provides a one-to-one correspondence between keys and values.
- **String Utilities:** `Strings.isNullOrEmpty`, `Strings.padEnd` for common string manipulations.
- **CharMatcher:** For powerful character matching and filtering from strings.
- **Splitter:** For robust string splitting with options for trimming and omitting empty strings.
- **Concurrency Utilities:**
    - `LoadingCache`: A cache that automatically loads values on demand.
    - `RateLimiter`: A tool to limit the rate of operations.
- **Preconditions:** For checking method preconditions and failing fast.
- **Files:** For simplifying common file operations.

## Project Structure:

- `pom.xml`: Maven build configuration.
- `src/main/java/com/example/guava/poc/GuavaPocApplication.java`: Main application class that demonstrates Guava features.
- `src/main/java/com/example/guava/poc/StringExamples.java`: Class encapsulating string-related Guava examples.
- `src/main/java/com/example/guava/poc/CollectionExamples.java`: Class encapsulating collection-related Guava examples.
- `src/main/java/com/example/guava/poc/ConcurrencyExamples.java`: Class encapsulating concurrency-related Guava examples.
- `src/main/java/com/example/guava/poc/PreconditionExamples.java`: Class encapsulating precondition-related Guava examples.
- `src/main/java/com/example/guava/poc/FilesExamples.java`: Class encapsulating file-related Guava examples.
- `src/test/java/com/example/guava/poc/StringExamplesTest.java`: Unit tests for `StringExamples`.
- `src/test/java/com/example/guava/poc/CollectionExamplesTest.java`: Unit tests for `CollectionExamples`.
- `src/test/java/com/example/guava/poc/ConcurrencyExamplesTest.java`: Unit tests for `ConcurrencyExamples`.
- `src/test/java/com/example/guava/poc/PreconditionExamplesTest.java`: Unit tests for `PreconditionExamples`.
- `src/test/java/com/example/guava/poc/FilesExamplesTest.java`: Unit tests for `FilesExamples`.

## How to Build and Run:

1.  **Build the project:**
    ```bash
    mvn clean install
    ```
2.  **Run the application:**
    ```bash
    mvn exec:java -Dexec.mainClass="com.example.guava.poc.GuavaPocApplication"
    ```
3.  **Run tests:**
    ```bash
    mvn test
    ```