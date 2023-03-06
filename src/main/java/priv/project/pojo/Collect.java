package priv.project.pojo;

import com.baomidou.mybatisplus.annotation.*;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

/**
 * @Author 戴国亮
 * @Date 2022/2/9
 * @description 用户收藏表
 */
@Data
@TableName(value = "t_collect")
public class Collect {
    /**
     * 自增主键
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 对应用户ID
     */
    @TableField(value = "user_id")
    private Integer userId;

    /**
     * 对应攻略ID
     */
    @TableField(value = "strategy_id")
    private Integer strategyId;

    /**
     * 收藏时间
     */
    @TableField(value = "create_date", fill = FieldFill.INSERT)
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date createDate;

    /**
     * 对应攻略实体
     */
    @TableField(exist = false)
    private Strategy strategy;
}