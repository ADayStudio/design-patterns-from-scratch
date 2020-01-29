package com.github.structure.composite;

public class Client {

    public static void main(String args[]){
        OrganizationComponent university = new University("程序员大学", "万物皆明辨可惜");
        university.add(new College("计算机学院", "万物皆计算机"));
        university.add(new College("数学学院", "万物皆数学"));
        university.print();

        System.out.println("----------------------");
        OrganizationComponent college = new College("物理学院", "万物皆物理");
        college.add(new Department("物理一班", "一班一班"));
        college.add(new Department("物理二班", "二班二班"));
        university.add(college);
        university.print();

    }
}
