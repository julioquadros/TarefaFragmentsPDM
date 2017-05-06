package br.edu.ifsul.apps.tarefafragmentspdm;

import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

 public class RightFragment extends Fragment {

             private int imagens_id[] = { R.drawable.curucaca,
             R.drawable.gralhaazul,
             R.drawable.graxaim,
             R.drawable.ourico,
             R.drawable.queroquero };

             private ImageView imAnimal;
     private TextView tvDescricao;

     @Override
     public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedIntanceState) {

        View view = inflater.inflate( R.layout.fragment_right, null );
         imAnimal = (ImageView) view.findViewById( R.id.imAnimal );
         tvDescricao = (TextView) view.findViewById( R.id.tvDescricao );

         imAnimal.setScaleType(ImageView.ScaleType.FIT_XY);

         return view;
          }//fim do método onCreateView

      public void setConteudo( int pos, String descricao ) {
      imAnimal.setImageResource( imagens_id[ pos ] );
      tvDescricao.setText( descricao );
      }//fim do método setConteudo
}
