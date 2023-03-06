package priv.project.pojo;

import com.baomidou.mybatisplus.annotation.*;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

/**
 * @Author 戴国亮
 * @Date 2022/2/9
 * @description 管理员表
 */
@Data
@TableName(value = "t_admin")
public class Admin {
    /**
     * 主键自增
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 管理员姓名
     */
    @TableField(value = "login_name")
    private String loginName;

    /**
     * 登录用户名
     */
    @TableField(value = "user_name")
    private String userName;

    /**
     * 密码（MD5加密）
     */
    @TableField(value = "password")
    private String password;

    /**
     * 创建时间
     */
    @TableField(value = "create_date")
    @JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date createDate;
}