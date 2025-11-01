package com.cloudintegration.misc.services;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import java.nio.file.Paths;

@Component
public class S3UploadRunner implements CommandLineRunner {

    private final S3Service s3Service;

    public S3UploadRunner(S3Service s3Service) {
        this.s3Service = s3Service;
    }

    @Override
    public void run(String... args) {
        s3Service.uploadFile("boot-bucket-09", "uploads/test.txt", Paths.get("src/main/resources/static/test.jpg"));
        System.out.println("✅ File uploaded successfully!");
    }
}
