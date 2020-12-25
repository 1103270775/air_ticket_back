package com.ctgu.airticket.utils;

import java.util.Date;
import java.util.UUID;

/**
 * @Author:Mr.zhou
 * @Package:com.ctgu.airticket.utils
 * @Date:2020/12/25
 * @Description:
 * @Version 1.0
 */
public class OrderUtil {
    /**
     * 最大支持1-9个集群的机器部署
     */
    public static final int MACHINE_ID = 1;
    /**
     * 生成订单号
     */
    public static String getOrderNumber() {
        int machineId = MACHINE_ID;
        int hashCodeV = UUID.randomUUID().toString().hashCode();
        System.out.println("hashCodeV：" + hashCodeV);
        if (hashCodeV < 0) {
            hashCodeV = -hashCodeV;
        }
        // 0 代表前面补充0
        // 4 代表长度为4
        // d 代表参数为正整型
        //edit---20181203 hzj
        Date date=new Date();
        return machineId + String.format("%015d", hashCodeV)+date.getTime();
    }
}
