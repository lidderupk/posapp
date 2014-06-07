package in.poshost.posapp.fragment.transaction;

import in.poshost.posapp.R;
import in.poshost.posapp.model.Transaction;

import java.util.ArrayList;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

public class TransactionAdapter extends ArrayAdapter<Transaction> {

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

		TextView tvName = (TextView) convertView.findViewById(R.id.tvName);
		TextView tvDesc = (TextView) convertView.findViewById(R.id.tvDesc);

		tvName.setText(t.getName());
		tvDesc.setText(t.getDesc());

		return convertView;
	}
}
