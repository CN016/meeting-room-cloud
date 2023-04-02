package meeting.room.meetingroomcloud.service;


import com.baomidou.mybatisplus.extension.service.IService;
import meeting.room.meetingroomcloud.entity.StudentInfo;
import meeting.room.meetingroomcloud.entity.TeacherInfo;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author 016
 * @since 2023年03月20日
 */
public interface TeacherInfoService extends IService<TeacherInfo> {
    TeacherInfo getTeacherByOpenid(String openid);

    boolean deleteTeacherByOpenid(String openid);

    List<TeacherInfo> getList();

    boolean updateTeacher(String openid, Integer isProve);
}
