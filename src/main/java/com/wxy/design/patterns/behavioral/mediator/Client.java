package com.wxy.design.patterns.behavioral.mediator;

/**
 * description: 客户端类
 *
 * @author wxy
 * @version 1.0
 * @since 2021/12/5 17:52
 */
public class Client {
    public static void main(String[] args) {
        MediatorStructure mediatorStructure = new MediatorStructure();
        Tenant tenant = new Tenant("张三", mediatorStructure);
        HouseOwner houseOwner = new HouseOwner("李四", mediatorStructure);
        mediatorStructure.setTenant(tenant);
        mediatorStructure.setHouseOwner(houseOwner);

        tenant.contact("我需要整租一居室");
        houseOwner.contact("整租一居室2000/月");
    }
}
