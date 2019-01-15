package com.atguigu.ext;

import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

@Component
public class MyLocalApplicationListener implements ApplicationListener<LocalConfigOnChange> {
    @Override
    public void onApplicationEvent(LocalConfigOnChange localConfigOnChange) {
        System.out.println("------" + localConfigOnChange.returnStr());

    }
}
