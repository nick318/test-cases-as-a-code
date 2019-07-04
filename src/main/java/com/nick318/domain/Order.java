package com.nick318.domain;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.Accessors;

@Data
@Setter
@Getter
@Accessors(chain = true)
@ToString
public class Order {
    private String description;
    private Client client;
    private Object createDate;
    private Object finishDate;
    private String price;
    private Statuses status;
}
