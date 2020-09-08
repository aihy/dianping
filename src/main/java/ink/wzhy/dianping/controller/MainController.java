package ink.wzhy.dianping.controller;

import ink.wzhy.dianping.domain.CommentDO;
import ink.wzhy.dianping.service.CommentsService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/api")
public class MainController {
    @Resource
    private CommentsService commentsService;

    @GetMapping("comments")
    public List<CommentDO> getComments() {
        return commentsService.getComments();
    }

    @PostMapping("comment")
    public String insertComment(@RequestBody CommentDO comment) {
        commentsService.insertComment(comment);
        return comment.getComment();
    }
}
