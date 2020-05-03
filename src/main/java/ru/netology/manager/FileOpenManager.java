package ru.netology.manager;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


import java.util.*;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class FileOpenManager {
    private String lawCase = "все в нижнем регистре";
    private String data = lawCase.toLowerCase();

    private Map<String, String> applications = new HashMap<>();

    public void add(String extension, String name) {
        applications.put(extension, name);
    }

    public void getByExtension(String extension) {
        applications.get(extension);
    }

    public void remove(String extension) {
        applications.remove(extension);
    }

    public Set<String> getAllExtensions() {
        return applications.keySet();
    }

    public Collection<String> getAllApplications() {
        return applications.values();
    }
}
