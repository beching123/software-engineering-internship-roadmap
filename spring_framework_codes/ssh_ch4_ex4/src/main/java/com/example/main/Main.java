package com.example.main;

import com.example.config.ProjectConfiguration;
import com.example.model.Comment;
import com.example.proxies.EmailCommentNotificationProxy;
import com.example.repositories.DBCommentRepository;
import com.example.services.CommentService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {
        var context = new AnnotationConfigApplicationContext(ProjectConfiguration.class);

        var comment = new Comment();
        comment.setAuthor("Laurentiu");
        comment.setText("Demo comment");

        var commentService = context.getBean(CommentService.class
        );
        commentService.publishComment(comment);
    }
}
