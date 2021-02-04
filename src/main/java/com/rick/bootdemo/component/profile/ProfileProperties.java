package com.rick.bootdemo.component.profile;

import org.springframework.boot.context.properties.ConfigurationProperties;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@ConfigurationProperties("my-profile")
public class ProfileProperties {
    
    private String name;

    private String email;

    private Boolean handsome = Boolean.TRUE;
}
