package com.poutchinskaya.malik.sotunisia.Presentation.Home;

import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.Toast;

import com.poutchinskaya.malik.sotunisia.Presentation.VocabulaireController;
import com.poutchinskaya.malik.sotunisia.R;

/**
 * Created by Malik on 26/11/2015.
 */
public class HomeFragment extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        // Inflate the layout for this fragment
        final View rootView = inflater.inflate(R.layout.fragement_choix_home, container, false);

        // VOCABULAIRE
        final ImageView loginButtonVocab = (ImageView) rootView.findViewById(R.id.imageViewVocab);
        loginButtonVocab.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(rootView.getContext(), VocabulaireController.class);
                startActivity(intent);
            }
        });



        // PRONONCIATION
        final ImageView loginButtonPrononciation = (ImageView) rootView.findViewById(R.id.imageViewPrononciation);
        loginButtonPrononciation.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
               // Intent intent = new Intent(rootView.getContext(), VocabulaireController.class);
               // startActivity(intent);
                Toast.makeText(rootView.getContext(),"Coming soon...",Toast.LENGTH_LONG).show();
            }
        });



        // Grammaire
        final ImageView loginButtonGrammaire = (ImageView) rootView.findViewById(R.id.imageViewGrammaire);
        loginButtonGrammaire.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // Intent intent = new Intent(rootView.getContext(), VocabulaireController.class);
                // startActivity(intent);
                Toast.makeText(rootView.getContext(),"Coming soon...",Toast.LENGTH_LONG).show();
            }
        });

        // PHRASES
        final ImageView loginButtonPhrases = (ImageView) rootView.findViewById(R.id.imageViewPhrases);
        loginButtonPhrases.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // Intent intent = new Intent(rootView.getContext(), VocabulaireController.class);
                // startActivity(intent);
                Toast.makeText(rootView.getContext(),"Coming soon...",Toast.LENGTH_LONG).show();
            }
        });


        return rootView;
    }
}