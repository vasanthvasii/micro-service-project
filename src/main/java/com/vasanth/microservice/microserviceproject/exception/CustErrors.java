package com.vasanth.microservice.microserviceproject.exception;

import java.util.Date;

public class CustErrors {

    private String errorMsg;
    private String errorCode;
    private Date timestamp;

    public CustErrors(String errorMsg, String errorCode, Date timestamp) {
        super();
        this.errorMsg = errorMsg;
        this.errorCode = errorCode;
        this.timestamp = timestamp;
    }

    public String getErrorMsg() {
        return errorMsg;
    }

    public void setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
    }

    public String getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    public Date getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Date timestamp) {
        this.timestamp = timestamp;
    }
}
