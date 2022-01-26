package net.seehope.springboot.mapper;

import net.seehope.springboot.pojo.News;

/**
* 通用 Mapper 代码生成器
*
* @author mapper-generator
*/
public interface NewsMapper extends tk.mybatis.mapper.common.Mapper<News> {
    int insertNews(News news);
}




