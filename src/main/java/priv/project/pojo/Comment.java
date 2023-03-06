package priv.project.pojo;

import com.baomidou.mybatisplus.annotation.*;

import java.util.Date;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

/**
 * @Author 戴国亮
 * @Date 2022/2/9
 * @description 评论表
 */
@Data
@TableName(value = "t_comment")
public class Comment {
    /**
     * 自增主键
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 评论人
     */
    @TableField(value = "user_id")
    private Integer userId;

    /**
     * 对应的攻略ID
     */
    @TableField(value = "strategy_id")
    private Integer strategyId;

    /**
     * 父级评论ID
     */
    @TableField(value = "comment_id")
    private Integer commentId;

    /**
     * 评论内容
     */
    @TableField(value = "content")
    private String content;

    /**
     * 评论时间
     */
    @TableField(value = "create_date", fill = FieldFill.INSERT)
    @JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date createDate;

    /**
     * 对应的用户实体
     */
    @TableField(exist = false)
    private User user;

    /**
     * 对应的攻略实体
     */
    @TableField(exist = false)
    private Strategy strategy;

    /**
     * 日期字符串
     */
    @TableField(exist = false)
    private String createDateFormat;

    /**
     * 对应的评论下的回复
     */
    @TableField(exist = false)
    private List<Comment> subComments;
}