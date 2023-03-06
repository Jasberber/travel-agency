package priv.project.pojo;

import lombok.Data;

/**
 * 修改Admin时使用的实体类
 */
@Data
public class EditAdmin {

    /**
     * 原密码
     */
    private String password;

    /**
     * 新密码
     */
    private String newPassword;

    /**
     * 再次输入的新密码
     */
    private String rePassword;

}
