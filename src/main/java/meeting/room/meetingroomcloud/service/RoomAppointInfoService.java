package meeting.room.meetingroomcloud.service;


import com.baomidou.mybatisplus.extension.service.IService;
import meeting.room.meetingroomcloud.entity.RoomAppointInfo;

import java.util.Map;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author 016
 * @since 2023年03月20日
 */
public interface RoomAppointInfoService extends IService<RoomAppointInfo> {

    boolean addInfo(Map<String, Object> map,AppointArrService arrService,ArrDetailService detailService);

    boolean updateInfo(Map<String, Object> map,AppointArrService arrService,ArrDetailService detailService);

    RoomAppointInfo getOne(String room_id);
}
