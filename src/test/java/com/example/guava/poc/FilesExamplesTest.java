package com.example.guava.poc;

import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.IOException;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FilesExamplesTest {

    private final FilesExamples filesExamples = new FilesExamples();

    @Test
    void testWriteAndRead() throws IOException {
        File tempFile = new File("temp.txt");
        tempFile.deleteOnExit();

        filesExamples.writeToFile(tempFile, "line1\nline2");

        List<String> lines = filesExamples.readLines(tempFile);
        assertEquals(2, lines.size());
        assertEquals("line1", lines.get(0));
        assertEquals("line2", lines.get(1));
    }
}
