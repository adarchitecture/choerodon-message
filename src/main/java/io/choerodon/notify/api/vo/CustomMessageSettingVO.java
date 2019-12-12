package io.choerodon.notify.api.vo;

import io.swagger.annotations.ApiModelProperty;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * 〈功能简述〉
 * 〈自定义通知设置VO〉
 *
 * @author wanghao
 * @Date 2019/12/11 11:16
 */
public class CustomMessageSettingVO {

    private Long id;

    @ApiModelProperty("项目Id")
    private Long projectId;

    @ApiModelProperty("项目Id")
    private Long envId;

    @ApiModelProperty("通知类型，用作tab分页，敏捷消息类型agileNotify，devops消息类型devopsNotify")
    private String notifyType;

    @ApiModelProperty(value = "分组的id")
    private Long groupId;

    @ApiModelProperty("消息code")
    private String code;

    @ApiModelProperty(value = "消息设置的名字")
    private String name;

    @ApiModelProperty("是否发送站内信")
    private Boolean pmEnable;

    @ApiModelProperty("是否发送邮件")
    private Boolean emailEnable;

    @ApiModelProperty("是否发送邮件")
    private Boolean smsEnable;

    @ApiModelProperty(value = "版本号")
    private Long objectVersionNumber;

    @ApiModelProperty(value = "资源删除验证事件名字")
    private String eventName;

    @ApiModelProperty(value = "通知的非指定用户集合")
    private Set<String> sendRoleList = new HashSet<>();

    @ApiModelProperty(value = "指定用户集合")
    private List<TargetUserVO> userList;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getProjectId() {
        return projectId;
    }

    public void setProjectId(Long projectId) {
        this.projectId = projectId;
    }

    public String getNotifyType() {
        return notifyType;
    }

    public void setNotifyType(String notifyType) {
        this.notifyType = notifyType;
    }

    public Long getGroupId() {
        return groupId;
    }

    public void setGroupId(Long groupId) {
        this.groupId = groupId;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Boolean getPmEnable() {
        return pmEnable;
    }

    public void setPmEnable(Boolean pmEnable) {
        this.pmEnable = pmEnable;
    }

    public Boolean getEmailEnable() {
        return emailEnable;
    }

    public void setEmailEnable(Boolean emailEnable) {
        this.emailEnable = emailEnable;
    }

    public Boolean getSmsEnable() {
        return smsEnable;
    }

    public void setSmsEnable(Boolean smsEnable) {
        this.smsEnable = smsEnable;
    }

    public Long getObjectVersionNumber() {
        return objectVersionNumber;
    }

    public void setObjectVersionNumber(Long objectVersionNumber) {
        this.objectVersionNumber = objectVersionNumber;
    }

    public List<TargetUserVO> getUserList() {
        return userList;
    }

    public void setUserList(List<TargetUserVO> userList) {
        this.userList = userList;
    }

    public Long getEnvId() {
        return envId;
    }

    public void setEnvId(Long envId) {
        this.envId = envId;
    }

    public Set<String> getSendRoleList() {
        return sendRoleList;
    }

    public void setSendRoleList(Set<String> sendRoleList) {
        this.sendRoleList = sendRoleList;
    }

    public String getEventName() {
        return eventName;
    }

    public void setEventName(String eventName) {
        this.eventName = eventName;
    }
}
