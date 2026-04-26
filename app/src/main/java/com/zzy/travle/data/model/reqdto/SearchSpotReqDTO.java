package com.zzy.travle.data.model.reqdto;

public class SearchSpotReqDTO {
    private String keyword;

    public SearchSpotReqDTO(String keyword) {
        this.keyword = keyword;
    }

    public String getKeyword() {
        return keyword;
    }

    public void setKeyword(String keyword) {
        this.keyword = keyword;
    }

    @Override
    public String toString() {
        return "SearchSpotReqDTO{" +
                "keyword='" + keyword + '\'' +
                '}';
    }
}
