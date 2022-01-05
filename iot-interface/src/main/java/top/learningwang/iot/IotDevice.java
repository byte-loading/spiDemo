package top.learningwang.iot;

/**
 * @author wangjingbiao
 * createDate: 2022/1/5 周三 11:19 AM
 * desc:
 */
public interface IotDevice {
    /**
     * 获取iot设备名称
     *
     * @return 设备名
     */
    String name();

    /**
     * 开机
     */
    void on();

    /**
     * 关机
     */
    void off();

    /**
     * 设备工作中
     */
    void work();
}
