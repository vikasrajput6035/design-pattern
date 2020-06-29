package com.designpattern.command;

public class ShareCommand implements Command {

    private Video video;
    
    public ShareCommand(Video video) {
        this.video = video;
    }
    
    public void execute() {
        video.shareVideo();
    }

}
