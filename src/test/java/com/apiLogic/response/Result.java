package com.apiLogic.response;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Result {

    @SerializedName("objectType")
    @Expose
    private String objectType;
    @SerializedName("firstName")
    @Expose
    private String firstName;
    @SerializedName("id")
    @Expose
    private String id;
    @SerializedName("lastName")
    @Expose
    private String lastName;
    @SerializedName("username")
    @Expose
    private String username;
    @SerializedName("address")
    @Expose
    private String address;
    @SerializedName("city")
    @Expose
    private String city;
    @SerializedName("country")
    @Expose
    private Country country;
    @SerializedName("countryId")
    @Expose
    private Integer countryId;
    @SerializedName("createDate")
    @Expose
    private Integer createDate;
    @SerializedName("email")
    @Expose
    private String email;
    @SerializedName("externalId")
    @Expose
    private String externalId;
    @SerializedName("householdId")
    @Expose
    private Integer householdId;
    @SerializedName("isHouseholdMaster")
    @Expose
    private Boolean isHouseholdMaster;
    @SerializedName("roleIds")
    @Expose
    private String roleIds;
    @SerializedName("suspensionState")
    @Expose
    private String suspensionState;
    @SerializedName("suspentionState")
    @Expose
    private String suspentionState;
    @SerializedName("updateDate")
    @Expose
    private Integer updateDate;
    @SerializedName("userState")
    @Expose
    private String userState;
    @SerializedName("userType")
    @Expose
    private UserType userType;

    public String getObjectType() {
        return objectType;
    }

    public void setObjectType(String objectType) {
        this.objectType = objectType;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public Country getCountry() {
        return country;
    }

    public void setCountry(Country country) {
        this.country = country;
    }

    public Integer getCountryId() {
        return countryId;
    }

    public void setCountryId(Integer countryId) {
        this.countryId = countryId;
    }

    public Integer getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Integer createDate) {
        this.createDate = createDate;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getExternalId() {
        return externalId;
    }

    public void setExternalId(String externalId) {
        this.externalId = externalId;
    }

    public Integer getHouseholdId() {
        return householdId;
    }

    public void setHouseholdId(Integer householdId) {
        this.householdId = householdId;
    }

    public Boolean getIsHouseholdMaster() {
        return isHouseholdMaster;
    }

    public void setIsHouseholdMaster(Boolean isHouseholdMaster) {
        this.isHouseholdMaster = isHouseholdMaster;
    }

    public String getRoleIds() {
        return roleIds;
    }

    public void setRoleIds(String roleIds) {
        this.roleIds = roleIds;
    }

    public String getSuspensionState() {
        return suspensionState;
    }

    public void setSuspensionState(String suspensionState) {
        this.suspensionState = suspensionState;
    }

    public String getSuspentionState() {
        return suspentionState;
    }

    public void setSuspentionState(String suspentionState) {
        this.suspentionState = suspentionState;
    }

    public Integer getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(Integer updateDate) {
        this.updateDate = updateDate;
    }

    public String getUserState() {
        return userState;
    }

    public void setUserState(String userState) {
        this.userState = userState;
    }

    public UserType getUserType() {
        return userType;
    }

    public void setUserType(UserType userType) {
        this.userType = userType;
    }
}
