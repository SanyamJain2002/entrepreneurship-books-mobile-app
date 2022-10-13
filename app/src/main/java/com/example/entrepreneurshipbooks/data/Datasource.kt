package com.example.entrepreneurshipbooks.data
import com.example.enterpreneurshipbooks.R
import com.example.entrepreneurshipbooks.model.EntrepreneurshipBook

class Datasource() {
    fun loadBooks(): List<EntrepreneurshipBook> {
        return listOf<EntrepreneurshipBook>(
            EntrepreneurshipBook(R.string.book1,R.string.des1, R.drawable.image1),
            EntrepreneurshipBook(R.string.book2,R.string.des2, R.drawable.image2),
            EntrepreneurshipBook(R.string.book3,R.string.des3, R.drawable.image3),
            EntrepreneurshipBook(R.string.book4,R.string.des4, R.drawable.image4),
            EntrepreneurshipBook(R.string.book5,R.string.des5, R.drawable.image5),
            EntrepreneurshipBook(R.string.book6,R.string.des6, R.drawable.image6),
            EntrepreneurshipBook(R.string.book7,R.string.des7, R.drawable.image7),
            EntrepreneurshipBook(R.string.book8,R.string.des8, R.drawable.image8),
            EntrepreneurshipBook(R.string.book9,R.string.des9, R.drawable.image9),
            EntrepreneurshipBook(R.string.book10,R.string.des10, R.drawable.image10)
        )
    }
}
