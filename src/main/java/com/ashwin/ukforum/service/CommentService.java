package com.ashwin.ukforum.service;

import java.util.List;
import java.util.Optional;

import com.ashwin.ukforum.model.Article;
import com.ashwin.ukforum.model.Comment;

public interface CommentService {
	
	// CREATE Comment
    public void addComment(Comment comment);
    
    // READ Comment
    public Comment getComment(Long commentId);
 
    // UPDATE Comment
    public Comment updateComment(Comment comment);
    
    // DELETE Comment
    public void deleteComment(Long commentId);
    
    // LIST Comments for a given Article
    public List<Comment> getAllCommentsByArticleId(Long articleId);
    
    // LIST Comments for a given User
    public List<Comment> getAllCommentsByUserId(Long userId); 
}
