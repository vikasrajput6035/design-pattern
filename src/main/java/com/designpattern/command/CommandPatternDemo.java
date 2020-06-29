package com.designpattern.command;

public class CommandPatternDemo {

    public static void main(String[] args) {
        Video video = new Video();
        Command like = new LikeCommand(video);
        Command share = new ShareCommand(video);
        Command comment = new CommentCommand(video);
        
        Youtube youtube = new Youtube();
        youtube.setCommand(like, share, comment);
        youtube.likeVideo();
        youtube.commentVideo();
        youtube.directShareVideo();
    }
}
