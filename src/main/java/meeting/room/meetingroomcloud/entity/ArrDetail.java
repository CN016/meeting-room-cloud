package meeting.room.meetingroomcloud.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName("arr_detail")
public class ArrDetail {

    @TableField("id")
    private Long id;

    @TableField("detail")
    private String detail;
}
