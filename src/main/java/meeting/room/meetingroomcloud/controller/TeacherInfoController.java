package meeting.room.meetingroomcloud.controller;


import com.baomidou.mybatisplus.core.conditions.update.UpdateWrapper;
import meeting.room.meetingroomcloud.entity.TeacherInfo;
import meeting.room.meetingroomcloud.service.TeacherInfoService;
import meeting.room.meetingroomcloud.utils.CommonResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author 016
 * @since 2023年03月20日
 */
@RestController
@RequestMapping("/teacherInfo")
public class TeacherInfoController {

    @Autowired
    private TeacherInfoService infoService;

    /**
     * 添加老师信息
     * @param teacher 老师对象
     * @return 结果
     */
    @RequestMapping(value = "" ,method = RequestMethod.POST)
    @ResponseBody
    public CommonResult<String> addTeacher(@RequestBody TeacherInfo teacher){
        if (infoService.getTeacherByOpenid(teacher.getOpenid()) != null){
            return CommonResult.failed("exist");
        }
        try {
            if (!infoService.save(teacher)) {
                return CommonResult.failed();
            }
        } catch (Exception e) {
            e.printStackTrace();
            return CommonResult.failed();
        }
        return CommonResult.success(null);
    }

    /**
     * 修改老师信息
     * @param teacher 老师对象
     * @return 结果
     */
    @RequestMapping(value = "",method = RequestMethod.PUT)
    @ResponseBody
    public CommonResult<String> updateTeacher(@RequestBody TeacherInfo teacher){
        UpdateWrapper<TeacherInfo> wrapper = new UpdateWrapper<>();
        wrapper.eq("open_id",teacher.getOpenid().toString());
        try {
            if (!infoService.update(teacher,wrapper)){
                return CommonResult.failed();
            }
        } catch (Exception e) {
            e.printStackTrace();
            return CommonResult.failed();
        }
        return CommonResult.success(null);
    }

    /**
     * 删除老师信息
     * @param openid openid
     * @return 结果
     */
    @RequestMapping(value = "/{openid}",method = RequestMethod.DELETE)
    @ResponseBody
    public CommonResult<String> deleteTeacher(@PathVariable("openid") String openid){
        return infoService.deleteTeacherByOpenid(openid) ? CommonResult.success("删除成功") : CommonResult.failed();
    }

}

