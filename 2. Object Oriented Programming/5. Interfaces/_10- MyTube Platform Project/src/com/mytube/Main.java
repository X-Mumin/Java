package com.mytube;

public class Main {
    public static void main(String[] args) {
        Video video = new Video();
        VideoProcessor videoProcessor =
                new VideoProcessor(new SomeVideoEncoder(),
                        new SomeVideoDatabase(), new SomeEmailService());

        video.setFileName("birthday.mp4");
        video.setTitle("Jennifer's birthday");
        video.setUser("john@domain");

        videoProcessor.process(video);
    }
}
