package com.example.mq12.listadesplegableconbotonesandroid;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import android.widget.ExpandableListView;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private ExpandableListView listView;
    private ExpandableListAdapter listAdapter;
    private List<List<String>> participantes = new ArrayList<List<String>>();    // lista de participantes tugambeta.com
    private List<String> encabezado;
    private HashMap<String, List<String>> listHash;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView = (ExpandableListView) findViewById(R.id.lvExp);

        initData();
        listAdapter = new ExpandableListAdapter(this, encabezado, listHash);
        listView.setAdapter(listAdapter);
    }

    private void initData() {
        encabezado = new ArrayList<>();
        listHash = new HashMap<>();

        encabezado.add("1 ");
        encabezado.add("2 ");
        encabezado.add("3 ");
        encabezado.add("4 ");
        encabezado.add("5");
        encabezado.add("6");
        encabezado.add("7");
        encabezado.add("8");
        encabezado.add("9");
        encabezado.add("10");
        encabezado.add("11");
        encabezado.add("12");
        encabezado.add("13");
        encabezado.add("14");
        encabezado.add("15");
        encabezado.add("16");

        List<String> corona1 = new ArrayList<>();
        corona1.add(" Morelia G");
        corona1.add(" Tijuana P");
        corona1.add("Lobos BUAP E");
        corona1.add("Tigres G ");
        corona1.add("Leon G ");
        corona1.add("America G ");
        corona1.add("Guadalajara P ");
        corona1.add("UNAM E");
        corona1.add("Veracruz G");
        participantes.add(corona1);
        List<String> corona2 = new ArrayList<>();
        corona2.add(" Morelia G");
        corona2.add(" Tijuana P");
        corona2.add("Lobos BUAP E");
        corona2.add("Tigres G ");
        corona2.add("Leon G ");
        corona2.add("America G ");
        corona2.add("Guadalajara P ");
        corona2.add("UNAM E");
        corona2.add("Veracruz G");
        participantes.add(corona2);
        List<String> corona3 = new ArrayList<>();
        corona3.add(" Morelia G");
        corona3.add(" Tijuana P");
        corona3.add("Lobos BUAP E");
        corona3.add("Tigres G ");
        corona3.add("Leon G ");
        corona3.add("America G ");
        corona3.add("Guadalajara P ");
        corona3.add("UNAM E");
        corona3.add("Veracruz G");
        participantes.add(corona3);
        List<String> corona4 = new ArrayList<>();
        corona4.add(" Morelia G");
        corona4.add(" Tijuana P");
        corona4.add("Lobos BUAP E");
        corona4.add("Tigres G ");
        corona4.add("Leon G ");
        corona4.add("America G ");
        corona4.add("Guadalajara P ");
        corona4.add("UNAM E");
        corona4.add("Veracruz G");
        participantes.add(corona4);
        List<String> corona5 = new ArrayList<>();
        corona5.add(" Morelia G");
        corona5.add(" Tijuana P");
        corona5.add("Lobos BUAP E");
        corona5.add("Tigres G ");
        corona5.add("Leon G ");
        corona5.add("America G ");
        corona5.add("Guadalajara P ");
        corona5.add("UNAM E");
        corona5.add("Veracruz G");
        participantes.add(corona5);
        List<String> corona6 = new ArrayList<>();
        corona6.add(" Morelia G");
        corona6.add(" Tijuana P");
        corona6.add("Lobos BUAP E");
        corona6.add("Tigres G ");
        corona6.add("Leon G ");
        corona6.add("America G ");
        corona6.add("Guadalajara P ");
        corona6.add("UNAM E");
        corona6.add("Veracruz G");
        participantes.add(corona6);
        List<String> corona7 = new ArrayList<>();
        corona7.add(" Morelia G");
        corona7.add(" Tijuana P");
        corona7.add("Lobos BUAP E");
        corona7.add("Tigres G ");
        corona7.add("Leon G ");
        corona7.add("America G ");
        corona7.add("Guadalajara P ");
        corona7.add("UNAM E");
        corona7.add("Veracruz G");
        participantes.add(corona7);
        List<String> corona8 = new ArrayList<>();
        corona8.add(" Morelia G");
        corona8.add(" Tijuana P");
        corona8.add("Lobos BUAP E");
        corona8.add("Tigres G ");
        corona8.add("Leon G ");
        corona8.add("America G ");
        corona8.add("Guadalajara P ");
        corona8.add("UNAM E");
        corona8.add("Veracruz G");
        participantes.add(corona8);
        List<String> corona9 = new ArrayList<>();
        corona9.add(" Morelia G");
        corona9.add(" Tijuana P");
        corona9.add("Lobos BUAP E");
        corona9.add("Tigres G ");
        corona9.add("Leon G ");
        corona9.add("America G ");
        corona9.add("Guadalajara P ");
        corona9.add("UNAM E");
        corona9.add("Veracruz G");
        participantes.add(corona9);
        List<String> corona10 = new ArrayList<>();
        corona10.add(" Morelia G");
        corona10.add(" Tijuana P");
        corona10.add("Lobos BUAP E");
        corona10.add("Tigres G ");
        corona10.add("Leon G ");
        corona10.add("America G ");
        corona10.add("Guadalajara P ");
        corona10.add("UNAM E");
        corona10.add("Veracruz G");
        participantes.add(corona10);
        List<String> corona11 = new ArrayList<>();
        corona11.add(" Morelia G");
        corona11.add(" Tijuana P");
        corona11.add("Lobos BUAP E");
        corona11.add("Tigres G ");
        corona11.add("Leon G ");
        corona11.add("America G ");
        corona11.add("Guadalajara P ");
        corona11.add("UNAM E");
        corona11.add("Veracruz G");
        participantes.add(corona11);
        List<String> corona12 = new ArrayList<>();
        corona12.add(" Morelia G");
        corona12.add(" Tijuana P");
        corona12.add("Lobos BUAP E");
        corona12.add("Tigres G ");
        corona12.add("Leon G ");
        corona12.add("America G ");
        corona12.add("Guadalajara P ");
        corona12.add("UNAM E");
        corona12.add("Veracruz G");
        participantes.add(corona12);
        List<String> corona13 = new ArrayList<>();
        corona13.add(" Morelia G");
        corona13.add(" Tijuana P");
        corona13.add("Lobos BUAP E");
        corona13.add("Tigres G ");
        corona13.add("Leon G ");
        corona13.add("America G ");
        corona13.add("Guadalajara P ");
        corona13.add("UNAM E");
        corona13.add("Veracruz G");
        participantes.add(corona13);
        List<String> corona14 = new ArrayList<>();
        corona14.add(" Morelia G");
        corona14.add(" Tijuana P");
        corona14.add("Lobos BUAP E");
        corona14.add("Tigres G ");
        corona14.add("Leon G ");
        corona14.add("America G ");
        corona14.add("Guadalajara P ");
        corona14.add("UNAM E");
        corona14.add("Veracruz G");
        participantes.add(corona14);
        List<String> corona15 = new ArrayList<>();
        corona15.add(" Morelia G");
        corona15.add(" Tijuana P");
        corona15.add("Lobos BUAP E");
        corona15.add("Tigres G ");
        corona15.add("Leon G ");
        corona15.add("America G ");
        corona15.add("Guadalajara P ");
        corona15.add("UNAM E");
        corona15.add("Veracruz G");
        participantes.add(corona15);
        List<String> corona16 = new ArrayList<>();
        corona16.add(" Morelia G");
        corona16.add(" Tijuana P");
        corona16.add("Lobos BUAP E");
        corona16.add("Tigres G ");
        corona16.add("Leon G ");
        corona16.add("America G ");
        corona16.add("Guadalajara P ");
        corona16.add("UNAM E");
        corona16.add("Veracruz G");
        participantes.add(corona16);

        for (int i = 0; i < encabezado.size(); i++) {
            listHash.put(encabezado.get(i), participantes.get(0)); // se llena el listHast de participantes. encabezado y participantes deben tener el mismo tamaño

        }

    }
}