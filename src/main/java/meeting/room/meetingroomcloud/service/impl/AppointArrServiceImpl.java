package meeting.room.meetingroomcloud.service.impl;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import meeting.room.meetingroomcloud.dao.AppointArrMapper;
import meeting.room.meetingroomcloud.entity.AppointArr;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import meeting.room.meetingroomcloud.service.AppointArrService;
import meeting.room.meetingroomcloud.service.ArrDetailService;
import meeting.room.meetingroomcloud.utils.StringToMap;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author 016
 * @since 2023年03月20日
 */
@Service
public class AppointArrServiceImpl extends ServiceImpl<AppointArrMapper, AppointArr> implements AppointArrService {

    @Autowired
    private AppointArrMapper mapper;

    @Override
    public Long saveArr(List<Object> listStr , ArrDetailService detailService) {
        try {
            Long ID = meeting.room.meetingroomcloud.utils.ID.nextID();
            for (Object o : listStr) {
                AppointArr appointArr = new AppointArr();
                appointArr.setId(ID);
                Map<String,Object> t = (Map<String ,Object>) o;
                List<Map<String,String>> detail = (List<Map<String,String>>) t.get("detail");
                Long detailID = detailService.saveDetail(detail);
                if (detailID == 0L){
                    return 0L;
                }
                appointArr.setDetail(detailID);
                Map<String,String> timeMap = (Map<String, String>) t.get("time");
                appointArr.setTime(timeMap.toString());
                String status = (String) t.get("status");
                appointArr.setStatus(status);
                save(appointArr);
            }
            return ID;
        } catch (Exception e) {
            e.printStackTrace();
            return 0L;
        }
    }

    @Override
    public List<Object> getList(Long arrId, ArrDetailService detailService) throws Exception{
        QueryWrapper<AppointArr> wrapper = new QueryWrapper<>();
        wrapper.eq("id",arrId);
        List<AppointArr> appointArrs = mapper.selectList(wrapper);
        List<Object> list = new LinkedList<>();
        for (AppointArr appoint : appointArrs) {
            Map<String,Object> map = new HashMap<>();
            Long detailId = appoint.getDetail();
            List<Map<String,String>> detailList = detailService.getListById(detailId);
            map.put("detail",detailList);
            map.put("time", StringToMap.parseString(appoint.getTime()));
            map.put("status",appoint.getStatus());
            list.add(map);
        }
        return list;
    }

//    @Override
//    public boolean updateArr(List<Object> listStr, ArrDetailService detailService, Long arrID) {
//        for (Object o : listStr) {
//            AppointArr appointArr = new AppointArr();
//            appointArr.setId(arrID);
//            Map<String,Object> t = (Map<String ,Object>) o;
//            List<Map<String,String>> detail = (List<Map<String,String>>) t.get("detail");
//            Long detailID = detailService.saveDetail(detail);
//            if (detailID == 0L){
//                return 0L;
//            }
//            appointArr.setDetail(detailID);
//            Map<String,String> timeMap = (Map<String, String>) t.get("time");
//            appointArr.setTime(timeMap.toString());
//            String status = (String) t.get("status");
//            appointArr.setStatus(status);
//            save(appointArr);
//        }
//    }
}
