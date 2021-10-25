package com.example.lab5;


/**
 * Created by Miguel Garzón on 2017-05-09.
 */
import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

public class ProductList extends ArrayAdapter<Product> {
    private Activity context;
    List<Product> products;

    public ProductList(Activity context, List<Product> products) {
        super(context, R.layout.support_simple_spinner_dropdown_item, products);
        this.context = context;
        this.products = products;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = context.getLayoutInflater();
        View listViewItem = inflater.inflate(R.layout.support_simple_spinner_dropdown_item, null, true);

        TextView textViewName = (TextView) listViewItem.findViewById(R.id.editTextName);
        TextView textViewPrice = (TextView) listViewItem.findViewById(R.id.editTextPrice);

        Product product = products.get(position);
        textViewName.setText(product.getProductName());
        textViewPrice.setText(String.valueOf(product.getPrice()));
        return listViewItem;
    }
}

