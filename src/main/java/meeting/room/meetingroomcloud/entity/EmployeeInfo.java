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
@TableName("employee_info")
public class EmployeeInfo implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @TableField("company_name")
    private String companyName;

    @TableField("employee_name")
    private String employeeName;

    @TableField("employee_phone")
    private String employeePhone;

    @TableField("employee_email")
    private String employeeEmail;

    @TableField("employee_job")
    private String employeeJob;

    @TableField("open_id")
    private String openId;

    @TableField("is_prove")
    private Integer isProve;

    @TableField("is_first")
    private Integer isFirst;


}
