package top.learningwang.iot.device.tv;


import top.learningwang.iot.IotDevice;

/**
 * @author wangjingbiao
 * createDate: 2022/1/5 周三 10:55 AM
 * desc:
 */
public class RedMiTv implements IotDevice {
    @Override
    public String name() {
        return "红米电视";
    }

    @Override
    public void on() {
        System.out.println("永远相信美好的事情即将发生");
    }

    @Override
    public void off() {
        System.out.println("不再相信美好的事情即将发生");
    }

    @Override
    public void work() {
        System.out.println("新闻联播。。。");
    }
}
