package com.mytube;

public class SomeVideoEncoder implements VideoEncoder {
    @Override
    public void encode(Video video) {
        System.out.println("Video encoded!");
    }
}
