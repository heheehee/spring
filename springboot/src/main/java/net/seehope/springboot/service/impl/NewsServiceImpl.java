package net.seehope.springboot.service.impl;

import com.github.pagehelper.PageHelper;
import lombok.AllArgsConstructor;
import net.seehope.springboot.mapper.NewsMapper;
import net.seehope.springboot.pojo.News;
import net.seehope.springboot.service.NewsService;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.entity.Example;

import java.util.List;

@Service
@AllArgsConstructor
public class NewsServiceImpl implements NewsService {
    private NewsMapper newsMapper;

    @Override
    public void initMockData(int mockNumber) {
        for(int i=0;i<mockNumber;i++){
            News news=new News();
            news.setTitle("news"+1);
            news.setCover("https://img.36krcdn.com/20200410/v2_9c3331af67e64994aa97a27fffb1a380_img_png?x-oss-process=image/resize,m_mfit,w_520,h_300/crop,w_520,h_300,g_center");
            newsMapper.insertNews(news);
        }
    }

    @Override
    public List<News> getAllNews() {

        Example example = new Example(News.class);
        example.createCriteria().andLike("cover", "%v%");
        example.orderBy("id").desc();

        PageHelper.startPage(2, 10);

        return newsMapper.selectByExample(example);
    }
}
