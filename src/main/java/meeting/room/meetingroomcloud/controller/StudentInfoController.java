package meeting.room.meetingroomcloud.controller;


import com.baomidou.mybatisplus.core.conditions.update.UpdateWrapper;
import meeting.room.meetingroomcloud.entity.StudentInfo;
import meeting.room.meetingroomcloud.service.StudentInfoService;
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
@RequestMapping("/studentInfo")
public class StudentInfoController {

    @Autowired
    private StudentInfoService infoService;

    /**
     * 添加学生信息
     * @param student 学生对象
     * @return 结果
     */
    @RequestMapping(value = "" , method = RequestMethod.POST)
    @ResponseBody
    public CommonResult<String> addStudent(@RequestBody StudentInfo student){
        try {
            if (!infoService.save(student)) {
                return CommonResult.failed();
            }
        } catch (Exception e) {
            e.printStackTrace();
            return CommonResult.failed();
        }
        return CommonResult.success(null);
    }

    /**
     * 更新学生信息
     * @param student 学生对象
     * @return 结果
     */
    @RequestMapping(value = "" , method = RequestMethod.PUT)
    @ResponseBody
    public CommonResult<String> updateStudent(@RequestBody StudentInfo student){
        UpdateWrapper<StudentInfo> wrapper = new UpdateWrapper<>();
        wrapper.eq("open_id",student.getOpenid());
        try {
            if (!infoService.update(student,wrapper)){
                return CommonResult.failed();
            }
        } catch (Exception e) {
            e.printStackTrace();
            return CommonResult.failed();
        }
        return CommonResult.success(null);
    }

    /**
     * 删除学生信息
     * @param openid openid
     * @return 结果
     */
    @RequestMapping(value = "/{openid}",method = RequestMethod.DELETE)
    @ResponseBody
    public CommonResult<String> deleteStudent(@PathVariable("openid") String openid){
        return infoService.deleteStudentByOpenid(openid) ? CommonResult.success("删除成功") : CommonResult.failed();
    }
}

