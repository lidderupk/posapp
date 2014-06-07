
package in.poshost.posapp.fragment.payment;

import in.poshost.posapp.R;
import in.poshost.posapp.activities.MainActivity;
import in.poshost.posapp.activities.RecieptActivity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Button;

public class PaymentBottomFragment extends Fragment {

    private final static String tag = "in.poshost.posapp.fragment.payment.PaymentBottomFragment";

    public PaymentBottomFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_payment_bottom,
                container, false);
        setupView(rootView);
        return rootView;
    }

    private void setupView(View rootView) {
        Button btnPaymentFinal = (Button) rootView
                .findViewById(R.id.btnPaymentFinal);
        btnPaymentFinal.setOnClickListener(getPaymentFinalButtonListener());

        Button btnCamera = (Button) rootView.findViewById(R.id.btnCamera);
        btnCamera.setOnClickListener(getCameraButtonListener());
    }

    private OnClickListener getPaymentFinalButtonListener() {
        return new OnClickListener() {
            @Override
            public void onClick(View arg0) {
                Log.i(tag, "final payment button clicked");

                Intent in = new Intent(getActivity(), RecieptActivity.class);
                startActivity(in);
            }
        };
    }

    private OnClickListener getCameraButtonListener() {
        return new OnClickListener() {
            @Override
            public void onClick(View arg0) {
                Log.i(tag, "camera button clicked");

                Intent in = new Intent(getActivity(), MainActivity.class);
                in.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(in);
            }
        };
    }
}
