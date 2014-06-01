package in.poshost.posapp.fragment.payment;

import in.poshost.posapp.R;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class PaymentDetailsFragment extends Fragment {

	private final static String tag = "in.poshost.posapp.fragment.payment.PaymentDetailsFragment";

	public PaymentDetailsFragment() {
	}

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		View rootView = inflater.inflate(R.layout.fragment_payment_detail,
				container, false);

		// Button button = (Button) findViewById(R.id.);
		return rootView;
	}
}