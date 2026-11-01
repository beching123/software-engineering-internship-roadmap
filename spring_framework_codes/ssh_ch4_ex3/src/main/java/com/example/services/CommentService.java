package com.example.services;

import com.example.model.Comment;
import com.example.proxies.CommentNotificationProxy;
import com.example.repositories.CommentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CommentService {

    @Autowired
    private CommentRepository commentRepository;

    @Autowired
    private CommentNotificationProxy commentNotificationProxy;

    /*public CommentService(CommentRepository commentRepository, CommentNotificationProxy commentNotificationProxy) {

        this.commentNotificationProxy = commentNotificationProxy;
        this.commentRepository = commentRepository;
    }*/

    public void publishComment(Comment comment) {
        commentRepository.storeComment(comment);
        commentNotificationProxy.sendComment(comment);
    }
}