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
    private Map<String, String> applications = new HashMap<>(Locale.getDefault());

        public void add(String extension, String name) {
        applications.put(extension, name);
    }

    public void getByExtension() {
        applications.get(".html");
    }

    public void remove(String extension) {
        applications.remove(extension);
    }

    public Set<String> getAllExtensions(String extension) {
        return applications.keySet();
    }

    public Collection<String> getAllApplications(String name) {
           return applications.values();
    }
}
