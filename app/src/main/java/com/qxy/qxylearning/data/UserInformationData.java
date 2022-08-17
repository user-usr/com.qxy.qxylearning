/**
  * Copyright 2022 bejson.com 
  */
package com.qxy.qxylearning.data;

/**
 * Auto-generated: 2022-08-18 1:8:42
 *
 * @author bejson.com (i@bejson.com)
 * @website http://www.bejson.com/java2pojo/
 */
public class UserInformationData {

    private String avatar;
    private String city;
    private String country;
    private String description;
    private String e_account_role;
    private String error_code;
    private String gender;
    private String nickname;
    private String open_id;
    private String province;
    private String union_id;
    public void setAvatar(String avatar) {
         this.avatar = avatar;
     }
     public String getAvatar() {
         return avatar;
     }

    public void setCity(String city) {
         this.city = city;
     }
     public String getCity() {
         return city;
     }

    public void setCountry(String country) {
         this.country = country;
     }
     public String getCountry() {
         return country;
     }

    public void setDescription(String description) {
         this.description = description;
     }
     public String getDescription() {
         return description;
     }

    public void setE_account_role(String e_account_role) {
         this.e_account_role = e_account_role;
     }
     public String getE_account_role() {
         return e_account_role;
     }

    public void setError_code(String error_code) {
         this.error_code = error_code;
     }
     public String getError_code() {
         return error_code;
     }

    public void setGender(String gender) {
         this.gender = gender;
     }
     public String getGender() {
         return gender;
     }

    public void setNickname(String nickname) {
         this.nickname = nickname;
     }
     public String getNickname() {
         return nickname;
     }

    public void setOpen_id(String open_id) {
         this.open_id = open_id;
     }
     public String getOpen_id() {
         return open_id;
     }

    public void setProvince(String province) {
         this.province = province;
     }
     public String getProvince() {
         return province;
     }

    public void setUnion_id(String union_id) {
         this.union_id = union_id;
     }
     public String getUnion_id() {
         return union_id;
     }

     public UserInformationData(){
        this.avatar = null;
        this.city = null;
        this.country = null;
        this.nickname = null;
        this.description = null;
        this.e_account_role = null;
        this.error_code = null;
        this.gender = null;
        this.open_id = null;
        this.province = null;
        this.union_id = null;
     }

    @Override
    public String toString() {
        return "UserInformationData{" +
                "avatar='" + avatar + '\'' +
                ", city='" + city + '\'' +
                ", country='" + country + '\'' +
                ", description='" + description + '\'' +
                ", e_account_role='" + e_account_role + '\'' +
                ", error_code='" + error_code + '\'' +
                ", gender='" + gender + '\'' +
                ", nickname='" + nickname + '\'' +
                ", open_id='" + open_id + '\'' +
                ", province='" + province + '\'' +
                ", union_id='" + union_id + '\'' +
                '}';
    }
}