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
@TableName("appoint_arr")
public class AppointArr implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;

    @TableField("id")
    private Long id;

    @TableField("detail")
    private Long detail;

    @TableField("status")
    private String status;

    @TableField("time")
    private String time;



}
