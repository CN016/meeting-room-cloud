package meeting.room.meetingroomcloud.service;


import com.baomidou.mybatisplus.extension.service.IService;
import meeting.room.meetingroomcloud.entity.AppointArr;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author 016
 * @since 2023年03月20日
 */
public interface AppointArrService extends IService<AppointArr> {
    Long saveArr(List<Object> listStr, ArrDetailService detailService);

    List<Object> getList(Long arrId,ArrDetailService detailService) throws Exception;
//    boolean updateArr(List<Object> listStr, ArrDetailService detailService , Long arrID);
}
