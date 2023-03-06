package priv.project.controller;

import com.baomidou.mybatisplus.core.metadata.IPage;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import priv.project.pojo.ResultMessage;
import priv.project.pojo.ScenicSpot;
import priv.project.service.ScenicSpotService;

import java.util.Date;

/**
 * @Author 戴国亮
 * 景区表控制器
 */
@RequestMapping("/scenicSpot")
@RestController
@AllArgsConstructor
public class ScenicSpotController {

    private ScenicSpotService scenicSpotService;

    /**
     * 获取分页数据
     * @return
     */
    @GetMapping("/getPageList")
    public ResultMessage getPageList(Integer page, Integer limit, ScenicSpot scenicSpot) {
        try {
            // 调用查询方法
            IPage<ScenicSpot> pageBean = scenicSpotService.getPageList(page, limit, scenicSpot);
            return new ResultMessage(0, "查询成功！", pageBean.getRecords(), pageBean.getTotal());
        } catch (Exception e) {
            e.printStackTrace();
            return new ResultMessage(500, "查询失败！");
        }
    }

    /**
     * 新增或修改信息
     * @return
     */
    @PostMapping("/saveOrUpdate")
    public ResultMessage saveOrUpdate(@RequestBody ScenicSpot scenicSpot) {
        try {
            // ID为空代表是新增, 设置创建时间
            if(scenicSpot.getId() == null) {
                // 创建时间
                scenicSpot.setCreateDate(new Date());
            }
            // 调用查询方法
            boolean result = scenicSpotService.saveOrUpdate(scenicSpot);
            if(!result) {
                return new ResultMessage(207, "操作失败！");
            }
            return new ResultMessage(200, "操作成功！");
        } catch (Exception e) {
            e.printStackTrace();
            return new ResultMessage(500, "操作失败！");
        }
    }

    /**
     * 删除一条或多条数据
     * @return
     */
    @GetMapping("/deleteInfo")
    public ResultMessage deleteInfo(String ids) {
        try {
            // 调用查询方法
            boolean result = scenicSpotService.deleteInfo(ids);
            if(!result) {
                return new ResultMessage(207, "操作失败！");
            }
            return new ResultMessage(200, "操作成功！");
        } catch (Exception e) {
            e.printStackTrace();
            return new ResultMessage(500, "操作失败！");
        }
    }
}
