package top.learningwang.iot.device.light;

import top.learningwang.iot.IotDevice;

/**
 * @author wangjingbiao
 * createDate: 2022/1/5 周三 1:38 PM
 * desc:
 */
public class XiaomiLight implements IotDevice {
    @Override
    public String name() {
        return "小米米家LED智能台灯1S";
    }

    @Override
    public void on() {
        System.out.println("小爱开灯");
    }

    @Override
    public void off() {
        System.out.println("小爱关灯");
    }

    @Override
    public void work() {
        System.out.println("亮了。。。");
    }
}
