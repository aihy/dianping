package ink.wzhy.dianping.controller;

import ink.wzhy.dianping.domain.CommentDO;
import ink.wzhy.dianping.service.CommentsService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RequestMapping("/api")
public class MainController {
    @Resource
    private CommentsService commentsService;

    @GetMapping("comments")
    public List<CommentDO> getComments() {
        return commentsService.getComments();
    }
}
