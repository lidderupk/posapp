
package in.poshost.posapp.fragment.transaction;

import in.poshost.posapp.R;
import in.poshost.posapp.model.Transaction;

import java.util.ArrayList;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
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
    }

    private void populateTransactions() {
        if (transactions == null)
            transactions = new ArrayList<Transaction>();

        for (int i = 0; i < 25; i++) {
            Transaction t = new Transaction();
            t.setUid(i);
            t.setName("name: " + i);
            t.setDesc("desc: " + i);
            transactions.add(t);
        }
    }
}
