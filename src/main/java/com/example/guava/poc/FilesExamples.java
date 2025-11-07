package com.example.guava.poc;

import com.google.common.base.Charsets;
import com.google.common.io.Files;

import java.io.File;
import java.io.IOException;
import java.util.List;

public class FilesExamples {

    public void writeToFile(File file, String content) throws IOException {
        Files.write(content.getBytes(Charsets.UTF_8), file);
    }

    public List<String> readLines(File file) throws IOException {
        return Files.readLines(file, Charsets.UTF_8);
    }
}
