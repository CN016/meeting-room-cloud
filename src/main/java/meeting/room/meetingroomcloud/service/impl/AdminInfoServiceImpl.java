package meeting.room.meetingroomcloud.service.impl;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import meeting.room.meetingroomcloud.dao.AdminInfoMapper;
import meeting.room.meetingroomcloud.entity.AdminInfo;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import meeting.room.meetingroomcloud.service.AdminInfoService;
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
public class AdminInfoServiceImpl extends ServiceImpl<AdminInfoMapper, AdminInfo> implements AdminInfoService {

    @Override
    public AdminInfo getByPhoneAndPasswd(String phone, String passwd) {
        QueryWrapper<AdminInfo> wrapper = new QueryWrapper<>();
        wrapper.eq("password",passwd).eq("phone",phone);
        return getOne(wrapper);
    }
}
