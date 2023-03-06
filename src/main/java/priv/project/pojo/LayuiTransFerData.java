package priv.project.pojo;

import lombok.Data;

/**
 * @Author Mr.Wang
 * Layui穿梭框组件的属性参数封装
 */
@Data
public class LayuiTransFerData {

    /**
     * 数据值(推荐绑定数据库中数据的唯一ID)
     */
    private String value;

    /**
     * 数据标题(展示的内容)
     */
    private String title;

    /**
     * 是否开启选择框
     */
    private boolean checked;

    /**
     * 是否禁用选择
     */
    private boolean disabled;

}
