package com.lab2.fileManagement;

import java.io.File;

/**
 * Local System File Manager Singleton class
 */
public class LocalSystemFileManager implements FileManager {

    private static LocalSystemFileManager instance;

    private LocalSystemFileManager() {
        // private constructor
    }

    public static LocalSystemFileManager getInstance() {
        if (instance == null) {
            instance = new LocalSystemFileManager();
        }
        return instance;
    }

    public File downloadFile(String fileIdentifier) {
        // Mock behavior
        System.out.println("LOG: Downloading local file by identifier: " + fileIdentifier);
        return new File("somePath.txt");
    }

    public void uploadFile(String fileIdentifier, File file) {
        // Mock behavior
        System.out.println("LOG: Uploading local file with identifier: " + fileIdentifier + " and path " + file.getPath());
    }
}
