package in.poshost.posapp.fragment.reciept;

import in.poshost.posapp.R;
import in.poshost.posapp.activities.MainActivity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Button;

public class RecieptFragment extends Fragment {

	private final static String tag = "in.poshost.posapp.fragment.payment.PaymentDetailsFragment";

	public RecieptFragment() {
	}

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		View rootView = inflater.inflate(R.layout.fragment_reciept, container,
				false);

		setupViews(rootView);

		return rootView;
	}

	private void setupViews(View rootView) {
		Button btnNoReciept = (Button) rootView.findViewById(R.id.btnNoReciept);
		btnNoReciept.setOnClickListener(getNoRecieptButtonListener());
	}

	private OnClickListener getNoRecieptButtonListener() {
		return new OnClickListener() {
			@Override
			public void onClick(View arg0) {
				Log.i(tag, "No reciept button clicked");

				Intent in = new Intent(getActivity(), MainActivity.class);
				in.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
				startActivity(in);
			}
		};
	}

}