package com.dream.service;

import com.dream.po.Movie;

import java.util.List;




public interface AlsService {
    List<Movie> selectAlsMoviesByUserId(Integer userid);
}
