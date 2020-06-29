package com.designpattern.command;

public class CommentCommand implements Command {

    private Video video;
    
    public CommentCommand(Video video) {
        this.video = video;
    }
    
    public void execute() {
        video.commentOnVideo();
    }

}
