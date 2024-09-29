package com.example.demo.entity;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "bookdetails")
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long bookid;

    private String bookname;
    private Double bookprice;
    private Integer bookvolume;
    private String bookauthor;
    private Date bookrelesdate;

    // Getters and Setters
    public Long getBookid() { return bookid; }
    public void setBookid(Long bookid) { this.bookid = bookid; }

    public String getBookname() { return bookname; }
    public void setBookname(String bookname) { this.bookname = bookname; }

    public Double getBookprice() { return bookprice; }
    public void setBookprice(Double bookprice) { this.bookprice = bookprice; }

    public Integer getBookvolume() { return bookvolume; }
    public void setBookvolume(Integer bookvolume) { this.bookvolume = bookvolume; }

    public String getBookauthor() { return bookauthor; }
    public void setBookauthor(String bookauthor) { this.bookauthor = bookauthor; }

    public Date getBookrelesdate() { return bookrelesdate; }
    public void setBookrelesdate(Date bookrelesdate) { this.bookrelesdate = bookrelesdate; }
}
