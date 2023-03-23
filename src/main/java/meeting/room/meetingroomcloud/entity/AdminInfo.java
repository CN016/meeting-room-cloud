package meeting.room.meetingroomcloud.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serial;
import java.io.Serializable;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

/**
 * <p>
 * 
 * </p>
 *
 * @author 016
 * @since 2023年03月20日
 */
@Getter
@Setter
@Accessors(chain = true)
@TableName("admin_info")
public class AdminInfo implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @TableField("avatar_url")
    private String avatarUrl;

    @TableField("nick_name")
    private String nickName;

    @TableField("password")
    private String password;

    @TableField("phone")
    private String phone;


}
