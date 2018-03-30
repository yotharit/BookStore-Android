package com.example.tharitpongsaneh.book.models

/**
 * Created by tharitpongsaneh on 30/3/2018 AD.
 */

class Book (val id : Int ,
            val title : String ,
            val price : Double = 0.0,
            val publicationYear : Int = 0,
            val imageURL : String = ""){

    override fun toString(): String{
        return "${title} (${price})"
    }

}