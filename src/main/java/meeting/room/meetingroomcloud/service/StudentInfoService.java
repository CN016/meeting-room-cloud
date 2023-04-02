package meeting.room.meetingroomcloud.service;


import com.baomidou.mybatisplus.extension.service.IService;
import meeting.room.meetingroomcloud.entity.StudentInfo;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author 016
 * @since 2023年03月20日
 */
public interface StudentInfoService extends IService<StudentInfo> {
    Boolean deleteStudentByOpenid(String openid);

    StudentInfo getStudentInfo(String openid);

    List<StudentInfo> getList();

    boolean updateStudent(String openid, Integer isProve );

}
