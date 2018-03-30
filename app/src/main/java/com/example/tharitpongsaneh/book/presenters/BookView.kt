package com.example.tharitpongsaneh.book.presenters
import com.example.tharitpongsaneh.book.models.Book

/**
 * Created by tharitpongsaneh on 30/3/2018 AD.
 */

interface BookView {
    fun setBookList(books:ArrayList<Book>)
}