package priv.project.pojo;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * @Author Mr.Wang
 * Layui树组件对应的实体bean
 */
@Data
public class LayuiTreeBean implements Serializable {

    /**
     * 属性选项 	    说明 	                                            类型 	        示例值
     * title 	    节点标题 	                                            String 	        未命名
     * id 	        节点唯一索引值，用于对指定节点进行各类操作 	                String/Number 	任意唯一的字符或数字
     * field 	    节点字段名 	                                        String 	        一般对应表字段名
     * children     子节点。支持设定选项同父节点 	                            Array 	        [{title: '子节点1', id: '111'}]
     * href 	    点击节点弹出新窗口对应的 url。需开启 isJump 参数 	        String 	        任意 URL
     * spread 	    节点是否初始展开，默认 false 	                        Boolean 	    true
     * checked 	    节点是否初始为选中状态（如果开启复选框的话），默认 false 	    Boolean 	    true
     * disabled 	节点是否为禁用状态。默认 false 	                        Boolean 	    false
     */

    private Integer id;

    private String title;

    private String field;

    private List<LayuiTreeBean> children;

    private String href;

    private Boolean spread;

    private Boolean checked;

    private Boolean disabled;
}
