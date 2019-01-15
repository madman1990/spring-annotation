package com.atguigu.ext;

import org.springframework.context.ApplicationEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @EventListener(classes = {LocalConfigOnChange.class})
    public void listen(LocalConfigOnChange event) {
        System.out.println("LocalConfigOnChange。。监听到的事件：" + event);
    }
/*
    @EventListener(classes={ApplicationEvent.class})
	public void listen(ApplicationEvent event){
		System.out.println("UserService。。监听到的事件："+event);
	}
*/

}
