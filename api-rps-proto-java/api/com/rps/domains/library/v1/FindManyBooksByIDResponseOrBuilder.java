// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: rps/domains/library/v1/book_api.proto

package com.rps.domains.library.v1;

public interface FindManyBooksByIDResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:rps.domains.library.v1.FindManyBooksByIDResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>repeated .rps.domains.library.v1.Book books = 1 [json_name = "books"];</code>
   */
  java.util.List<com.rps.domains.library.v1.Book> 
      getBooksList();
  /**
   * <code>repeated .rps.domains.library.v1.Book books = 1 [json_name = "books"];</code>
   */
  com.rps.domains.library.v1.Book getBooks(int index);
  /**
   * <code>repeated .rps.domains.library.v1.Book books = 1 [json_name = "books"];</code>
   */
  int getBooksCount();
  /**
   * <code>repeated .rps.domains.library.v1.Book books = 1 [json_name = "books"];</code>
   */
  java.util.List<? extends com.rps.domains.library.v1.BookOrBuilder> 
      getBooksOrBuilderList();
  /**
   * <code>repeated .rps.domains.library.v1.Book books = 1 [json_name = "books"];</code>
   */
  com.rps.domains.library.v1.BookOrBuilder getBooksOrBuilder(
      int index);
}
