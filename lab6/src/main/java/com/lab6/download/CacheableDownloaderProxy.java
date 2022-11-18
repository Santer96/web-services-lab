package com.lab6.download;

import java.io.File;
import java.util.HashMap;
import java.util.Map;

public class CacheableDownloaderProxy implements Downloader {

    private final Downloader proxyDownloader;
    private final Map<String, File> cachedFiles;

    public CacheableDownloaderProxy(Downloader proxyDownloader) {
        this.proxyDownloader = proxyDownloader;
        cachedFiles = new HashMap<String, File>();
    }

    public File downloadFile(String fileName) {
        File resultFile;
        if (cachedFiles.containsKey(fileName)) {
            System.out.println("PROXY CLASS LOG: Getting file from cache: " + fileName);
            resultFile = cachedFiles.get(fileName);
        } else {
            System.out.println("PROXY CLASS LOG: File '"
                            + fileName + "' isn't cached yet. Call proxy object method and put file into cache...");
            resultFile = proxyDownloader.downloadFile(fileName);
            cachedFiles.put(fileName, resultFile);
        }
        return resultFile;
    }
}
