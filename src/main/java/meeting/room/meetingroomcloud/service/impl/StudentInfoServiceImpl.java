package meeting.room.meetingroomcloud.service.impl;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.conditions.update.UpdateWrapper;
import meeting.room.meetingroomcloud.dao.StudentInfoMapper;
import meeting.room.meetingroomcloud.entity.StudentInfo;
import meeting.room.meetingroomcloud.service.StudentInfoService;
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
public class StudentInfoServiceImpl extends ServiceImpl<StudentInfoMapper, StudentInfo> implements StudentInfoService {

    @Autowired
    private StudentInfoMapper mapper;

    @Override
    public Boolean deleteStudentByOpenid(String openid) {
        QueryWrapper<StudentInfo> wrapper = new QueryWrapper<>();
        wrapper.eq("openid",openid);
        return mapper.delete(wrapper) > 0 ;
    }

    @Override
    public StudentInfo getStudentInfo(String openid) {
        QueryWrapper<StudentInfo> wrapper = new QueryWrapper<>();
        wrapper.eq("openid",openid);
        return getOne(wrapper);
    }

    @Override
    public List<StudentInfo> getList() {
        return mapper.selectList(null);
    }

    @Override
    public boolean updateStudent(String openid, Integer isProve) {
        UpdateWrapper<StudentInfo> wrapper = new UpdateWrapper<>();
        wrapper.eq("openid",openid).set("isProve",isProve);
        return update(wrapper);

    }
}
