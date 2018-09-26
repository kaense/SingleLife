package com.sample.singlelife;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.support.v7.app.AppCompatActivity;
import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.text.TextWatcher;
import android.widget.EditText;
import android.widget.TextView;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;

public class MainActivity extends AppCompatActivity implements TextWatcher {
    EditText pension, income, rent, food, heating, communication, social, etc, inhabitant, health, salarytax, taxetc;
    TextView kekka;
    //, bikou;

    static protected SharedPreferences sharedPreferences;
    static protected SharedPreferences.Editor editor;
    static protected int key_pension, key_income, key_rent, key_food, key_heating, key_communication, key_social, key_etc
            , key_inhabitant, key_health, key_salarytax, key_taxetc;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        kekka = (TextView) findViewById(R.id.kekka);
        //bikou = (TextView) findViewById(R.id.kekka);

        pension = (EditText) findViewById(R.id.pension);
        income = (EditText) findViewById(R.id.income);
        rent = (EditText) findViewById(R.id.rent);
        food = (EditText) findViewById(R.id.food);
        heating = (EditText) findViewById(R.id.heating);
        health = (EditText) findViewById(R.id.health);
        communication = (EditText) findViewById(R.id.communication);
        social = (EditText) findViewById(R.id.social);
        etc = (EditText) findViewById(R.id.etc);
        inhabitant = (EditText) findViewById(R.id.inhabitant);
        salarytax = (EditText) findViewById(R.id.salarytax);
        taxetc = (EditText) findViewById(R.id.taxetc);

        pension.addTextChangedListener(this);
        income.addTextChangedListener(this);
        rent.addTextChangedListener(this);
        food.addTextChangedListener(this);
        heating.addTextChangedListener(this);
        health.addTextChangedListener(this);
        communication.addTextChangedListener(this);
        social.addTextChangedListener(this);
        etc.addTextChangedListener(this);
        inhabitant.addTextChangedListener(this);
        salarytax.addTextChangedListener(this);
        taxetc.addTextChangedListener(this);

        sharedPreferences = PreferenceManager.getDefaultSharedPreferences(this);
        editor = sharedPreferences.edit();
        key_pension = sharedPreferences.getInt("key_pension", 0);
        key_income = sharedPreferences.getInt("key_income", 120000);
        key_rent = sharedPreferences.getInt("key_rent",50000);
        key_food = sharedPreferences.getInt("key_food",30000);
        key_heating = sharedPreferences.getInt("key_heating",10000);
        key_health = sharedPreferences.getInt("key_health",0);
        key_communication = sharedPreferences.getInt("key_communication",5000);
        key_social = sharedPreferences.getInt("key_social",0);
        key_etc = sharedPreferences.getInt("key_etc",0);
        key_inhabitant = sharedPreferences.getInt("key_inhabitant",0);
        key_salarytax = sharedPreferences.getInt("key_salarytax",0);
        key_taxetc = sharedPreferences.getInt("key_taxetc",0);

        pension.setText(String.valueOf(key_pension));
        income.setText(String.valueOf(key_income));
        rent.setText(String.valueOf(key_rent));
        food.setText(String.valueOf(key_food));
        heating.setText(String.valueOf(key_heating));
        health.setText(String.valueOf(key_health));
        communication.setText(String.valueOf(key_communication));
        social.setText(String.valueOf(key_social));
        etc.setText(String.valueOf(key_etc));
        inhabitant.setText(String.valueOf(key_inhabitant));
        salarytax.setText(String.valueOf(key_salarytax));
        taxetc.setText(String.valueOf(key_taxetc));


        MobileAds.initialize(getApplicationContext(), "");
        AdView mAdView = (AdView) findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);

    }

    @Override
    public void beforeTextChanged(CharSequence s, int start, int count, int after) {
    }

    @Override
    public void onTextChanged(CharSequence s, int start, int before, int count) {
    }

    @Override
    public void afterTextChanged(Editable s) {
        keisan();
    }

    public void keisan() {
        try {
            int pension, income, rent, food, heating, communication, social, etc, inhabitant, health, salarytax, taxetc;
            //int month = 0, year = 0;


            SpannableStringBuilder pensionText = (SpannableStringBuilder) this.pension.getText();
            pension = Integer.parseInt(pensionText.toString());
            SpannableStringBuilder incomeText = (SpannableStringBuilder) this.income.getText();
            income = Integer.parseInt(incomeText.toString());
            SpannableStringBuilder rentText = (SpannableStringBuilder) this.rent.getText();
            rent = Integer.parseInt(rentText.toString());
            SpannableStringBuilder foodText = (SpannableStringBuilder) this.food.getText();
            food = Integer.parseInt(foodText.toString());
            SpannableStringBuilder heatingText = (SpannableStringBuilder) this.heating.getText();
            heating = Integer.parseInt(heatingText.toString());
            SpannableStringBuilder communicationText = (SpannableStringBuilder) this.communication.getText();
            communication = Integer.parseInt(communicationText.toString());
            SpannableStringBuilder socialText = (SpannableStringBuilder) this.social.getText();
            social = Integer.parseInt(socialText.toString());
            SpannableStringBuilder etcText = (SpannableStringBuilder) this.etc.getText();
            etc = Integer.parseInt(etcText.toString());
            SpannableStringBuilder inhabitantText = (SpannableStringBuilder) this.inhabitant.getText();
            inhabitant = Integer.parseInt(inhabitantText.toString());
            SpannableStringBuilder healthText = (SpannableStringBuilder) this.health.getText();
            health = Integer.parseInt(healthText.toString());
            SpannableStringBuilder salarytaxText = (SpannableStringBuilder) this.salarytax.getText();
            salarytax = Integer.parseInt(salarytaxText.toString());
            SpannableStringBuilder taxetcText = (SpannableStringBuilder) this.taxetc.getText();
            taxetc = Integer.parseInt(taxetcText.toString());

            editor.putInt("key_pension",(int)pension);
            editor.putInt("key_income",(int)income);
            editor.putInt("key_rent",(int)rent);
            editor.putInt("key_food",(int)food);
            editor.putInt("key_heating",(int)heating);
            editor.putInt("key_communication",(int)communication);
            editor.putInt("key_social",(int)social);
            editor.putInt("key_etc",(int)etc);
            editor.putInt("key_inhabitant",(int)inhabitant);
            editor.putInt("key_health",(int)health);
            editor.putInt("key_salarytax",(int)salarytax);
            editor.putInt("key_taxetc",(int)taxetc);
            editor.apply();

            int sum = (int)( income -pension - rent - food - heating - communication - social - etc - inhabitant - health - salarytax - taxetc);
            if (sum>=0){
                kekka.setText(String.format("%,d", sum)+" 円黒字");
                kekka.setTextColor(getResources().getColor(R.color.colorPrimaryDark));
            }else {
                kekka.setText(String.format("%,d", -sum)+" 円赤字");
                kekka.setTextColor(getResources().getColor(R.color.colorAccent));
            }
        } catch (Exception e) {
        }
    }
}