package com.example.demo.services;

import com.example.demo.aspect.ToLog;
import com.example.demo.comment.Comment;
import org.springframework.stereotype.Service;

import java.util.logging.Logger;

@Service
public class CommentService {

    private final Logger logger = Logger.getLogger(CommentService.class.getName());

    public void publishComment(Comment comment) {
        logger.info("Publishing comment:" + comment.getText());
       // return "SUCCESS"; A ssh_ch6_ex2
    }

    @ToLog
    public void deleteComment(Comment comment) {
        logger.info("Deleting comment: " + comment.getText());
    }

    public  void editComment(Comment comment) {
        logger.info("Editing comment:" + comment.getText());
    }
}
