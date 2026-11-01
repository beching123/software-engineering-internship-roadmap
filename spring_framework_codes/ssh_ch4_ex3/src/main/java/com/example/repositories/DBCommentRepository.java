package com.example.repositories;

import com.example.model.Comment;
import org.springframework.stereotype.Component;

@Component // first part of the exercise ssh_ch4_ex2
public class DBCommentRepository implements CommentRepository {

    @Override
    public void storeComment(Comment comment) {
        System.out.println("String comment: " + comment.getText());
    }
}
