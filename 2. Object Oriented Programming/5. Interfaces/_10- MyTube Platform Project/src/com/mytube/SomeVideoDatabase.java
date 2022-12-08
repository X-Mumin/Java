package com.mytube;

public class SomeVideoDatabase implements VideoDatabase {
    @Override
    public void store(Video video) {
        System.out.println("Video stored!");
    }
}
