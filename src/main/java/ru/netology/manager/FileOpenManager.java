package ru.netology.manager;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


import javax.lang.model.element.Name;
import java.lang.annotation.Native;
import java.security.Key;
import java.util.HashMap;
import java.util.Map;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class FileOpenManager {
    private Map<String, String> applications = new HashMap<>();

    public void add(String extension, String name){
        applications.put( ".html","Google Chrome");
    }

    public void getByExtension(String name){
        for (){
        if (getByExtension();)
        }
    }

    public void remove(String extension, String name){
        applications.remove(extension);
    }

    public void getAllWithValue(String extension, String name){
      if (extension.equalsIgnoreCase(applications.get(name))){
          applications.get(extension);
      }
    }

    public void getAll(String extension){
            applications.get(extension);
        }
    }

