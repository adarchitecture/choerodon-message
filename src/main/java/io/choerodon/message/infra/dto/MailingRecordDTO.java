package io.choerodon.message.infra.dto;

import org.hzero.message.domain.entity.Message;

/**
 * @author jiameng.cao
 * @date 2019/10/25
 */
public class MailingRecordDTO extends Message {
    private Long id;
    private String status;
    private String receiveAccount;
    private String failedReason;
    private Integer retryCount;
    private String variables;
    private Long templateId;
    private String sendSettingCode;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getReceiveAccount() {
        return receiveAccount;
    }

    public MailingRecordDTO setReceiveAccount(String receiveAccount) {
        this.receiveAccount = receiveAccount;
        return this;
    }

    public String getFailedReason() {
        return failedReason;
    }

    public void setFailedReason(String failedReason) {
        this.failedReason = failedReason;
    }

    public Integer getRetryCount() {
        return retryCount;
    }

    public MailingRecordDTO setRetryCount(Integer retryCount) {
        this.retryCount = retryCount;
        return this;
    }

    public String getVariables() {
        return variables;
    }

    public void setVariables(String variables) {
        this.variables = variables;
    }

    public Long getTemplateId() {
        return templateId;
    }

    public MailingRecordDTO setTemplateId(Long templateId) {
        this.templateId = templateId;
        return this;
    }

    public String getSendSettingCode() {
        return sendSettingCode;
    }

    public MailingRecordDTO setSendSettingCode(String sendSettingCode) {
        this.sendSettingCode = sendSettingCode;
        return this;
    }
}
