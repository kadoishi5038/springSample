package com.example.demo.entity;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import lombok.Data;

/**
 * ユーザー情報 Entity
 */
@Entity
@Data
@Table(name = "bookinfo")
public class Bookinfo implements Serializable {
  /**
   * ID
   */
  @Id
  @Column(name = "id")
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;
  /**
   * isbn
   */
  @Column(name = "isbn")
  private String isbn;
  /**
   * タイトル
   */
  @Column(name = "title")
  private String title;
  /**
   * 電話番号
   */
  @Column(name = "price")
  private String price;
  
}