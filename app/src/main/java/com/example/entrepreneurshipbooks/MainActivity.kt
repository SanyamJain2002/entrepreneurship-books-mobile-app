package com.example.entrepreneurshipbooks
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.Card
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.enterpreneurshipbooks.R
import com.example.entrepreneurshipbooks.data.Datasource
import com.example.entrepreneurshipbooks.model.EntrepreneurshipBook
import com.example.entrepreneurshipbooks.ui.theme.EnterpreneurshipBooksTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            BooksApp()
        }
    }
}

@Composable
fun BooksApp() {
    EnterpreneurshipBooksTheme {
        Scaffold(
            content = {
                BooksList(booksList = Datasource().loadBooks())
            }
        )


    }
}

@Composable
fun BookCard(entrepreneurshipBook: EntrepreneurshipBook,modifier: Modifier=Modifier){
    Card(modifier = Modifier.padding(20.dp), elevation = 4.dp) {
        Column() {

            Text(
                text = stringResource(entrepreneurshipBook.stringResourceId),
                modifier=Modifier.padding(16.dp),
                style = MaterialTheme.typography.h4
            )



            Image(
                painter = painterResource(entrepreneurshipBook.imageResourceId),
                contentDescription = stringResource(entrepreneurshipBook.stringResourceId ),
                modifier = Modifier
                    .fillMaxWidth()
                    .fillMaxHeight()
                    .padding(20.dp)
                ,
                contentScale = ContentScale.Crop
            )

            Text(
                text = stringResource(entrepreneurshipBook.stringResourceId2),
                modifier = Modifier.padding(16.dp),
                style = MaterialTheme.typography.h6
            )


        }
    }
}

@Preview
@Composable
private fun BookCardPreview(){


        BookCard(EntrepreneurshipBook(R.string.book1,R.string.des1,R.drawable.image1))

}

@Composable
private fun BooksList(booksList: List<EntrepreneurshipBook>) {

    LazyColumn {
        items(booksList){
            entrepreneurshipBook->
            BookCard(entrepreneurshipBook = entrepreneurshipBook)
        }
    }
}






