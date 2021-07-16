package com.arthur.javamongodb.dto;

import com.arthur.javamongodb.domain.User;
import org.springframework.data.annotation.Id;

import java.io.Serializable;

public class UserDTO implements Serializable {
    private static final long serialVersionUID = 1L;

    private String id;
    private String name;

    public UserDTO() {

    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public UserDTO(User obj) {
        id = obj.getId();
        name = obj.getName();
    }

}
