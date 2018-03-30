package com.example.tharitpongsaneh.book.presenters

import android.os.Parcel
import android.os.Parcelable
import com.example.tharitpongsaneh.book.models.BookRepository
import java.util.*

/**
 * Created by tharitpongsaneh on 30/3/2018 AD.
 */
class BookPresenter(val view: BookView,
                    val repository: BookRepository): Observer {
    fun start() {
        repository.addObserver(this)
        repository.loadAllBooks()
    }

    override fun update(obj: Observable?, arg: Any?) {
        if(obj == repository) {
            view.setBookList(repository.getBooks())
        }
    }
}