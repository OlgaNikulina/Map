package ru.netology.manager;

import javafx.application.Application;
import javafx.stage.Stage;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class FileOpenManagerTest {
    FileOpenManager manager = new FileOpenManager();

    @BeforeEach
    void shouldSetUp() {
        manager.add(".fb2", "eBook");
        manager.add(".flac", "WMP");
        manager.add("html", "Chrome");
    }

    @Test
    void shouldGetByExtension() {
        manager.getByExtension("flac");
    }

    @Test
    void shouldRemove() {
        manager.remove("fb2");
    }

    @Test
    void shouldGetAllExtensions() {
        manager.getAllExtensions();
    }

    @Test
    void shouldGetAllApplications() {
        manager.getAllApplications();
    }
}
