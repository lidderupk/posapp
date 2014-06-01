package in.poshost.posapp.fragment.main;

import in.poshost.posapp.R;
import in.poshost.posapp.activities.PaymentActivity;
import in.poshost.posapp.activities.TransactionActivity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Button;

public class TransactionFragment extends Fragment {

	private static String tag = "in.poshost.posapp.fragment.TransactionFragment";

	public TransactionFragment() {
	}

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		View rootView = inflater.inflate(R.layout.fragment_main_transaction,
				container, false);
		setupView(rootView);
		return rootView;
	}

	private void setupView(View rootView) {
		Button btnTransaction = (Button) rootView
				.findViewById(R.id.btnTransaction);
		btnTransaction.setOnClickListener(getTrasnactionButtonListener());

		Button btnPayment = (Button) rootView.findViewById(R.id.btnPayment);
		btnPayment.setOnClickListener(getPaymentButtonListener());
	}

	private OnClickListener getTrasnactionButtonListener() {
		return new OnClickListener() {
			@Override
			public void onClick(View arg0) {
				Log.i(tag, "Transaction button clicked");

				Intent in = new Intent(getActivity(), TransactionActivity.class);
				startActivity(in);
			}
		};
	}

	private OnClickListener getPaymentButtonListener() {
		return new OnClickListener() {

			@Override
			public void onClick(View arg0) {
				Log.i(tag, "Transaction button clicked");

				Intent in = new Intent(getActivity(), PaymentActivity.class);
				startActivity(in);
			}
		};
	}

}