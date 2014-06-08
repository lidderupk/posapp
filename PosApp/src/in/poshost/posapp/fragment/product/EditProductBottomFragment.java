
package in.poshost.posapp.fragment.product;

import in.poshost.posapp.R;
import in.poshost.posapp.activities.RecieptActivity;
import in.poshost.posapp.model.Transaction;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class EditProductBottomFragment extends Fragment {

    private final static String tag = "in.poshost.posapp.fragment.product.EditProductBottomFragment";

    public EditProductBottomFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_edit_product_bottom,
                container, false);
        
        setupViews(rootView);       
        return rootView;
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
    
    private OnClickListener getReturnButtonListener() {
        return new OnClickListener() {
            @Override
            public void onClick(View arg0) {
                Log.i(tag, "return button clicked");
                getActivity().finish();
            }
        };
    }

    private void setupViews(View rootView){
        Button btnEditProductPaymentFinal = (Button) rootView
                .findViewById(R.id.btnEditProductPaymentFinal);
        btnEditProductPaymentFinal.setOnClickListener(getPaymentFinalButtonListener());

        Button btnEditProductReturn = (Button) rootView.findViewById(R.id.btnEditProductReturn);
        btnEditProductReturn.setOnClickListener(getReturnButtonListener());
    }
}
