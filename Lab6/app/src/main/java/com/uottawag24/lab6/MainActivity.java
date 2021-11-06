package com.uottawag24.lab6;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView idView;
    EditText productBox;
    EditText skuBox;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        idView = (TextView) findViewById(R.id.productID);
        productBox = (EditText) findViewById(R.id.productName);
        skuBox = (EditText) findViewById(R.id.productSku);
        final Button bAdd = findViewById(R.id.btnAdd);
        bAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                newProduct(v);
            }
        });
        final Button bRem = findViewById(R.id.btnDelete);
        bRem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                removeProduct(v);
            }
        });
        final Button bLook = findViewById(R.id.btnFind);
        bLook.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                lookupProduct(v);
            }
        });
    }

    public void newProduct (View view) {
        MyDBHandler dbHandler = new MyDBHandler(this);
        Product product = new Product(productBox.getText().toString(),Integer.parseInt(skuBox.getText().toString()));
        dbHandler.addProduct(product);

    }

    public void lookupProduct (View view) {
        MyDBHandler dbHandler = new MyDBHandler(this);
        Product product =dbHandler.findProduct(productBox.getText().toString());

    }

    public void removeProduct (View view) {
        MyDBHandler dbHandler = new MyDBHandler(this);
        boolean result =dbHandler.deleteProduct(productBox.getText().toString());

    }

    public void about (View view) {
        Intent aboutIntent = new Intent(this, About.class);
        startActivity(aboutIntent);
    }


}