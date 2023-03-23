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
@TableName("teacher_info")
public class TeacherInfo implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @TableField("is_first")
    private Integer isFirst;

    @TableField("is_prove")
    private Integer isProve;

    @TableField("lab")
    private String lab;

    @TableField("openid")
    private String openid;

    @TableField("role")
    private Integer role;

    @TableField("teacher_email")
    private String teacherEmail;

    @TableField("teacher_name")
    private String teacherName;

    @TableField("teacher_phone")
    private String teacherPhone;


}
