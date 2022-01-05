package top.learngingwang.iot.device.washingmachine;

import top.learningwang.iot.IotDevice;
/**
 * @author wangjingbiao
 * createDate: 2022/1/5 周三 10:57 AM
 * desc:
 */
public class HaierWashingMachine implements IotDevice {
    @Override
    public String name() {
        return "海尔洗衣机";
    }

    @Override
    public void on() {
        System.out.println("开始加水");
    }

    @Override
    public void off() {
        System.out.println("排水完成");
    }

    @Override
    public void work() {
        System.out.println("洗衣服中。。。");
    }
}
