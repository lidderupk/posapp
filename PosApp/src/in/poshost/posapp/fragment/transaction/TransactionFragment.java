
package in.poshost.posapp.fragment.transaction;

import in.poshost.posapp.R;
import in.poshost.posapp.activities.EditProductActivity;
import in.poshost.posapp.model.Transaction;

import java.util.ArrayList;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ListView;

public class TransactionFragment extends Fragment {

    private final static String tag = "in.poshost.posapp.fragment.transaction.TransactionFragment";

    private ArrayList<Transaction> transactions;
    // private ArrayAdapter<Transaction> aTransaction;
    private ListView lvTransactions;

    public TransactionFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_transaction,
                container, false);

        populateTransactions();

        setupView(rootView);
        return rootView;
    }

    private void setupView(View rootView) {
        lvTransactions = (ListView) rootView.findViewById(R.id.lvTransactions);
        TransactionAdapter ad = new TransactionAdapter(getActivity(),
                transactions);
        // aTransaction = new ArrayAdapter<Transaction>(this.getActivity(),
        // android.R.layout.simple_list_item_1, transactions);
        lvTransactions.setAdapter(ad);
        lvTransactions.setOnItemClickListener(getItemClickListener());
    }

    private OnItemClickListener getItemClickListener() {
        return new OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Log.i(tag, "item clicked");
                Intent in = new Intent(getActivity(), EditProductActivity.class);
                in.putExtra("TRANSACTION", transactions.get(position));
                startActivity(in);
            }
        };
    }

    private void populateTransactions() {
        if (transactions == null)
            transactions = new ArrayList<Transaction>();

        for (int i = 0; i < 25; i++) {
            Transaction t = new Transaction();
            t.setUid(i);
            t.setName("Item name: " + i);
            t.setDesc("Item desc: " + i);
            t.setPrice(10 * i);
            t.setQuantity(i);
            transactions.add(t);
        }
    }
}
