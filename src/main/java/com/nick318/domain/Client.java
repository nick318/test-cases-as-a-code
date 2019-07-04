package com.nick318.domain;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.Accessors;

@Getter
@Setter
@Accessors(chain = true)
@ToString
public class Client {
    private String firstName;
    private String middleName;
    private String lastName;
    private String phone;
}
