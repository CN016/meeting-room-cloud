package meeting.room.meetingroomcloud.service;


import com.baomidou.mybatisplus.extension.service.IService;
import meeting.room.meetingroomcloud.entity.RoomAppointInfo;

import java.time.LocalDateTime;
import java.util.List;
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

    List<Object> getAppointInfoList (String roomid,AppointArrService arrService, ArrDetailService detailService) throws Exception;

    List<Object> getAppointInfoListByTime (LocalDateTime time, AppointArrService arrService, ArrDetailService detailService) throws Exception;

    RoomAppointInfo getOneByTime(LocalDateTime time);

    RoomAppointInfo getOne(String room_id);
}
