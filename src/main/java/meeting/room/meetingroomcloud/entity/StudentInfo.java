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
@TableName("student_info")
public class StudentInfo implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @TableField("isFirst")
    private Integer isFirst;

    @TableField("is_prove")
    private Integer isProve;

    @TableField("openid")
    private String openid;

    @TableField("role")
    private Integer role;

    @TableField("student_email")
    private String studentEmail;

    @TableField("student_lab")
    private String studentLab;

    @TableField("student_name")
    private String studentName;

    @TableField("student_number")
    private String studentNumber;

    @TableField("student_phone")
    private String studentPhone;

    @TableField("student_teacher")
    private String studentTeacher;


}
