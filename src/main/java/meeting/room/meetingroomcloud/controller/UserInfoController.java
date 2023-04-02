package meeting.room.meetingroomcloud.controller;

import meeting.room.meetingroomcloud.service.StudentInfoService;
import meeting.room.meetingroomcloud.service.TeacherInfoService;
import meeting.room.meetingroomcloud.utils.CommonResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Map;

@Controller
public class UserInfoController {

    @Autowired
    private TeacherInfoService teacherInfoService;

    @Autowired
    private StudentInfoService studentInfoService;

    @RequestMapping(value = "/updateUserInfo" , method = RequestMethod.POST)
    @ResponseBody
    private CommonResult<String> updateUserInfo(@RequestBody Map<String,String> map){
        String sheetName = map.get("sheetName");
        String openid = map.get("openid");
        String isProve = map.get("isProve");
        Integer isProve_int = Integer.parseInt(isProve);
        if ("studentInfo".equals(sheetName)){
           return   studentInfoService.updateStudent(openid,isProve_int) ?
                   CommonResult.success("success") : CommonResult.failed();
        }else if ("teacherInfo".equals(sheetName)){
           return   teacherInfoService.updateTeacher(openid,isProve_int) ?
                   CommonResult.success("success") : CommonResult.failed();
        }else {
            return CommonResult.failed();
        }
    }

}
