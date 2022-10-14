package com.lab2;

import com.lab2.entity.User;
import com.lab2.fileManagement.AmazonCloudFileManager;
import com.lab2.fileManagement.LocalSystemFileManager;

import java.io.File;

public class Main {

    public static void main(String[] args) {
        // Check that local system file manager returns the same instance
        User u1LocalFM = new User(1L, "Bob", LocalSystemFileManager.getInstance());
        User u2LocalFM = new User(2L, "Daive", LocalSystemFileManager.getInstance());

        boolean isTheSameLocalFMInstance = u1LocalFM.getFileManager() == u2LocalFM.getFileManager();
        System.out.println("Is the same local file manager instance: " + isTheSameLocalFMInstance);

        // Check that local system file manager returns the same instance
        User u1CloudFM = new User(3L, "Will", AmazonCloudFileManager.getInstance());
        User u2CloudFM = new User(4L, "Tom", AmazonCloudFileManager.getInstance());

        boolean isTheSameAmazonFMInstance = u1CloudFM.getFileManager() == u2CloudFM.getFileManager();
        System.out.println("Is the same amazon file manager instance: " + isTheSameAmazonFMInstance);

        // Call some methods
        File file = u1LocalFM.getFileManager().downloadFile("someFileIdentifier");
        u2CloudFM.getFileManager().uploadFile("cloudFileID", file);

//        OUTPUT
//        Is the same local file manager instance: true
//        Is the same amazon file manager instance: true
//        LOG: Downloading local file by identifier: someFileIdentifier
//        LOG: Uploading file to Amazon S3 with identifier: cloudFileID and path somePath.txt
    }
}
