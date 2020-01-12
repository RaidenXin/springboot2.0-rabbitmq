package com.raiden.rabbitmq.dto;

/**
 * @创建人:Raiden
 * @Descriotion:
 * @Date:Created in 11:59 2020/1/12
 * @Modified By:
 */

public class MQMessage {

    private String id;
    private String code;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }
}
