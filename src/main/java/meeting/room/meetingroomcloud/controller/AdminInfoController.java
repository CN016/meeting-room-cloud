package meeting.room.meetingroomcloud.controller;


import meeting.room.meetingroomcloud.entity.AdminInfo;
import meeting.room.meetingroomcloud.service.AdminInfoService;
import meeting.room.meetingroomcloud.utils.CommonResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.net.CacheRequest;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author 016
 * @since 2023年03月20日
 */
@RestController
@RequestMapping("/adminInfo")
public class AdminInfoController {

    @Autowired
    private AdminInfoService infoService;

    @RequestMapping(value = "" , method = RequestMethod.POST)
    @ResponseBody
    public CommonResult<String> addAdmin(@RequestBody AdminInfo info) {
        System.out.println(info);
        if (infoService.save(info)) {
            return CommonResult.success("操作成功");
        }
        return CommonResult.failed();
    }

    @RequestMapping(value = "/login" , method = RequestMethod.POST)
    @ResponseBody
    public CommonResult<AdminInfo> login(@RequestBody AdminInfo info){

        String phone = info.getPhone();
        String password = info.getPassword();

        AdminInfo adminInfo = infoService.getByPhoneAndPasswd(phone,password);

        if (adminInfo == null){
            return CommonResult.failed("用户名或密码错误");
        }
        return CommonResult.success(adminInfo);
    }
}

