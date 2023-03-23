package meeting.room.meetingroomcloud.service.impl;


import meeting.room.meetingroomcloud.dao.EmployeeInfoMapper;
import meeting.room.meetingroomcloud.entity.EmployeeInfo;
import meeting.room.meetingroomcloud.service.EmployeeInfoService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author 016
 * @since 2023年03月20日
 */
@Service
public class EmployeeInfoServiceImpl extends ServiceImpl<EmployeeInfoMapper, EmployeeInfo> implements EmployeeInfoService {

    @Override
    public EmployeeInfo getByOpenid(String openid) {
       return query().eq("open_id",openid).one();
    }
}
