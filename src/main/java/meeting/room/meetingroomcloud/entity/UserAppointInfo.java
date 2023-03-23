package meeting.room.meetingroomcloud.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serial;
import java.io.Serializable;
import java.time.LocalDateTime;
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
@TableName("user_appoint_info")
public class UserAppointInfo implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @TableField("openid")
    private String openid;

    @TableField("apply_time")
    private LocalDateTime applyTime;

    @TableField("appoint_name")
    private String appointName;

    @TableField("appoint_phone")
    private String appointPhone;

    @TableField("create_time")
    private LocalDateTime createTime;

    @TableField("handle_time")
    private LocalDateTime handleTime;

    @TableField("is_agree")
    private Integer isAgree;

    @TableField("reject_reason")
    private String rejectReason;

    @TableField("room_password")
    private String roomPassword;

    @TableField("roomid")
    private String roomid;

    @TableField("things_text")
    private String thingsText;

    @TableField("time")
    private String time;


}
