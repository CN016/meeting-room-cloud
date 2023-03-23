package meeting.room.meetingroomcloud.service.impl;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import meeting.room.meetingroomcloud.dao.RoomAppointInfoMapper;
import meeting.room.meetingroomcloud.entity.RoomAppointInfo;
import meeting.room.meetingroomcloud.service.AppointArrService;
import meeting.room.meetingroomcloud.service.ArrDetailService;
import meeting.room.meetingroomcloud.service.RoomAppointInfoService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.*;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author 016
 * @since 2023年03月20日
 */
@Service
public class RoomAppointInfoServiceImpl extends ServiceImpl<RoomAppointInfoMapper, RoomAppointInfo> implements RoomAppointInfoService {


    @Override
    public boolean addInfo(Map<String, Object> map, AppointArrService arrService, ArrDetailService detailService) {
        try {
            String roomId = (String) map.get("roomid");
            RoomAppointInfo info = getOne(roomId);
            if (info != null){
                return false;
            }
            info = new RoomAppointInfo();
            String openId = (String) map.get("openid");
            System.out.println(roomId);
            List<Object> listStr = (List<Object>) map.get("dateAppointInfo");
            Long arrId = arrService.saveArr(listStr,detailService);
            if (arrId == 0L ){
                return false;
            }
            info.setAppointArr(arrId);
            info.setRoomid(roomId);
            info.setOpenid(openId);
            info.setDate(LocalDateTime.now());
            save(info);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    @Override
    public boolean updateInfo(Map<String, Object> map, AppointArrService arrService, ArrDetailService detailService) {
        try {
            String roomId = (String) map.get("roomid");
            RoomAppointInfo info = getOne(roomId);
            if (info == null){
                return false;
            }
            List<Object> listStr = (List<Object>) map.get("dateAppointInfo");
            Long arrId = arrService.saveArr(listStr,detailService);
            if (arrId == 0L ){
                return false;
            }
            info.setAppointArr(arrId);
            info.setDate(LocalDateTime.now());
            QueryWrapper<RoomAppointInfo> wrapper = new QueryWrapper<>();
            wrapper.eq("roomid",roomId);
            update(info,wrapper);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    @Override
    public RoomAppointInfo getOne(String room_id) {
        return query().eq("roomid",room_id).one();
    }
}
