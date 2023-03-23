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
@TableName("room_info")
public class RoomInfo implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @TableField("roomid")
    private Integer roomid;

    @TableField("room_cover_img")
    private String roomCoverImg;

    @TableField("file_id")
    private String fileId;

    @TableField("room_people")
    private String roomPeople;

    @TableField("room_type")
    private String roomType;

    @TableField("room_name")
    private String roomName;

    @TableField("room_contact_phone")
    private String roomContactPhone;

    @TableField("room_contact_name")
    private String roomContactName;

    @TableField("room_brief_info")
    private String roomBriefInfo;


}
