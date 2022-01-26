package net.seehope.springboot.service;

import net.seehope.springboot.pojo.News;

import java.util.List;

public interface NewsService {
    void initMockData(int mockNumber);

    List<News> getAllNews();
}
