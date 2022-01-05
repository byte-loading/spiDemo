package top.learningwang.iot.device.light;


import top.learningwang.iot.IotDevice;

/**
 * @author wangjingbiao
 * createDate: 2022/1/5 周三 10:56 AM
 * desc:
 */
public class HuaweiLight implements IotDevice {
    @Override
    public String name() {
        return "华为智选欧普读写台灯";
    }

    @Override
    public void on() {
        System.out.println("鸿蒙开灯");
    }

    @Override
    public void off() {
        System.out.println("鸿蒙关灯");
    }

    @Override
    public void work() {
        System.out.println("亮了。。。");
    }
}
