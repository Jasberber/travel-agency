package priv.project.controller.web;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import priv.project.service.NoticeService;


/**
 * @Author Mr.Wang
 * 客户端消息通知控制器
 */
@RestController
@RequestMapping("/web/notice")
@AllArgsConstructor
public class WebNoticeController {

    private NoticeService noticeService;

}
