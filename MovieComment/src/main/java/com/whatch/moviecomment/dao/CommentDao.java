package com.whatch.moviecomment.dao;

import com.whatch.moviecomment.model.Comment;

import java.util.List;

public interface CommentDao {
    public List<Comment> findByMovieId(int movieId);
    public Comment save(Comment comment);

}
