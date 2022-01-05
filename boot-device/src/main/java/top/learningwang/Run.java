package top.learningwang;

import top.learningwang.iot.IotDevice;

import java.util.ServiceLoader;

/**
 * @author wangjingbiao
 * createDate: 2022/1/5 周三 10:45 AM
 * desc:
 */
public class Run {

    public static void main(String[] args) {
        ServiceLoader<IotDevice> s = ServiceLoader.load(IotDevice.class);
        for (IotDevice iotDevice : s) {
            System.out.println("-------------------");
            System.out.println(iotDevice.name());
            iotDevice.on();
            iotDevice.work();
            iotDevice.off();
            System.out.println("-------------------");
            System.out.print("\n");
        }
    }
}