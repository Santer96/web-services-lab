package com.lab9;

import com.lab9.api.ApiConnector;
import com.lab9.api.YoutubeApiConnector;
import com.lab9.converter.AviConverter;
import com.lab9.converter.MovConverter;
import com.lab9.converter.Mp4Converter;
import com.lab9.converter.VideoConverter;
import com.lab9.facade.MasterFacade;
import com.lab9.facade.MasterFacadeImpl;

public class Main {
    public static void main(String[] args) {
        VideoConverter aviConverter = new AviConverter();
        VideoConverter movConverter = new MovConverter();
        Mp4Converter mp4Converter = new Mp4Converter();
        ApiConnector apiConnector = new YoutubeApiConnector();

        MasterFacade masterFacade = new MasterFacadeImpl(aviConverter, movConverter, mp4Converter, apiConnector);

        masterFacade.convertVideo("myCat.mp4", "/some/file/path/myCat.mp4");
        masterFacade.convertVideo("javaTutorial.mov", "/some/file/path/javaTutorial.mov");
        masterFacade.convertVideo("music.avi", "/some/file/path/music.avi");
        masterFacade.convertVideo("meme.gif", "/some/file/path/meme.gif");
        masterFacade.doQuery("youtube.com/myChannel", "somekey123", "getSubscribersCount");
//        OUTPUT:
//        Converting MP4 video file /some/file/path/myCat.mp4
//        Converting MOV video file /some/file/path/javaTutorial.mov
//        Converting AVI video file /some/file/path/music.avi
//        Unsupported videoFormat gif
//        QUERY 'getSubscribersCount' to youtube.com/myChannel with API key 'somekey123'
    }
}
