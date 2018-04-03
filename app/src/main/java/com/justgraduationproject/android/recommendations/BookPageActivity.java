package com.justgraduationproject.android.recommendations;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class BookPageActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_book_page);
    }

    public void Navigate(View v)
    {
        Intent i = new Intent(this , AuthorProfileActivity.class);

        startActivity(i);
    }

}
