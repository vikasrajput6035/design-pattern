package com.designpattern.command;

public class LikeCommand implements Command {

    private Video video;
    
    public LikeCommand(Video video) {
        this.video = video;
    }
    
    public void execute() {
        video.likeVideo();
    }

}
