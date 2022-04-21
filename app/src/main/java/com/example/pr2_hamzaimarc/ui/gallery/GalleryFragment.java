package com.example.pr2_hamzaimarc.ui.gallery;

import android.os.Bundle;

import android.os.Bundle;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.example.pr2_hamzaimarc.R;
import com.example.pr2_hamzaimarc.databinding.FragmentGalleryBinding;

public class GalleryFragment extends Fragment {

    private FragmentGalleryBinding binding;

    private String[] sistemas = { "Android", "Ubuntu", "Mac OSX", "Windows",
            "Solaris", "Windows 8", "Ubuntu 12.04", "Windows Phone",
            "Windows 7", "Kubuntu", "Ubuntu 12.10" };

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        /*GalleryViewModel galleryViewModel =
                new ViewModelProvider(this).get(GalleryViewModel.class);

        binding = FragmentGalleryBinding.inflate(inflater, container, false);
        View root = binding.getRoot();*/


        return inflater.inflate(R.layout.fragment_gallery, container, false);




    }

    @Override
    /*public void onCreate(Bundle savedInstanceState) {
        // TODO Auto-generated method stub
        super.onCreate(savedInstanceState);

        // Establecemos el Adapter a la Lista del Fragment
        setListAdapter(new ArrayAdapter<String>(getActivity(),
                android.R.layout.simple_list_item_1, sistemas));
    }

    @Override
    public void onListItemClick(ListView l, View v, int position, long id) {
        // TODO Auto-generated method stub
        super.onListItemClick(l, v, position, id);

        // Mostramos un mensaje con el elemento pulsado
        Toast.makeText(getActivity(), "Ha pulsado " + sistemas[position],
                Toast.LENGTH_SHORT).show();
    }*/


    //@Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}