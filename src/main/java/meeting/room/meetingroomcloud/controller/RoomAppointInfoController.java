package meeting.room.meetingroomcloud.controller;


import meeting.room.meetingroomcloud.service.AppointArrService;
import meeting.room.meetingroomcloud.service.ArrDetailService;
import meeting.room.meetingroomcloud.service.RoomAppointInfoService;
import meeting.room.meetingroomcloud.utils.CommonResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author 016
 * @since 2023年03月20日
 */
@RestController
@RequestMapping("/roomAppointInfo")
public class RoomAppointInfoController {

    @Autowired
    private RoomAppointInfoService infoService;

    @Autowired
    private AppointArrService arrService;

    @Autowired
    private ArrDetailService detailService;

    /**
     * 添加房间预约信息
     * @param map json
     * @return 结果
     */
    @RequestMapping(value = "" , method = RequestMethod.POST)
    @ResponseBody
    public CommonResult<String> addRoomAppoint(@RequestBody Map<String, Object> map){
        return infoService.addInfo(map,arrService,detailService) ? CommonResult.success("操作成功") : CommonResult.failed();
    }

    /**
     * 修改房间预约信息
     * @param map json
     * @return 结果
     */
    @RequestMapping(value = "" , method = RequestMethod.PUT)
    @ResponseBody
    public CommonResult<String> updateRoomAppoint(@RequestBody Map<String, Object>map){
        return infoService.updateInfo(map,arrService,detailService) ? CommonResult.success("操作成功") : CommonResult.failed();
    }


}

