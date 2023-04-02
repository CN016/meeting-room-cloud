package meeting.room.meetingroomcloud.controller;


import com.baomidou.mybatisplus.core.conditions.update.UpdateWrapper;
import meeting.room.meetingroomcloud.entity.StudentInfo;
import meeting.room.meetingroomcloud.service.StudentInfoService;
import meeting.room.meetingroomcloud.utils.CommonResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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
    @RequestMapping(value = "/del/{openid}",method = RequestMethod.DELETE)
    @ResponseBody
    public CommonResult<String> deleteStudent(@PathVariable("openid") String openid){
        return infoService.deleteStudentByOpenid(openid) ? CommonResult.success("删除成功") : CommonResult.failed();
    }

    /**
     * 获取学生信息
     * @param openid openid
     * @return 结果
     */
    @RequestMapping(value = "/get/{openid}",method = RequestMethod.GET)
    @ResponseBody
    public CommonResult<StudentInfo> getStudent(@PathVariable("openid") String openid){
        StudentInfo info = infoService.getStudentInfo(openid);
        return info == null ? CommonResult.failed() : CommonResult.success(info);
    }

    @RequestMapping(value = "",method = RequestMethod.GET)
    @ResponseBody
    public CommonResult<List<StudentInfo>> countStudentInfo(){
        List<StudentInfo> infos = infoService.getList();
        return infos.isEmpty() ? CommonResult.failed() : CommonResult.success(infos);
    }

}

