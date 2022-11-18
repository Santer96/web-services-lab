package com.lab6.download;

import java.io.File;

public class SimpleDownloader implements Downloader {

    public File downloadFile(String fileName) {
        System.out.println(
                "SIMPLE DOWNLOADER CLASS LOG: Downloading file using simpleDownloader by fileName: " + fileName);
        return new File("/fileName");
    }
}
