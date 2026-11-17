package com.example.main;

import com.example.config.ProjectConfig;
import com.example.service.CommentService;
import com.example.service.UserService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {

        /*var c = new AnnotationConfigApplicationContext(ProjectConfig.class);

        var cs1 = c.getBean("commentService", CommentService.class);
        var cs2 = c.getBean("commentService", CommentService.class);

        boolean b1 = cs1 == cs2;
        IO.println(b1);*/

        var c = new AnnotationConfigApplicationContext(ProjectConfig.class);

        // System.out.println("Before retrieving the CommentService");
        //var service = c.getBean(CommentService.class);
        //ystem.out.println("After retrieving the CommentService");

        var cs1 = c.getBean(CommentService.class);
        var cs2 = c.getBean(UserService.class);

        boolean b1 = cs1.getCommentRepository() == cs2.getCommentRepository();

        System.out.println(b1);
    }
}
