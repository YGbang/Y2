package com.sz.bean;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Girl {

    private String [] friends;

    private List<Integer> nos;

    private Set<Book> books;

    private Map<String,Food> favorateFoods;

    public Map<String, Food> getFavorateFoods() {
        return favorateFoods;
    }

    public void setFavorateFoods(Map<String, Food> favorateFoods) {
        this.favorateFoods = favorateFoods;
    }

    public String[] getFriends() {
        return friends;
    }

    public void setFriends(String[] friends) {
        this.friends = friends;
    }


    public Set<Book> getBooks() {
        return books;
    }

    public void setBooks(Set<Book> books) {
        this.books = books;
    }

    public List<Integer> getNos() {
        return nos;
    }

    public void setNos(List<Integer> nos) {
        this.nos = nos;
    }

}
