package com.lab6;

import com.lab6.download.CacheableDownloaderProxy;
import com.lab6.download.Downloader;
import com.lab6.download.SimpleDownloader;

import java.io.File;

public class Demo {

    public static void main(String[] args) {
        Downloader simpleDownloader = new SimpleDownloader();
        Downloader cacheableDownloader = new CacheableDownloaderProxy(simpleDownloader);

        File file1 = cacheableDownloader.downloadFile("some-file-name-1");
        File file2 = cacheableDownloader.downloadFile("some-file-name-1");

        File file3 = cacheableDownloader.downloadFile("some-file-name-2");
        File file4 = cacheableDownloader.downloadFile("some-file-name-2");

//        LOGS:
//        PROXY CLASS LOG: File 'some-file-name-1' isn't cached yet. Call proxy object method and put file into cache...
//        SIMPLE DOWNLOADER CLASS LOG: Downloading file using simpleDownloader by fileName: some-file-name-1
//        PROXY CLASS LOG: Getting file from cache: some-file-name-1
//        PROXY CLASS LOG: File 'some-file-name-2' isn't cached yet. Call proxy object method and put file into cache...
//        SIMPLE DOWNLOADER CLASS LOG: Downloading file using simpleDownloader by fileName: some-file-name-2
//        PROXY CLASS LOG: Getting file from cache: some-file-name-2
    }
}
