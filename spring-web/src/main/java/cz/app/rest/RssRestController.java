package cz.app.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cz.app.rss.BbcRssService;

@RestController
@RequestMapping("/api/rss")
public class RssRestController {

    @Autowired
    private BbcRssService bbcRssService;
    
	@GetMapping("/headlines")
    public List<String> getBbcHeadlines() {
        return bbcRssService.fetchHeadlines();
    }
}