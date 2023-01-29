package com.example.niversaver.Persistence;

import com.example.niversaver.Model.Aniversariante;

import java.util.ArrayList;
import java.util.List;

public class NiverDAO {
    List<Aniversariante> listaNivers = new ArrayList<>();

    public void add(Aniversariante niver){
        listaNivers.add(niver);
    }

    public void remove(Aniversariante niver){
        listaNivers.remove(niver);
    }

    public List<Aniversariante> readAll(){
        return new ArrayList<>(listaNivers);
    }


}
