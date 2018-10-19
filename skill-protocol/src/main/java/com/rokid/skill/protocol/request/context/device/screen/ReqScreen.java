package com.rokid.skill.protocol.request.context.device.screen;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import lombok.Data;

/**
 * @author Bassam
 * @date 25/03/2017
 */
@Data
@JsonInclude(Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class ReqScreen {

    /**
     * X 方向上的像素大小
     */
    private String x;
    /**
     * Y 方向上的像素大小
     */
    private String y;

}
