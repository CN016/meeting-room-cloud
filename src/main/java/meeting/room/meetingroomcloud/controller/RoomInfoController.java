package meeting.room.meetingroomcloud.controller;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.conditions.update.UpdateWrapper;
import jakarta.websocket.server.PathParam;
import meeting.room.meetingroomcloud.entity.RoomInfo;
import meeting.room.meetingroomcloud.service.RoomInfoService;
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
@RequestMapping("/roomInfo")
public class RoomInfoController {

    @Autowired
    private RoomInfoService infoService;

    /**
     * 添加房间信息
     * @param room 房间对象
     * @return 结果
     */
    @RequestMapping(value = "",method = RequestMethod.POST)
    @ResponseBody
    public CommonResult<String> addRoom(@RequestBody RoomInfo room){
        RoomInfo roomById = infoService.getRoomById(room.getRoomid());
        if (roomById!=null){
         return CommonResult.failed("exist".toString());
        }
        try {
            if (!infoService.save(room)) {
                return CommonResult.failed();
            }
        } catch (Exception e) {
            e.printStackTrace();
            return CommonResult.failed();
        }
        return CommonResult.success(null);
    }

    /**
     * 修改房间信息
     * @param room 房间对象
     * @return 结果
     */
    @RequestMapping(value = "" , method = RequestMethod.PUT)
    @ResponseBody
    public CommonResult<String> updateRoom(@RequestBody RoomInfo room){
        UpdateWrapper<RoomInfo> wrapper = new UpdateWrapper<>();
        wrapper.eq("roomid",room.getRoomid().toString());
        try {
            if (!infoService.update(room,wrapper)){
                return CommonResult.failed();
            }
        } catch (Exception e) {
            e.printStackTrace();
            return CommonResult.failed();
        }
        return CommonResult.success(null);
    }

    /**
     * 获取房间信息
     * @param roomId 房间id
     * @return 结果
     */
    @RequestMapping(value = "/{roomId}" , method = RequestMethod.GET)
    @ResponseBody
    public CommonResult<RoomInfo> getInfo(@PathVariable("roomId") Integer roomId){
        if (roomId == null){
            return CommonResult.failed();
        }
        QueryWrapper<RoomInfo> wrapper = new QueryWrapper<>();
        wrapper.eq("roomid",roomId);
        try {
            RoomInfo one = infoService.getOne(wrapper);
            return CommonResult.success(one);
        } catch (Exception e) {
            e.printStackTrace();
            return CommonResult.failed();
        }
    }

    /**
     * 删除房间信息
     * @param roomId 房间id
     * @return 结果
     */
    @RequestMapping(value = "/{roomId}" , method = RequestMethod.DELETE)
    @ResponseBody
    public CommonResult<String> deleteRoom(@PathVariable("roomId") Integer roomId){
        return infoService.deleteRoomById(roomId) ? CommonResult.success("操作成功") : CommonResult.failed();
    }

}

