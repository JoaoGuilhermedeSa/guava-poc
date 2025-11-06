# Guava PoC Application

This is a Proof of Concept (PoC) application demonstrating various features of the Google Guava library.

## Features Demonstrated:

- **Immutable Collections:** `ImmutableList` for creating unmodifiable and thread-safe lists.
- **String Utilities:** `Strings.isNullOrEmpty`, `Strings.padEnd` for common string manipulations.
- **CharMatcher:** For powerful character matching and filtering from strings.
- **Splitter:** For robust string splitting with options for trimming and omitting empty strings.
- **Multiset:** A collection that counts the occurrences of elements.

## Project Structure:

- `pom.xml`: Maven build configuration.
- `src/main/java/com/example/guava/poc/GuavaPocApplication.java`: Main application class that demonstrates Guava features.
- `src/main/java/com/example/guava/poc/StringExamples.java`: Class encapsulating string-related Guava examples.
- `src/main/java/com/example/guava/poc/CollectionExamples.java`: Class encapsulating collection-related Guava examples.
- `src/test/java/com/example/guava/poc/StringExamplesTest.java`: Unit tests for `StringExamples`.
- `src/test/java/com/example/guava/poc/CollectionExamplesTest.java`: Unit tests for `CollectionExamples`.

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
