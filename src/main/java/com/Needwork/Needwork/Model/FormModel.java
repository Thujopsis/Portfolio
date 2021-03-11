package com.Needwork.Needwork.Model;

import org.apache.commons.lang3.StringUtils;
import org.springframework.lang.NonNull;

import java.io.Serializable;

public class FormModel implements Serializable {

    private static final long serialVersionUID = -3430611959303745513L;

    @NonNull
    private String name = StringUtils.EMPTY;

    @NonNull
    private String details = StringUtils.EMPTY;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }
}
