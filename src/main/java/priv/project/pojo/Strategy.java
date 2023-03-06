package priv.project.pojo;

import com.baomidou.mybatisplus.annotation.*;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

/**
 * @Author 戴国亮
 * @Date 2022/2/9
 * @description 旅行攻略表
 */
@Data
@TableName(value = "t_strategy")
public class Strategy {
    /**
     * 自增主键
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 发布用户的ID
     */
    @TableField(value = "user_id")
    private Integer userId;

    /**
     * 发布用户的类型 0代表用户  1代表管理员
     */
    @TableField(value = "user_type")
    private String userType;

    /**
     * 攻略标题
     */
    @TableField(value = "title")
    private String title;

    /**
     * 攻略首图（缩略图）
     */
    @TableField(value = "index_img")
    private String indexImg;

    /**
     * 攻略内容
     */
    @TableField(value = "content")
    private String content;

    /**
     * 攻略简述
     */
    @TableField(value = "resume")
    private String resume;

    /**
     * 发布时间
     */
    @TableField(value = "create_date", fill = FieldFill.INSERT)
    @JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date createDate;

    /**
     * 对应的发布用户的实体
     */
    @TableField(exist = false)
    private User user;

    /**
     * 转换后的日期
     */
    @TableField(exist = false)
    private String createDateFormat;
}