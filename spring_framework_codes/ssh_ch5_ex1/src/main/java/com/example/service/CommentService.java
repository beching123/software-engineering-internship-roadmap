package com.example.service;

import com.example.processor.CommentProcessor;
import com.example.repository.CommentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;

import javax.xml.stream.events.Comment;

@Service
@Lazy
public class CommentService {


    @Autowired
    private ApplicationContext context;
    //private final CommentRepository commentRepository;

    //  public CommentService() {
    //    System.out.println("CommentService instance created!");
    //}

//    public CommentRepository getCommentRepository() {
    //      return commentRepository;
    //}

    //@Autowired
    //private CommentRepository commentRepository;

    //public CommentRepository getCommentRepository() {
      //  return commentRepository;
    //}


    public  void sendComment(Comment c) {
        CommentProcessor p = context.getBean(CommentProcessor.class);

        p.setComment(c);
        p.processComment(c);
        p.validateComment(c);

        c = p.getComment();
        // do something further
    }



}
