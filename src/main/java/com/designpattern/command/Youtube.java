package com.designpattern.command;

public class Youtube {

    private Command likeCommand;
    private Command shareCommand;
    private Command commentCommand;
    
    public Youtube() {
        
    }

    void setCommand(Command like,Command share,Command comment) {
        this.likeCommand = like;
        this.shareCommand = share;
        this.commentCommand = comment;
    }
    
    void likeVideo() {
        this.likeCommand.execute();
    }
    
    void directShareVideo() {
        this.shareCommand.execute();
    }
    
    void commentVideo() {
        this.commentCommand.execute();
    }
    
    void shareWithCommentVideo() {
        this.commentCommand.execute();
        this.shareCommand.execute();
    }
}
