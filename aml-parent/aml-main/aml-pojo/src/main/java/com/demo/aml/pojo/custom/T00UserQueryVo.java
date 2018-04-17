package com.demo.aml.pojo.custom;

public class T00UserQueryVo {

    T00UserCustom t00UserCustom;
    Integer page = 1;
    Integer size = 10;
    Long total = 0L;

    public Integer getPage() {
        return page;
    }

    public void setPage(Integer page) {
        this.page = page;
    }

    public Integer getSize() {
        return size;
    }

    public void setSize(Integer size) {
        this.size = size;
    }

    public Long getTotal() {
        return total;
    }

    public void setTotal(Long total) {
        this.total = total;
    }

    public T00UserCustom getT00UserCustom() {
        return t00UserCustom;
    }

    public void setT00UserCustom(T00UserCustom t00UserCustom) {
        this.t00UserCustom = t00UserCustom;
    }
}
