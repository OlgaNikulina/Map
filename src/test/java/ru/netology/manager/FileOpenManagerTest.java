package ru.netology.manager;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Collection;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FileOpenManagerTest {
    FileOpenManager manager = new FileOpenManager();

    @BeforeEach
    void shouldSetUp() {
        manager.add(".fb2", "eBook");
        manager.add(".flac", "WMP");
        manager.add(".html", "Chrome");
    }

    @Test
    void shouldGetByExtension() {
        final String actual = manager.getByExtension(".flac");
        assertEquals("WMP", actual);
    }

    @Test
    void shouldRemove() {
        manager.remove(".fb2");
        final Collection<String> expected = Set.of("Chrome", "WMP");
        final Collection<String> actual = Set.copyOf(manager.getAllApplications());
        assertEquals(expected, actual);
    }

    @Test
    void shouldGetAllExtensions() {
        final Set<String> actual = manager.getAllExtensions();
        Set<String> expected = Set.of(".fb2", ".flac", ".html");
        assertEquals(expected, actual);
    }

    @Test
    void shouldGetAllApplications() {
        final Set<String> actual = Set.copyOf(manager.getAllApplications());
        Set<String> expected = Set.of("Chrome", "WMP", "eBook");
        assertEquals(expected, actual);
    }
}
