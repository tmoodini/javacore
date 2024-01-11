package com.tmoodini.designpatterns;

public class EmployeeBuilder {

    private final String name;
    private final int id;
    private final String city;
    private final String state;

    private EmployeeBuilder(Builder builder){
        this.name = builder.name;
        this.id = builder.id;
        this.city = builder.city;
        this.state = builder.state;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public String getCity() {
        return city;
    }

    public String getState() {
        return state;
    }

    public static class Builder{

        private final String name;
        private int id;
        private String city;
        private String state;

        public Builder(String name){
            this.name = name;
        }

        public Builder id(int id){
            this.id = id;
            return this;
        }

        public Builder city(String city){
            this.city = city;
            return this;
        }

        public Builder state(String state){
            this.state = state;
            return this;
        }

        public EmployeeBuilder build(){
            return new EmployeeBuilder(this);
        }

    }
}
