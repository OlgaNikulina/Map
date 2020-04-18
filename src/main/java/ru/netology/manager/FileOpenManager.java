package ru.netology.manager;

import lombok.Value;

import java.security.Key;
import java.util.Map;
import java.util.Objects;

import static javafx.scene.input.KeyCode.V;

public class FileOpenManager {

    public void put(K key, V value){
    }

    public void putAll(Map<? extends K,? extends V> m){

    }

    public void getName(Object key){

    }

    public void removeConnection(Object key, Object value){
        if (map.containsKey(key) && Objects.equals(map.get(key), value)) {
            map.remove(key);
            return true;
        } else
            return false;

    }

    public void getAllRegistered(){

    }

    public void getAll(){

    }
}
