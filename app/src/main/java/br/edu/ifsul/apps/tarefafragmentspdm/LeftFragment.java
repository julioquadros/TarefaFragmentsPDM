package br.edu.ifsul.apps.tarefafragmentspdm;

import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

/**
 * Created by julio on 27/04/17.
 */

public class LeftFragment extends Fragment {

    private ListView lvAnimais;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedIntanceState) {
        View view;
        view = inflater.inflate( R.layout.fragment_left, null );

         lvAnimais = (ListView) view.findViewById( R.id.lvAnimais );

         lvAnimais.setOnItemClickListener( new AdapterView.OnItemClickListener() {

             @Override
             public void onItemClick(AdapterView<?> adapter, View v, int position,
                                     long id) {

                  tratarSelecao( position );

             }

              } );

         return view;
         }//fim do método onCreateView

             protected void tratarSelecao( int position ) {
         String descricao = lvAnimais.getItemAtPosition( position ).toString();

         FragmentManager fm = getFragmentManager();

         RightFragment rf = (RightFragment) fm.findFragmentById( R.id.rightFragment );

         rf.setConteudo( position, descricao );
         } //fim do método tratarSelecao



}
