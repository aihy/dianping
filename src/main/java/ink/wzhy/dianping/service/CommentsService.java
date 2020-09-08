package ink.wzhy.dianping.service;

import ink.wzhy.dianping.dao.CommentsDAO;
import ink.wzhy.dianping.domain.CommentDO;
import ink.wzhy.dianping.dto.CommentDTO;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class CommentsService {
    @Resource
    private CommentsDAO commentsDAO;

    public List<CommentDO> getComments() {
        List<CommentDO> commentDOS = commentsDAO.getComments();
        return commentDOS;
    }

    public void insertComment(String comment) {
        commentsDAO.insertComment(comment);
    }
}
