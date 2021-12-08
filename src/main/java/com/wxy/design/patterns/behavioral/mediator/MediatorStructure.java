package com.wxy.design.patterns.behavioral.mediator;

/**
 * description: TODO
 *
 * @author wxy
 * @version 1.0
 * @since 2021/12/5 17:47
 */
public class MediatorStructure extends Mediator {

    /**
     * 房东
     */
    private HouseOwner houseOwner;

    /**
     * 租客
     */
    private Tenant tenant;

    public HouseOwner getHouseOwner() {
        return houseOwner;
    }

    public void setHouseOwner(HouseOwner houseOwner) {
        this.houseOwner = houseOwner;
    }

    public Tenant getTenant() {
        return tenant;
    }

    public void setTenant(Tenant tenant) {
        this.tenant = tenant;
    }

    @Override
    public void contact(String msg, Person person) {
        if (person == houseOwner) {
            tenant.getMessage(msg);
        } else {
            houseOwner.getMessage(msg);
        }
    }
}
