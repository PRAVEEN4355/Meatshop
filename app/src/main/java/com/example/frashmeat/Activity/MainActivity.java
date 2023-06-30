package com.example.frashmeat.Activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.annotation.SuppressLint;
import android.os.Bundle;

import com.example.frashmeat.Adapter.CategoryAdapter;
import com.example.frashmeat.Adapter.PopularAdapter;
import com.example.frashmeat.Domain.CategoryDomain;
import com.example.frashmeat.Domain.MeatDomain;
import com.example.frashmeat.R;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView.Adapter adapter1,adapter2;
    private RecyclerView recyclerViewCategoryList,recyclerViewPopularList;
    private String categoryList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerViewCategory();
        recyclerViewPopular();

    }

    private void recyclerViewPopular() {
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false);
        recyclerViewPopularList =findViewById(R.id.itemview2);
        recyclerViewPopularList.setLayoutManager(linearLayoutManager);
        ArrayList<MeatDomain> Meatlist= new ArrayList<>();
        Meatlist.add(new MeatDomain("Full Leg","chleg3","Reduce stress,promote heart health,strength bones,maintain body weight,boost immunity power",150.0,5,20,256));
        Meatlist.add(new MeatDomain("Mutton Boneless","mutton_boneless1","Rich source of Iron,Low Calories,Potassium,qualityof proutein,Low Cholesterol",450.0,5,20,856));
        Meatlist.add(new MeatDomain("Fish Boneless","fish_boneless","Low fat,high quality protein,calcium,phosphorus,minerals,iron,zinc,iodine,magnesium,potassium.",250,5,20,140));
        Meatlist.add(new MeatDomain("Full Chicken","fullch1","Vitamin B12,Tryptophan,Choline,Zinc,Iron,Copper",180.0,5,20,256));
        Meatlist.add(new MeatDomain("Prawn","prawn","Vitamin B12,Tryptophan,Choline,Zinc,Iron,Copper",200.0,5,20,256));
        adapter2 = new PopularAdapter(Meatlist);
        recyclerViewPopularList.setAdapter(adapter2);
    }

    @SuppressLint("WrongViewCast")
    private void recyclerViewCategory() {
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false);
        recyclerViewCategoryList =findViewById(R.id.itemview);
        recyclerViewCategoryList.setLayoutManager(linearLayoutManager);

        ArrayList<CategoryDomain> CategoryList= new ArrayList<>();
        CategoryList.add(new CategoryDomain("Chicken Leg","chicken"));
        CategoryList.add(new CategoryDomain("Mutton","Mutton"));
        CategoryList.add(new CategoryDomain("Fish","Fish"));
//        CategoryList.add(new CategoryDomain("Chest chicken","Chest chicken"));
//        CategoryList.add(new CategoryDomain("Fish boneless","Fish boneless"));
        CategoryList.add(new CategoryDomain("Prawn","prawn"));


        adapter1= new CategoryAdapter(CategoryList);
        recyclerViewCategoryList.setAdapter(adapter1);

    }
}