package in.poshost.posapp.fragment.payment;

import in.poshost.posapp.R;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class PaymentTypeFragment extends Fragment {
	
	private final static String tag = "in.poshost.posapp.fragment.payment.PaymentTypeFragment";

		public PaymentTypeFragment() {
		}

		@Override
		public View onCreateView(LayoutInflater inflater, ViewGroup container,
				Bundle savedInstanceState) {
			View rootView = inflater.inflate(R.layout.fragment_payment_type, container,
					false);
			return rootView;
		}
	}