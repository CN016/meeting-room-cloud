package meeting.room.meetingroomcloud.service.impl;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.conditions.update.UpdateWrapper;
import meeting.room.meetingroomcloud.dao.TeacherInfoMapper;
import meeting.room.meetingroomcloud.entity.TeacherInfo;
import meeting.room.meetingroomcloud.service.TeacherInfoService;
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
public class TeacherInfoServiceImpl extends ServiceImpl<TeacherInfoMapper, TeacherInfo> implements TeacherInfoService {

    @Autowired
    private TeacherInfoMapper mapper;

    @Override
    public TeacherInfo getTeacherByOpenid(String openid) {
        return query().eq("openid",openid).one();
    }

    @Override
    public boolean deleteTeacherByOpenid(String openid) {
        QueryWrapper<TeacherInfo> wrapper = new QueryWrapper<>();
        wrapper.eq("openid",openid);
        return mapper.delete(wrapper) > 0;
    }

    @Override
    public List<TeacherInfo> getList() {
        return mapper.selectList(null);
    }

    @Override
    public boolean updateTeacher(String openid, Integer isProve) {
        UpdateWrapper<TeacherInfo> wrapper = new UpdateWrapper<>();
        wrapper.eq("openid",openid).set("isProve",isProve);
        return update(wrapper);
    }
}
