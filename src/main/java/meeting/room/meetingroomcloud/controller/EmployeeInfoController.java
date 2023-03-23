package meeting.room.meetingroomcloud.controller;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.conditions.update.UpdateWrapper;
import meeting.room.meetingroomcloud.entity.EmployeeInfo;
import meeting.room.meetingroomcloud.service.EmployeeInfoService;
import meeting.room.meetingroomcloud.utils.CommonResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author 016
 * @since 2023年03月20日
 */
@Controller
@RequestMapping("/employeeInfo")

public class EmployeeInfoController {

    @Autowired
    private EmployeeInfoService infoService;

    /**
     * 添加新的employee
     * @param employee 参数
     * @return Result
     */
    @RequestMapping(value = "" ,method = RequestMethod.POST)
    @ResponseBody
    public CommonResult<String> addEmployee(@RequestBody EmployeeInfo employee){
        EmployeeInfo employeeInfo = infoService.getByOpenid(employee.getOpenId());
        if (employeeInfo!=null){
            return CommonResult.failed("exist");
        }
        try {
            if (!infoService.save(employee)) {
                return CommonResult.failed();
            }
        } catch (Exception e) {
            e.printStackTrace();
            return CommonResult.failed();
        }
        return CommonResult.success(null);
    }

    /**
     * 修改employee信息
     * @param employee 参数
     * @return RESULT
     */
    @RequestMapping(value = "",method = RequestMethod.PUT)
    @ResponseBody
    public CommonResult<String> editEmployee
            (@RequestBody EmployeeInfo employee){
        UpdateWrapper<EmployeeInfo> wrapper = new UpdateWrapper<>();
        wrapper.eq("open_id",employee.getOpenId());
        try {
            if (!infoService.update(employee,wrapper)){
                return CommonResult.failed();
            }
        } catch (Exception e) {
            e.printStackTrace();
            return CommonResult.failed();
        }
        return CommonResult.success(null);
    }

    /**
     * 删除employee信息
     * @param openid openid
     * @return 结果
     */
    @RequestMapping(value = "/{openid}",method = RequestMethod.DELETE)
    @ResponseBody
    public CommonResult<String> deleteEmployee(@PathVariable("openid") String openid){
        QueryWrapper<EmployeeInfo> wrapper = new QueryWrapper<>();
        wrapper.eq("open_id",openid);
        try {
            if (infoService.remove(wrapper)){
                return CommonResult.success("操作成功");
            }else {
                return CommonResult.failed();
            }
        } catch (Exception e) {
            e.printStackTrace();
            return CommonResult.failed();
        }
    }


}

