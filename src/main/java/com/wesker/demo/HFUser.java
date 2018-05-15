package com.wesker.demo;

import org.hyperledger.fabric.sdk.Enrollment;
import org.hyperledger.fabric.sdk.User;

import java.io.Serializable;
import java.util.Set;

/**
 * @program: HFUser
 * @description: 实现User接口
 * @author: Zhun.Xiao
 * @create: 2018-05-13 11:11
 **/
public class HFUser implements User, Serializable {


    private String name;
    private String account;
    private String affiliation;
    private String mspId;
    private Set<String> roles;
    private Enrollment enrollment;

    public HFUser(String name, String affiliation, String mspId, Enrollment enrollment) {
        this.name = name;
        this.affiliation = affiliation;
        this.mspId = mspId;
        this.enrollment = enrollment;
    }

    @Override
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    @Override
    public String getAffiliation() {
        return affiliation;
    }

    public void setAffiliation(String affiliation) {
        this.affiliation = affiliation;
    }

    @Override
    public String getMspId() {
        return mspId;
    }

    public void setMspId(String mspId) {
        this.mspId = mspId;
    }

    @Override
    public Set<String> getRoles() {
        return roles;
    }

    public void setRoles(Set<String> roles) {
        this.roles = roles;
    }

    @Override
    public Enrollment getEnrollment() {
        return enrollment;
    }

    public void setEnrollment(Enrollment enrollment) {
        this.enrollment = enrollment;
    }
}
