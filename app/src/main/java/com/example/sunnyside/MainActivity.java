package com.example.sunnyside;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.imageview.ShapeableImageView;
import com.google.android.material.navigation.NavigationView;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "MainActivity";

    private ImageView image_header, image_transform, white_space1, logo, icon_hamburger, icon_arrow_down, image_stand_out;
    private ImageView white_space2, image_graphic_design, image_photography, white_space3, jennie;
    private ShapeableImageView emily, thomas;
    private ImageView image_gallery_milkbottles, image_gallery_orange, image_gallery_cone, image_gallery_sugar_cubes;
    private ImageView footer, logo2;
    private ImageButton facebook, instagram, pinterest, twitter;
    private RelativeLayout mainRel,relFooter;
    private ScrollView scrollView;
    private LinearLayout linear1, linear2, linear3, linear4;
    private TextView we_are_creative, transform_your_brand, we_are, stand, using, graphic_design, great, photography, increase;
    private TextView client, we_put, emily_r, marketing, sunnyside, thomas_s, coo, incredible, jennie_f, owner;
    private TextView about, services, projects, develop;
    private NavigationView navigationView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initView();

        icon_hamburger.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent;
                Toast.makeText(MainActivity.this, "Hamburger selected", Toast.LENGTH_SHORT).show();
            }
        });
    }

    private void initView() {
        Log.d(TAG, "initView: Started");

        image_header = findViewById(R.id.image_header);
        image_transform = findViewById(R.id.image_transform);
        white_space1 = findViewById(R.id.white_space1);
        logo = findViewById(R.id.logo);
        icon_hamburger = findViewById(R.id.icon_hamburger);
        icon_arrow_down = findViewById(R.id.icon_arrow_down);
        image_stand_out = findViewById(R.id.image_stand_out);
        white_space2 = findViewById(R.id.white_space2);
        image_graphic_design = findViewById(R.id.image_graphic_design);
        image_photography = findViewById(R.id.image_photography);
        white_space3 = findViewById(R.id.white_space3);
        jennie = findViewById(R.id.jennie);
        emily = findViewById(R.id.emily);
        thomas = findViewById(R.id.thomas);
        image_gallery_milkbottles = findViewById(R.id.image_gallery_milkbottles);
        image_gallery_orange = findViewById(R.id.image_gallery_orange);
        image_gallery_cone = findViewById(R.id.image_gallery_cone);
        image_gallery_sugar_cubes = findViewById(R.id.image_gallery_sugar_cubes);
        footer = findViewById(R.id.footer);
        logo2 = findViewById(R.id.logo2);
        facebook = findViewById(R.id.facebook);
        instagram = findViewById(R.id.instagram);
        pinterest = findViewById(R.id.pinterest);
        twitter = findViewById(R.id.twitter);
        mainRel = findViewById(R.id.mainRel);
        relFooter = findViewById(R.id.relFooter);
        linear1 = findViewById(R.id.linear1);
        linear2 = findViewById(R.id.linear2);
        linear3 = findViewById(R.id.linear3);
        linear4 = findViewById(R.id.linear4);
        we_are_creative = findViewById(R.id.we_are_creative);
        transform_your_brand = findViewById(R.id.transform_your_brand);
        we_are = findViewById(R.id.we_are);
        stand = findViewById(R.id.stand);
        using = findViewById(R.id.using);
        graphic_design = findViewById(R.id.graphic_design);
        great = findViewById(R.id.great);
        photography = findViewById(R.id.photography);
        increase = findViewById(R.id.increase);
        client = findViewById(R.id.client);
        we_put = findViewById(R.id.we_put);
        emily_r = findViewById(R.id.emily_r);
        marketing = findViewById(R.id.marketing);
        sunnyside = findViewById(R.id.sunnyside);
        thomas_s = findViewById(R.id.thomas_s);
        coo = findViewById(R.id.coo);
        incredible = findViewById(R.id.incredible);
        jennie_f = findViewById(R.id.jennie_f);
        owner = findViewById(R.id.owner);
        about = findViewById(R.id.about);
        services = findViewById(R.id.services);
        projects = findViewById(R.id.projects);
        develop = findViewById(R.id.develop);
        navigationView = findViewById(R.id.navigationView);
    }
}