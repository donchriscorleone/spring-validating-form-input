package com.christopherii.validatingforminput;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

public class PersonForm {

    @NotNull
    @Size(min = 0, max = 30)
    private String name;

    @NotNull
    @Size(min = 18)
    private Integer age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person(" +
                "name='" + name + '\'' +
                ", age=" + age +
                ')';
    }
}
