package priv.project.pojo;

import com.baomidou.mybatisplus.annotation.*;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

/**
 * @Author 戴国亮
 * @Date 2022/2/9
 * @description 用户表
 */
@Data
@TableName(value = "t_user")
public class User {
    /**
     * 主键自增
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 姓名
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
     * 用户年龄
     */
    @TableField(value = "age")
    private Integer age;

    /**
     * 用户性别（0女  1男）
     */
    @TableField(value = "sex")
    private String sex;

    /**
     * 用户头像
     */
    @TableField(value = "head_img")
    private String headImg;

    /**
     * 用户身份证号
     */
    @TableField(value = "id_card")
    private String idCard;

    /**
     * 用户生日
     */
    @TableField(value = "birthday")
    @JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date birthday;

    /**
     * 注册时间
     */
    @TableField(value = "create_date", fill = FieldFill.INSERT)
    @JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date createDate;
}