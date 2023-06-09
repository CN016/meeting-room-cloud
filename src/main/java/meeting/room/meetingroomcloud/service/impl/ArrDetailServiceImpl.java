package meeting.room.meetingroomcloud.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import meeting.room.meetingroomcloud.dao.ArrDetailMapper;
import meeting.room.meetingroomcloud.entity.ArrDetail;
import meeting.room.meetingroomcloud.service.ArrDetailService;
import meeting.room.meetingroomcloud.utils.ID;
import meeting.room.meetingroomcloud.utils.StringToMap;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.LinkedList;
import java.util.List;
import java.util.Map;

@Service
public class ArrDetailServiceImpl extends ServiceImpl<ArrDetailMapper, ArrDetail> implements ArrDetailService {

    @Autowired
    private ArrDetailMapper mapper;

    @Override
    public Long saveDetail(List<Map<String,String>> detail) {
        try {
            Long id = ID.nextID();
                for (Map<String, String> stringStringMap : detail) {
                    ArrDetail detail1 = new ArrDetail();
                    detail1.setId(id);
                    detail1.setDetail(stringStringMap.toString());
                    save(detail1);
                }
            return id;
        } catch (Exception e) {
            e.printStackTrace();
            return 0L;
        }
    }

    @Override
    public List<Map<String, String>> getListById(Long detailId) throws Exception{
        QueryWrapper<ArrDetail> wrapper = new QueryWrapper<>();
        wrapper.eq("id",detailId);
        List<ArrDetail> arrDetails = mapper.selectList(wrapper);
        List<Map<String,String>> maps = new LinkedList<>();
        for (ArrDetail detail : arrDetails) {
            Map<String, String> map = StringToMap.parseString(detail.getDetail());
            maps.add(map);
        }
        return maps;
    }
}
