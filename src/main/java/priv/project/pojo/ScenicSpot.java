package priv.project.pojo;

import com.baomidou.mybatisplus.annotation.*;

import java.math.BigDecimal;
import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.springframework.format.annotation.DateTimeFormat;

/**
 * @Author 戴国亮
 * @Date 2022/2/9
 * @description 景区表
 */
@Getter
@Setter
@TableName(value = "t_scenic_spot")
public class ScenicSpot {
    /**
     * 自增主键
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 对应景区分类信息的ID
     */
    @TableField(value = "type_id")
    private Integer typeId;

    // 对应类型信息
    @TableField(exist = false)
    private ScenicType scenicType;

    /**
     * 对应所属区域信息的ID
     */
    @TableField(value = "area_id")
    private Integer areaId;

    // 对应区划信息
    @TableField(exist = false)
    private Area area;

    /**
     * 景区名
     */
    @TableField(value = "name")
    private String name;

    /**
     * 景区简介
     */
    @TableField(value = "readme")
    private String readme;

    /**
     * 营业开始时间
     */
    @TableField(value = "business_start_date")
    @JsonFormat(pattern = "HH:mm", timezone = "GMT+8")
    @DateTimeFormat(pattern = "HH:mm")
    private String businessStartDate;

    /**
     * 营业结束时间
     */
    @TableField(value = "business_end_date")
    @JsonFormat(pattern = "HH:mm", timezone = "GMT+8")
    @DateTimeFormat(pattern = "HH:mm")
    private String businessEndDate;

    /**
     * 票价
     */
    @TableField(value = "price")
    private String price;

    /**
     * 官方购票地址
     */
    @TableField(value = "skip_url")
    private String skipUrl;

    /**
     * 搜索关键字（多个关键字英文逗号分割）
     */
    @TableField(value = "search_keyword")
    private String searchKeyword;

    /**
     * 创建时间
     */
    @TableField(value = "create_date", fill = FieldFill.INSERT)
    @JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date createDate;

    /**
     * 是否是红色景区（0不是 1是）
     */
    @TableField(value = "is_red")
    private String isRed;

    /**
     * 景区图
     */
    @TableField(value = "head_img")
    private String headImg;

    /**
     * 是否首页推荐展示  0否 1是
     */
    @TableField(value = "is_index")
    private String isIndex;

    /**
     * 转换后的时间
     */
    @TableField(exist = false)
    private String createDateFormat;
}