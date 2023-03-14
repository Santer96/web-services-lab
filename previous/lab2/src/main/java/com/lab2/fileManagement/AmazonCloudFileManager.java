package com.lab2.fileManagement;

import java.io.File;

/**
 * Amazon Cloud File Manager Singleton class
 */
public class AmazonCloudFileManager implements FileManager {

    private static AmazonCloudFileManager instance;

    private AmazonCloudFileManager() {
        // private constructor
    }

    public static AmazonCloudFileManager getInstance() {
        if (instance == null) {
            instance = new AmazonCloudFileManager();
        }
        return instance;
    }

    public File downloadFile(String fileIdentifier) {
        // Mock behavior
        System.out.println("LOG: Downloading file from Amazon S3 by identifier: " + fileIdentifier);
        return new File("somePath.txt");
    }

    public void uploadFile(String fileIdentifier, File file) {
        // Mock behavior
        System.out.println("LOG: Uploading file to Amazon S3 with identifier: " + fileIdentifier + " and path " + file.getPath());
    }
}
