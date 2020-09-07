package ink.wzhy.dianping.dto;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class CommentDTO {
    private String comment;
    private LocalDateTime dateTime;
}
