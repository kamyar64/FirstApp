package com.example.reza.firstapp;

/**
 * Created by Reza on 11/23/2015.
 */
public class Result {
    private String created_date;

    private String position;

    private String updated_date;

    private String address;

    private String email;

    private String department;

    private String phone_no;

    private String cell_no;

    private String url;

    private String full_name;

    public String getCreated_date() {
        return created_date;
    }

    public void setCreated_date(String created_date) {
        this.created_date = created_date;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getUpdated_date() {
        return updated_date;
    }

    public void setUpdated_date(String updated_date) {
        this.updated_date = updated_date;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getPhone_no() {
        return phone_no;
    }

    public void setPhone_no(String phone_no) {
        this.phone_no = phone_no;
    }

    public String getCell_no() {
        return cell_no;
    }

    public void setCell_no(String cell_no) {
        this.cell_no = cell_no;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getFull_name() {
        return full_name;
    }

    public void setFull_name(String full_name) {
        this.full_name = full_name;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [created_date = "+created_date+", position = "+position+", updated_date = "+updated_date+", address = "+address+", email = "+email+", department = "+department+", phone_no = "+phone_no+", cell_no = "+cell_no+", url = "+url+", full_name = "+full_name+"]";
    }
}
