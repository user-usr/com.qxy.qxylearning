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
public class UserInformationBean {

    private UserInformationData userInformationData;
    public void setUserInformationData(UserInformationData userInformationData) {
         this.userInformationData = userInformationData;
     }
     public UserInformationData getUserInformationData() {
         return userInformationData;
     }

     public UserInformationBean(){
        this.userInformationData = new UserInformationData();
     }

    @Override
    public String toString() {
        return "UserInformationBean{" +
                "userInformationData=" + userInformationData +
                '}';
    }
}