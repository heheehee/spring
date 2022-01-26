package net.seehope.springboot.web.controller;

import com.show.api.ShowApiRequest;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import net.seehope.springboot.pojo.vo.TestVo;
import net.seehope.springboot.service.NewsService;
import net.seehope.springboot.util.CovidProperties;
import net.seehope.springboot.util.JsonResult;
import net.seehope.springboot.util.ProjectProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/news")
@AllArgsConstructor
public class NewsController {
//    @GetMapping
//    public String sayHello(){
//        return "hello";
//    }
    private NewsService newsService;
    private ProjectProperties properties;

    @GetMapping("/init")
    public String initNews(int mockNumber) {
        newsService.initMockData(mockNumber);
        return "success";
    }
    @GetMapping
    public JsonResult getAllNews() {
        return JsonResult.ok(newsService.getAllNews());
    }

    @PostMapping("/test")
    public JsonResult test(@RequestBody TestVo vo){
        System.out.println(vo);
        return JsonResult.ok(vo);
    }

    @GetMapping("/covid")
    public JsonResult getCovidMsg(){
        CovidProperties covid_19API=properties.getShowapi().getCovid_19API();
        String res=new ShowApiRequest(covid_19API.getUrl(),covid_19API.getAppid(),covid_19API.getAppsecret()).post();
//        System.out.println(res);
        int a=1/0;
        return JsonResult.ok(res);

    }
}
