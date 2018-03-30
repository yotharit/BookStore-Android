package com.example.tharitpongsaneh.book.models

import java.util.*

/**
 * Created by tharitpongsaneh on 30/3/2018 AD.
 */

abstract class BookRepository : Observable() {
    abstract fun loadAllBooks()
    abstract fun getBooks(): ArrayList<Book>
}