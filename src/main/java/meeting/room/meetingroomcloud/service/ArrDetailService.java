package meeting.room.meetingroomcloud.service;

import com.baomidou.mybatisplus.extension.service.IService;
import meeting.room.meetingroomcloud.entity.ArrDetail;

import java.util.List;
import java.util.Map;


public interface ArrDetailService extends IService<ArrDetail> {

    Long saveDetail(List<Map<String,String>> detail);
}
