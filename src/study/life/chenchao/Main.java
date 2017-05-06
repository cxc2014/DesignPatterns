package study.life.chenchao;

import study.life.chenchao.proxy.dynamic.DynamicProxy;
import study.life.chenchao.proxy.dynamic.MartRequest;
import study.life.chenchao.proxy.dynamic.StaticProxy;

public class Main {

    public static void main(String[] args) {

        MartRequest dynamicRequest = DynamicProxy.instance();
        dynamicRequest.getUserInfo();
        dynamicRequest.getPhone();

        MartRequest staticRequest = StaticProxy.instance();
        staticRequest.getUserInfo();
        staticRequest.getPhone();
    }

}
