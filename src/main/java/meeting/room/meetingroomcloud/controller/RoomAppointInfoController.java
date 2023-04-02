package meeting.room.meetingroomcloud.controller;



import meeting.room.meetingroomcloud.service.AppointArrService;
import meeting.room.meetingroomcloud.service.ArrDetailService;
import meeting.room.meetingroomcloud.service.RoomAppointInfoService;
import meeting.room.meetingroomcloud.utils.CommonResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.util.Date;
import java.util.List;
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

    /**
     * 获取房间预约信息列表
     * @param roomid 房间id
     * @return 结果
     */
    @RequestMapping(value = "/{roomid}", method = RequestMethod.GET)
    @ResponseBody
    public CommonResult<List<Object>> getDateAppointList(@PathVariable("roomid") String roomid){
        try {
            return CommonResult.success(infoService.getAppointInfoList(roomid,arrService,detailService));
        } catch (Exception e) {
            e.printStackTrace();
            return CommonResult.failed();
        }
    }

    @RequestMapping(value = "/{time}" , method = RequestMethod.GET)
    @ResponseBody
    public CommonResult<List<Object>> getDateAppointListByTime(@PathVariable("time") Long time){

        Date date = new Date(time);
        LocalDateTime localDateTime = date.toInstant().atZone(ZoneOffset.ofHours(8)).toLocalDateTime();

    }

}

