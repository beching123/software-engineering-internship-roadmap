package com.example.demo.main;

import com.example.demo.comment.Comment;
import com.example.demo.config.ProjectConfig;
import com.example.demo.services.CommentService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.logging.Logger;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    private static Logger logger = Logger.getLogger(Main.class.getName());

    static void main() {

        var c = new AnnotationConfigApplicationContext(ProjectConfig.class);

        var service = c.getBean(CommentService.class);

        Comment comment = new Comment();
        comment.setText("Demo comment");
        comment.setAuthor("Natasha");

        service.publishComment(comment);

        //  logger.info(value);
        service.deleteComment(comment);
    }
}
