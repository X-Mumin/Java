package com.mytube;

public class VideoProcessor {
    private VideoEncoder Encoder;
    private VideoDatabase Database;
    private EmailService emailService;

    public VideoProcessor(VideoEncoder encoder, VideoDatabase database,
                          EmailService emailService) {
        Encoder = encoder;
        Database = database;
        this.emailService = emailService;
    }

    public void process(Video video) {

        Encoder.encode(video);

        Database.store(video);

        emailService.sendEmail(video.getUser());
    }
}
