package ink.wzhy.dianping.dao;

import ink.wzhy.dianping.domain.CommentDO;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

import java.util.List;

@Mapper
public interface CommentsDAO {
    List<CommentDO> getComments();
    int insertComment(String comment);
}
