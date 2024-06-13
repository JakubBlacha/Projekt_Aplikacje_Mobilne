package com.example.notatki;

import androidx.cardview.widget.CardView;

import com.example.notatki.Models.Notes;

public interface NotesClickListener {
    void onClick(Notes notes);
    void onLongClick(Notes notes, CardView cardView);
}
