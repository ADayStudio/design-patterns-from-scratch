package com.github.structure.composite;

import java.util.ArrayList;
import java.util.List;

public class University extends OrganizationComponent{

    // 聚合
    List<OrganizationComponent> organizationComponents = new ArrayList<>();

    public University(String name, String desc) {
        super(name, desc);
    }

    @Override
    protected void add(OrganizationComponent organizationComponent) {
        organizationComponents.add(organizationComponent);
    }

    @Override
    protected void remove(OrganizationComponent organizationComponent) {
        organizationComponent.remove(organizationComponent);
    }

    @Override
    public void print() {
        System.out.println(this.getName());
        for (OrganizationComponent organization : organizationComponents) {
            organization.print();
        }
    }
}
