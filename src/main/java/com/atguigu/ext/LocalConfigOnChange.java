package com.atguigu.ext;

import org.springframework.context.ApplicationEvent;

public class LocalConfigOnChange extends ApplicationEvent {

    public LocalConfigOnChange(Object source) {
        super(source);
    }

    public String returnStr() {
        return "我是幸运之王";
    }
}
