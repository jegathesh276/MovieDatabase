package com.example.moviedatabase

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val movieListingFragment = MovieListingFragment()
        supportFragmentManager.beginTransaction()
            .add(R.id.root, movieListingFragment, Constants.MOVIE_LISTING_FRAGMENT_TAG)
            .commit()
    }
}
