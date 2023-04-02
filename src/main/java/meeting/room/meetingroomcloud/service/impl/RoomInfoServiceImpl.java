package meeting.room.meetingroomcloud.service.impl;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import meeting.room.meetingroomcloud.dao.RoomInfoMapper;
import meeting.room.meetingroomcloud.entity.RoomInfo;
import meeting.room.meetingroomcloud.service.RoomInfoService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author 016
 * @since 2023年03月20日
 */
@Service
public class RoomInfoServiceImpl extends ServiceImpl<RoomInfoMapper, RoomInfo> implements RoomInfoService {

    @Autowired
    private RoomInfoMapper mapper;

    @Override
    public RoomInfo getRoomById(Integer id) {
        return query().eq("roomid",id).one();
    }

    @Override
    public boolean deleteRoomById(Integer roomId) {
        QueryWrapper<RoomInfo> wrapper = new QueryWrapper<>();
        wrapper.eq("roomid",roomId);
        return mapper.delete(wrapper) > 0 ;
    }

    @Override
    public List<RoomInfo> getList() {
        return mapper.selectList(null);
    }
}
