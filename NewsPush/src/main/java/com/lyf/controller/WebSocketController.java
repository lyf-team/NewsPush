package com.lyf.controller;

import java.io.IOException;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.lyf.websocket.WebSocketServer;
@RestController
public class WebSocketController {
	 @RequestMapping("/push")
		public String home(@RequestParam(value = "name", defaultValue = "forezp") String name) {
		 try {
			WebSocketServer.sendInfo("来自服务端的消息:"+name);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return "ok";
		}
}
