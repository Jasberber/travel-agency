package priv.project.pojo;

import com.baomidou.mybatisplus.annotation.*;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

/**
 * @Author 戴国亮
 * @Date 2022/2/9
 * @description 省份城市表
 */
@Data
@TableName(value = "t_area")
public class Area {
    /**
     * 主键自增
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 所属省份ID
     */
    @TableField(value = "province_id")
    private Integer provinceId;

    /**
     * 所属省份
     */
    @TableField(exist = false)
    private String provinceName;

    /**
     * 区划名字
     */
    @TableField(value = "area_name")
    private String areaName;

    /**
     * 创建时间
     */
    @TableField(value = "create_date", fill = FieldFill.INSERT)
    @JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date createDate;

    /**
     * 是否是一级省份（0不是 1是）
     */
    @TableField(value = "is_parent")
    private String isParent;
}