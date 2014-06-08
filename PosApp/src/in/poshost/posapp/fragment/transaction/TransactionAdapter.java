
package in.poshost.posapp.fragment.transaction;

import in.poshost.posapp.R;
import in.poshost.posapp.model.Transaction;

import java.util.ArrayList;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class TransactionAdapter extends ArrayAdapter<Transaction> {

    private final static String tag = "in.poshost.posapp.fragment.transaction.TransactionAdapter";

    public TransactionAdapter(Context context,
            ArrayList<Transaction> transactions) {
        super(context, R.layout.item_transaction, transactions);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        Transaction t = getItem(position);

        if (convertView == null)
            convertView = LayoutInflater.from(getContext()).inflate(
                    R.layout.item_transaction, parent, false);

        setupView(convertView, t);

        return convertView;
    }

    private void setupView(View convertView, Transaction t) {
        ImageView ivItemPic = (ImageView) convertView
                .findViewById(R.id.ivItemPic);
        TextView tvItemName = (TextView) convertView
                .findViewById(R.id.tvItemName);
        TextView tvItemDesc = (TextView) convertView
                .findViewById(R.id.tvItemDesc);
        TextView tvItemPrice = (TextView) convertView
                .findViewById(R.id.tvItemPrice);
        TextView tvItemQty = (TextView) convertView
                .findViewById(R.id.tvItemQty);
        TextView tvItemTotal = (TextView) convertView
                .findViewById(R.id.tvItemTotal);

        tvItemName.setText(t.getName());
        tvItemDesc.setText(t.getDesc());
        tvItemPrice.setText(String.valueOf(t.getPrice()));
        tvItemQty.setText(String.valueOf(t.getQuantity()));
        tvItemTotal.setText(String.valueOf(t.getPrice() * t.getQuantity()));
    }
}
