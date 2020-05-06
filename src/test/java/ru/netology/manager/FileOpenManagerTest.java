package ru.netology.manager;

import javafx.application.Application;
import javafx.stage.Stage;
import lombok.Value;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.security.Key;
import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

class FileOpenManagerTest {
    FileOpenManager manager = new FileOpenManager();
    String extension;
    String name;
    Map<String, String> first = new HashMap<>(".fb2", "eBook");
    Map<String, String> second = new HashMap<>(".flac", "WMP");
    Map<String, String> third = new HashMap<>(".html", "Chrome");

    @BeforeEach
    void shouldSetUp() {
        manager.add(".fb2", "eBook");
        manager.add(".flac", "WMP");
        manager.add(".html", "Chrome");
    }

    @Test
    void shouldGetByExtension() {
        Map.of();
        final String actual = manager.getByExtension(".flac");
        Map<String, String> expected = second;
        assertEquals(expected, actual);
    }

    @Test
    void shouldRemove() {
        Map.entry(".fb2", "eBook");
        manager.remove(".fb2");
        Map<String, String> expected = null;
    }

    @Test
    void shouldGetAllExtensions() {
        final Set<String> actual = manager.getAllExtensions();
        Map<String, String> expected = new HashMap<>(".fb2", ".flac", ".html");
        assertEquals(expected, actual);
    }

    @Test
    void shouldGetAllApplications() {
        final Collection<String> actual = manager.getAllApplications();
        Map<String, String> expected = new HashMap<>(first, second, third);
        assertEquals(expected, actual);
    }
}
